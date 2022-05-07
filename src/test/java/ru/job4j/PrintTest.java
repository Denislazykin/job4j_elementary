package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Print;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print.main(null);
        assertThat(out.toString(), is("??????? ? ???????!"));
    }
}