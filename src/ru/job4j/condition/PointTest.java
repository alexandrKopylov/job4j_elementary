package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {

        double  expected = 2.0;
        double out =  Point.distance(0,0,2,0);
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void distance2() {

        double  expected = 5.0;
        double out =  Point.distance(0,0,5,0);
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void distance3() {

        double  expected = 5.0;
        double out =  Point.distance(0,5,0,0);
        Assert.assertEquals(expected, out,0.01);
    }

    @Test
    public void distance4() {

        double  expected = 2.82;
        double out =  Point.distance(1,2,3,4);
        Assert.assertEquals(expected, out,0.01);
    }


}
