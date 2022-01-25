package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26to48then2dot83() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 8;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to56then5dot66() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 5;
        int y2 = 6;
        double expected = 5.66;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to94then6dot71() {
        int x1 = 3;
        int y1 = 1;
        int x2 = 9;
        int y2 = 4;
        double expected = 6.71;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}