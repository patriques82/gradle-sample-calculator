package com.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepresentationParserTest {

    @Test
    public void test() {
        Representation expected = new Representation(1.0, 1.0, '+');
        Representation actual = RepresentationParser.parse("1", "+", "1");
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeFirstNum() {
        Representation expected = new Representation(-1.0, 1.0, '+');
        Representation actual = RepresentationParser.parse("-1", "+", "1");
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeSecondNum() {
        Representation expected = new Representation(1.0, -1.0, '+');
        Representation actual = RepresentationParser.parse("1", "+", "-1");
        assertEquals(expected, actual);
    }

    @Test(expected = RepresentationParserException.class)
    public void testInvalidOperationSymbol() {
        RepresentationParser.parse("0.0", "wrong", "0.0");
    }

    @Test(expected = RepresentationParserException.class)
    public void testInvalidFirstNumber() {
        RepresentationParser.parse("wrong", "+", "0.0");
    }

    @Test(expected = RepresentationParserException.class)
    public void testInvalidSecondNumber() {
        RepresentationParser.parse("0.0", "+", "wrong");
    }

    @Test(expected = RepresentationParserException.class)
    public void testNullAsFirstNum() {
        RepresentationParser.parse(null, "+", "0.0");
    }

    @Test(expected = RepresentationParserException.class)
    public void testNullAsOperation() {
        RepresentationParser.parse("0.0", null, "0.0");
    }

    @Test(expected = RepresentationParserException.class)
    public void testNullAsSecondNum() {
        RepresentationParser.parse("0.0", "+", null);
    }

    @Test(expected = RepresentationParserException.class)
    public void testEmptyStringAsFirstNum() {
        RepresentationParser.parse("", "+", "0.0");
    }

    @Test(expected = RepresentationParserException.class)
    public void testEmptyStringAsOperation() {
        RepresentationParser.parse("0.0", "", "0.0");
    }

    @Test(expected = RepresentationParserException.class)
    public void testEmptyStringAsSecondNum() {
        RepresentationParser.parse("0.0", "+", "");
    }

}