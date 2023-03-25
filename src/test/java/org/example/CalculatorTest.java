package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();
    @Test
    void add() {
        int result = calculator.add(4,6);
        assertEquals(10, result);
    }

    @Test
    void substract() {
        int result = calculator.substract(4,5);
        assertEquals(-1, result);
    }

    @Test
    void multiplication() {
        int result = Calculator.multiplication(2, 2);
        assertEquals(4, result);
    }

    @Test
    void division() {
        int result = Calculator.division(8, 2);
        assertEquals(4, result);
    }
}