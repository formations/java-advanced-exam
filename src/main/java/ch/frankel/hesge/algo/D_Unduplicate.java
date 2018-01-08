package ch.frankel.hesge.algo;

import ch.frankel.hesge.algo.model.Order;
import ch.frankel.hesge.algo.model.Product;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class D_Unduplicate implements Function<Collection<Order>, Set<Product>> {

    /**
     * Modifier la classe Product puis implémenter la méthode pour qu'elle retourne tous les produits de toutes les commandes <strong>sans doublons</strong>.
     * Deux Product qui ont le même nom et le même type sont considérés comme égaux.
     */
    public Set<Product> apply(Collection<Order> orders) {
        Set<Product> products = new HashSet<>(); // DO NOT EDIT
        // TODO
        return products; // DO NOT EDIT
    }
}
