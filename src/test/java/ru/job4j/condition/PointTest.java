package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to20then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to25then5dot38() {
        double expected = 5.38;
        Point a = new Point(0, 0);
        Point b = new Point(2, 5);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to251then5dot38() {
        double expected = 5.48;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 5, 1);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}