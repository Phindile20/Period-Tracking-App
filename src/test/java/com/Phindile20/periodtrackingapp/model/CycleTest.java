package com.Phindile20.periodtrackingapp.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CycleTest {

    @Test
    void testPredictNextPeriod() {
        LocalDate startDate = LocalDate.of(2025, 8, 1);
        int cycleLength = 28;

        Cycle cycle = new Cycle(startDate, cycleLength);
        LocalDate expectedNextPeriod = LocalDate.of(2025, 8, 29);

        assertEquals(expectedNextPeriod, cycle.predictNextPeriod());
    }

    @Test
    void testGetStartDate() {
        LocalDate startDate = LocalDate.of(2025, 8, 1);
        Cycle cycle = new Cycle(startDate, 28);
        assertEquals(startDate, cycle.getStartDate());
    }

    @Test
    void testGetLength() {
        Cycle cycle = new Cycle(LocalDate.now(), 30);
        assertEquals(30, cycle.getLength());
    }
}
