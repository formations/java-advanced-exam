package ch.frankel.hesge.algo.model;

public class FoodProduct extends Product  {

    public FoodProduct(String name, String description, double price) {
        super(name, description, price, Type.FOOD);
    }
}
