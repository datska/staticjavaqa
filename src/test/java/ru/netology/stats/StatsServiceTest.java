package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMaxInTheMiddle() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.sum(sales) / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSalesMonth(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
