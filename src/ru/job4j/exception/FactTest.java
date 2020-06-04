package ru.job4j.exception;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void factExp() {
        Fact.calc(-2);
    }
}
