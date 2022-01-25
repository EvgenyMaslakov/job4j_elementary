package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenLeft5Right10then10() {
        int left = 5;
        int right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLeft10Right5then10() {
        int left = 10;
        int right = 5;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenLeft10Right10then10() {
        int left = 10;
        int right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}