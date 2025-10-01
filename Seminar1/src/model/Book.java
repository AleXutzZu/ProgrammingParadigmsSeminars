package model;

public class Book implements IBox {
    private final int weight;

    public Book(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "This is a book "  + this.weight;
    }
}
