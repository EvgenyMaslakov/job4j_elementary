package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when26to48then2dot83() {
        Point a = new Point(2, 6);
        Point b = new Point(4, 8);
        double dist = a.distance(b);
        double expected = 2.83;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to56then5dot66() {
        Point a = new Point(1, 2);
        Point b = new Point(5, 6);
        double dist = a.distance(b);
        double expected = 5.66;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when31to94then6dot71() {
        Point a = new Point(3, 1);
        Point b = new Point(9, 4);
        double dist = a.distance(b);
        double expected = 6.71;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when312to943then6dot782() {
        Point a = new Point(3, 1, 2);
        Point b = new Point(9, 4, 3);
        double dist = a.distance3d(b);
        double expected = 6.782;
        Assert.assertEquals(expected, dist, 0.001);
    }

    @Test
    public void when123to321then2dot828() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 2, 1);
        double dist = a.distance3d(b);
        double expected = 2.828;
        Assert.assertEquals(expected, dist, 0.001);
    }
}