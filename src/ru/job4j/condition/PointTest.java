package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void test1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double  expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out,0.01);
    }
    @Test
    public void test2() {
        Point c = new Point(0, 0,0);
        Point d = new Point(0, 2,2);
        double  expected = 2.82;
        double  out = c.distance3d(d);
        Assert.assertEquals(expected, out,0.01);
    }
}
