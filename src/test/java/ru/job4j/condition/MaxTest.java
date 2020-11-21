package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {


    @Test
    public void whenMax1To2To3Then3() {
        int result = Max.max(1, 2,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax62To38To85To11Then85() {
        int result = Max.max(62, 38 , 85 , 11);
        assertThat(result, is(85));
    }

    @Test
    public void whenMax5To2Then2() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    public static class MultiMaxTest {

        @Test
        public void whenSecondMax() {
            MultiMax check = new MultiMax();
            int result = check.max(1, 4, 2);
            assertThat(result, is(4));
        }

        @Test
        public void when1Max() {
            MultiMax check = new MultiMax();
            int result = check.max(4, 3, 2);
            assertThat(result, is(4));
        }

        @Test
        public void when3Max() {
            MultiMax check = new MultiMax();
            int result = check.max(4, 4, 4);
            assertThat(result, is(4));
        }

    }
}
