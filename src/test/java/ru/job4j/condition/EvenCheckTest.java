package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {
    @Test
    public void test() {
        assertTrue(EvenCheck.check(2));
        assertFalse(EvenCheck.check(3));
    }
}