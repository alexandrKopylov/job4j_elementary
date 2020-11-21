package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {

    @Test
    public void whenExist() {
        Point t1 = new Point(0, 0);
        Point t2 = new Point(0, 3);
        Point t3 = new Point(4, 0);
        Triangle treugolnik = new Triangle(t1,t2,t3);
        double out = treugolnik.area();
        double  expected = 6.0;
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void whenExist2() {
        Point t1 = new Point(0, 0);
        Point t2 = new Point(4, 3);
        Point t3 = new Point(8, 0);
        Triangle treugolnik = new Triangle(t1,t2,t3);
        double out = treugolnik.area();
        double  expected = 12.0;
        Assert.assertEquals(expected, out,0.01);
    }

}
