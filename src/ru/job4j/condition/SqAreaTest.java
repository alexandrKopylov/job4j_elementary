package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;


public class SqAreaTest {

    @Test
    public void test1() {

        double  expected = 1.0;
        double out =  SqArea.square(4,1);
        Assert.assertEquals(expected, out,0.01);
    }
    @Test
    public void test2() {

        double  expected = 2.0;
        double out =  SqArea.square(6,2);
        Assert.assertEquals(expected, out,0.01);
    }

}
