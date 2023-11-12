package edu.hw3;

import java.util.Comparator;

public class Task7<T extends Comparable<? super T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Comparator<T> tComparator = Comparator.nullsLast(
            Comparator.naturalOrder()
        );
        return tComparator.compare(o1, o2);
    }
}
