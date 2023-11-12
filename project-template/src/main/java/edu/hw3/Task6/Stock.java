package edu.hw3.Task6;

import org.jetbrains.annotations.NotNull;
import java.util.Objects;

public class Stock implements Comparable<Stock> {

    private final String name;
    private final double cost;

    public Stock(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int compareTo(@NotNull Stock o) {
        return -Double.compare(this.cost, o.cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stock stock = (Stock) o;
        return Objects.equals(cost, stock.cost) && Objects.equals(name, stock.name);
    }

    @Override
    public String toString() {
        return "{name: " + name + ", cost: " + cost + "}";
    }
}
