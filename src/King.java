package src;

import java.util.ArrayList;
import java.util.List;

public class King {
    Square position;

    public King(Square startPosition) {
        this.position = startPosition;
    }

    public Result pathFinder(Board board, List<Square> visited, int currentStep, int currentWeight, Result bestResult) {
        // Si hemos visitado todas las casillas, comparamos el peso del recorrido actual
        if (visited.size() == board.getSize() * board.getSize()) {

            int totalWeight = currentWeight;
            if (bestResult == null || totalWeight < bestResult.getWeight()) {
                bestResult = new Result(new ArrayList<>(visited), totalWeight);
            }
            return bestResult;
        }

        List<Square> possibleMovements = possibleMovements(board);

        for (Square nextSquare : possibleMovements) {
            if (!visited.contains(nextSquare)) {  // Solo avanzamos si la casilla no ha sido visitada
                visited.add(nextSquare);

                int newWeight = currentWeight + currentStep * nextSquare.getWeight();

                this.position = nextSquare;

                // Llamada recursiva al siguiente paso
                bestResult = pathFinder(board, visited, currentStep + 1, newWeight, bestResult);

                // Backtracking: deshacemos el movimiento y restauramos la posición anterior
                visited.remove(visited.size() - 1);
                this.position = visited.get(visited.size() - 1);  // Volver a la posición anterior
            }
        }

        return bestResult;
    }

    public List<Square> possibleMovements(Board board) {
        Square kingPosition = this.position;
        int n = board.getSize();
        List<Square> possibleMovements = new ArrayList<>();

        int kingX = kingPosition.getX();
        int kingY = kingPosition.getY();

        for (int x = kingX - 1; x <= kingX + 1; x++) {
            for (int y = kingY - 1; y <= kingY + 1; y++) {
                // Evitar salir del tablero
                if (x >= 0 && x < n && y >= 0 && y < n) {
                    // Evitar agregar la posición del rey mismo
                    if (x != kingX || y != kingY) {
                        Square temp = board.getSquare(x, y);
                        if (temp != null) {
                            possibleMovements.add(temp);
                        }
                    }
                }
            }
        }

        return possibleMovements;
    }

    public Square getPosition() {
        return this.position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }
}
