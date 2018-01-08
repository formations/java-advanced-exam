package ch.frankel.hesge.algo;


import java.util.Collection;
import java.util.function.Function;

public class A_Clone implements Function<Collection<?>, Collection<?>> {

    /**
     * Modifier l'implémentation pour que la Collection retournée contienne tous les éléments de la Collection en argument,
     * mais ne soit pas la même (== return false).
     */
    @Override
    public Collection<?> apply(Collection<?> objects) {
        // TODO
        return objects;
    }
}
