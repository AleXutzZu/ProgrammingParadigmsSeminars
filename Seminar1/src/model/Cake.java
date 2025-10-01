package model;

public class Cake implements IBox {
    private final int weight;

    public Cake(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "This is a cake "  + this.weight;
    }
}
