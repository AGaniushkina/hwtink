package edu.hw3;

import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {

    @Test
    @DisplayName("Биржа")
    void addTest() {
        // given
        StockClass stock = new StockClass();

        // when
        stock.add(new Stock("test1", 100.0));

        // then
        assertThat(stock.mostValuableStock().toString())
            .isEqualTo("{name: test1, cost: 100.0}");
    }

    @Test
    @DisplayName("Биржа")
    void removeTest() {
        // given
        StockClass stock = new StockClass();
        stock.add(new Stock("test1", 100.0));

        // when
        stock.remove(new Stock("test1", 100.0));

        // then
        assertThat(stock.mostValuableStock())
            .isEqualTo(null);
    }

    @Test
    @DisplayName("Биржа")
    void mostValuableStockTest() {
        // given
        StockClass stock = new StockClass();
        stock.add(new Stock("test1", 100.0));
        stock.add(new Stock("test2", 200.0));
        stock.add(new Stock("test3", 150.0));

        // when
        Stock mvs = stock.mostValuableStock();

        // then
        assertThat(mvs.toString())
            .isEqualTo("{name: test2, cost: 200.0}");
    }
}
