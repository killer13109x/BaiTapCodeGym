package OOP.stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void getChangePercent() {
        Stock stock = new Stock("VND", "MY COMPANY", 18, 36);
        System.out.println(stock.getChangePercent());
    }
}