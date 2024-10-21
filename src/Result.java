package src;

import java.util.List;

public class Result {
    private List<Square> path;
    private int weight;

    public Result(List<Square> path, int weight) {
        this.path = path;
        this.weight = weight;
    }

    public List<Square> getPath() {
        return path;
    }

    public int getWeight() {
        return weight;
    }

    public void setPath(List<Square> path) {
        this.path = path;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
