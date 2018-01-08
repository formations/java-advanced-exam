package ch.frankel.hesge.algo;

import java.util.Optional;
import java.util.function.ToLongFunction;

public class L_DefaultValue implements ToLongFunction<Optional<Long>> {

    /**
     * Sans utiliser le mot-clé if, retourner la valeur de l'Optional passé en paramètre ou 0L si celui-ci ne contient aucune valeur.
     */
    @Override
    public long applyAsLong(Optional<Long> value) {
        return 0;
    }
}
