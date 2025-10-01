package model;

public class Apple implements IBox {
    private final int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "This is an apple " + this.weight;
    }
}
