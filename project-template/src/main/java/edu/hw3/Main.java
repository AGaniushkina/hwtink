package edu.hw3;

import edu.hw3.Task5.Task5;
import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockClass;
import edu.hw3.Task8.BackwardIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task1.atbash("Hello world!"));
        System.out.println(Task2.clusterize("((())())(()(()()))"));
        System.out.println(Task3.freqDict(Arrays.asList("this", "and", "that", "and")));
        System.out.println(Task3.freqDict(Arrays.asList(1, 1, 2, 2)));
        Stock st = new Stock("market1", 100.0);
        StockClass stc = new StockClass();
        stc.add(st);
        stc.add(new Stock("market2", 200.0));
        stc.add(new Stock("market3", 150.0));
        System.out.println(stc.mostValuableStock());
        stc.remove(st);
        stc.remove(new Stock("market2", 200.0));

        Iterator<Integer> iterator = new BackwardIterator<>(List.of(1, 2, 3));
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        Task5.parseContacts(List.of("John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"), "ASC")
            .forEach(System.out::print);
        System.out.println();

        TreeMap<String, String> tree = new TreeMap<>(new Task7<>());
        tree.put(null, "test");

        System.out.println(tree.containsKey(null));

    }
}
