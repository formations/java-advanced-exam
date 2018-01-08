package ch.frankel.hesge.algo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Person {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final Collection<Order> orders;

    public Person(String firstName, String lastName, LocalDate birthDate, Collection<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.orders = new ArrayList<>();
        add(orders);
    }

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, lastName, birthDate, Collections.emptyList());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }

    public void add(Collection<Order> orders) {
        this.orders.addAll(orders);
    }
}
