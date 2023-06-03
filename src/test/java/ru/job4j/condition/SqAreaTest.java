package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K3Square1dot68() {
        double expected = 1.68;
        int p = 6;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K4Square1dot44() {
        double expected = 1.44;
        int p = 6;
        double k = 4;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        double expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}
