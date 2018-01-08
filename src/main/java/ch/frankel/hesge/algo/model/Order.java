package ch.frankel.hesge.algo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Order {

    private final String id;
    private final List<Product> products;

    public Order(String id, Collection<Product> products) {
        this.id = id;
        this.products = new ArrayList<>();
        add(products);
    }

    public Order(String id) {
        this(id, Collections.emptyList());
    }

    public String getId() {
        return id;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public void add(Collection<Product> products) {
        this.products.addAll(products);
    }
}
