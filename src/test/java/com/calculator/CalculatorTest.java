package com.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void test1plus1() {
        Representation rep = new Representation(1.0, 1.0, '+');
        double expected = 2.0;
        double actual = Calculator.calculate(rep);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test1minus2() {
        Representation rep = new Representation(1.0, 2.0, '-');
        double expected = -1.0;
        double actual = Calculator.calculate(rep);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test3divided2() {
        Representation rep = new Representation(3.0, 2.0, '/');
        double expected = 1.5;
        double actual = Calculator.calculate(rep);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test2timesNegative1() {
        Representation rep = new Representation(2.0, -1.0, '/');
        double expected = -2.0;
        double actual = Calculator.calculate(rep);
        assertEquals(expected, actual, 0.0);
    }

}