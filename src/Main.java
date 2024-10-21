package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(4);

        // Generar una posición inicial aleatoria para el rey
        Random random = new Random();
        int startX = random.nextInt(board.getSize());
        int startY = random.nextInt(board.getSize());

        Square startSquare = board.getSquare(startX,startY);  // Posición inicial del rey

        King king = new King(startSquare);

        List<Square> visited = new ArrayList<>();
        visited.add(startSquare);

        Result result = king.pathFinder(board, visited, 1, 0, null);

        System.out.println("Peso mínimo: " + result.getWeight());
        System.out.println("Camino: ");
        for (Square square : result.getPath()) {
            System.out.println("(" + square.getX() + "," + square.getY() + ") con peso " + square.getWeight());
        }
    }
}
