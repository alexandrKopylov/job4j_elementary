package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Th() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 5, 5};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));

    }

    @Test
    public void whenFind55() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int value = 5;
        int start = 5;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 5;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind545() {
        int[] input = new int[] {43, 113, 77};
        int value = 77;
        int start = 1;
        int finish = 2;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
}
