package ch.frankel.hesge.algo;

import ch.frankel.hesge.algo.model.FoodProduct;
import ch.frankel.hesge.algo.model.Order;

import java.util.List;
import java.util.function.BiConsumer;

public class F_AddFoodProduct implements BiConsumer<Order, List<FoodProduct>> {

    /**
     * Modifier le générique de la méthode Order.add(Collection<Product>) pour que la méthode suivante compile (et s'exécute correctement).
     */
    @Override
    public void accept(Order order, List<FoodProduct> foodProducts) {
        // order.add(products); // UNCOMMENT AND MAKE IT COMPILE
    }
}
