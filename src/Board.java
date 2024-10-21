package src;


import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Square> squares;
    int size;

    public Board(int n) {
        this.size = n;
        squares = new ArrayList<Square>();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                squares.add(new Square(x, y));
            }
        }
    }

    public Square getSquare(int x, int y) {
        for (Square square : squares) {
            if (square.getX() == x && square.getY() == y) {
                return square;
            }
        }
        return null;
    }

    public int getSize() {
        return this.size;
    }

}