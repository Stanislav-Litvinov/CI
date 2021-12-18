package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void findMax() {
        LegacyCode service = new LegacyCode();
        long[] incomesInBillions = {3, 5, 8, 4, 5, 100, 8, 6, 11, 11, 12};
        long expected = 100;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}

