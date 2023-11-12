package edu.hw3.Task6;

import java.util.PriorityQueue;
import java.util.Queue;

public class StockClass implements StockMarket {

    Queue<Stock> stocks;

    public StockClass() {
        stocks = new PriorityQueue<>();
    }

    public void add(Stock stock) {
        stocks.add(stock);
    }

    public void remove(Stock stock) {
        stocks.remove(stock);
    }

    public Stock mostValuableStock() {
        return stocks.peek();
    }
}
