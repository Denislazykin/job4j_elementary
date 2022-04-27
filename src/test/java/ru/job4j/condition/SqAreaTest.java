package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K1Square0dot25() {
        int p = 2;
        double k = 1;
        double expected = 0.25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Square3dot47() {
        int p = 10;
        double k = 5;
        double expected = 3.47;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}