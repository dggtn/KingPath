package src;

public class Square {
    private int x;
    private int y;
    private int weight;

    public Square(int x, int y) {

        this.x = x;
        this.y = y;
        this.weight = generateWeight();
    }

    private int generateWeight() {
        return (int) (Math.random() * 9) + 1; // Pesos del 1 al 9
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWeight() {
        return weight;
    }


}