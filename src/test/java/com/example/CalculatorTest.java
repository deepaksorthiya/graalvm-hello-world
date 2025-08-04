package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @Test
    void sum() {
        assertEquals(3, calculator.sum(1, 2), " 1 + 2 should be: 3");
    }

    @Test
    void sub() {
        assertEquals(1, calculator.sub(2, 1), " 2 - 1 should be: 1");
    }
}