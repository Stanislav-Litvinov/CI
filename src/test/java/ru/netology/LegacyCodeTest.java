package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    private LegacyCode service = new LegacyCode();
    private long[] incomesInBillions = {3, 5, 8, 4, 5, 100, 8, 6, 11, 11, 12};

    @Test
    void findMax() {
        assertEquals(100, service.findMax(incomesInBillions));
    }
}

