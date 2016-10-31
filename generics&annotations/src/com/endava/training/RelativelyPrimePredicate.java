package com.endava.training;

import java.util.Collection;

/**
 * Created by inastase on 10/31/2016.
 */
class RelativelyPrimePredicate implements UnaryPredicate<Integer> {
    public RelativelyPrimePredicate(Collection<Integer> c) {
        this.c = c;
    }

    public boolean test(Integer x) {
        for (Integer i : c)
            if (Algoritm.cmmdc(x, i) != 1)
                return false;

        return c.size() > 0;
    }

    private Collection<Integer> c;
}
