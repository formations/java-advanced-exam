package ch.frankel.hesge.algo;

import ch.frankel.hesge.algo.model.Order;

import java.util.Collection;

public class G_AddProductAndVariants {

    /**
     * Ajouter un générique à la signature de la méthode  afin qu'elle compile (et s'exécute de la manière attendue).
     */
    public void accept(Order order, P primaryProduct, Collection<P> variants) {
        order.add(primaryProduct);
        order.add(variants);
    }
}
