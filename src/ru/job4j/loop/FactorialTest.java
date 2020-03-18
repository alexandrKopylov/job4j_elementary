package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class FactorialTest {
    @Test
    public void fac5() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));

    }

    @Test
    public void fac0() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void fac1() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void fac3() {
        int rsl = Factorial.calc(3);
        int expected = 6;
        assertThat(rsl, Matchers.is(expected));
    }


}
