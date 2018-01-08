package ch.frankel.hesge.algo;

import ch.frankel.hesge.algo.model.Person;
import ch.frankel.hesge.algo.model.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class E_MapProductsByPerson implements Function<Collection<Person>, Map<Person, Collection<Product>>> {

    /**
     * Implémenter la méthode pour qu'elle ventile les Product dans un dictionnaire.
     * La clé est la Person, et la valeur la collection de tous les Product qu'elle a commandés.
     */
    @Override
    public Map<Person, Collection<Product>> apply(Collection<Person> people) {
        Map<Person, Collection<Product>> productsByPerson = new HashMap<>(); // DO NOT EDIT
        // TODO
        return productsByPerson; // DO NO EDIT
    }
}
