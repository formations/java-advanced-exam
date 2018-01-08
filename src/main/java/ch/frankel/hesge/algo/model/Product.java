package ch.frankel.hesge.algo.model;

public class Product {

    public enum Type {

        VIDEO, AUDIO, COMPUTER, FOOD;
    }

    public Product(String name, String description, double price, Type type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    private final String name;
    private final String description;
    private final double price;
    private final Type type;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }
}
