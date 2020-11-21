package ru.job4j.inheritance;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfessionTest {
    @Test
    public void whenExist() {

        Programmer prog = new Programmer("Kplya", "pupkin", "proger", "12", "web", 15);

        int out =  prog.howMuchCodeWrote;
        int  expected = 15;
        Assert.assertEquals(expected, out);

        Code code = new Code("Server");
        prog.writesCode(code);

    }
}
