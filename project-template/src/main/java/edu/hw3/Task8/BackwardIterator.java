package edu.hw3.Task8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;

public class BackwardIterator<T> implements Iterator<T> {

    private final Iterator<T> backwardIterator;
    //private final ListIterator<T> backIterator;

    public BackwardIterator(Collection<T> tCollection) {
        //this.backIterator = tCollection.stream().toList().listIterator();
        List<T> tCollectionList = new ArrayList<>(tCollection);
        List<T> reversedList = new ArrayList<>();
        for (int i = tCollection.size() - 1; i >= 0; i--) {
            reversedList.add(tCollectionList.get(i));
        }
        this.backwardIterator = reversedList.iterator();
    }

    @Override
    public boolean hasNext() {
        //return backIterator.hasPrevious();
        return backwardIterator.hasNext();
    }

    @Override
    public T next() {
        //return backIterator.previous();
        return backwardIterator.next();
    }
}
