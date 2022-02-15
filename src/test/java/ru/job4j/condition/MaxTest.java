package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenFirstt5Second10then10() {
        int first = 5;
        int second = 10;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second5then10() {
        int first = 10;
        int second = 5;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second10then10() {
        int first = 10;
        int second = 10;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second5Third7then10() {
        int first = 10;
        int second = 5;
        int third = 7;
        int expected = 10;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second5Third7Fourth11then10() {
        int first = 10;
        int second = 5;
        int third = 7;
        int fourth = 11;
        int expected = 11;
        int out = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, out);
    }
}
