package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

    @Test
    public void anEmptyStringShouldGiveBackAnEmptyString() {
        String empty = "";
        Reverse reverser = new Reverse();
        assertEquals(empty, reverser.reverseString(""));
    }

    @Test
    public void oneCharacterStringReverseShouldBeSame() {
        String character = "s";
        Reverse reverser = new Reverse();
        assertEquals(character, reverser.reverseString(character));

    }

    @Test
    public void reverseHelloShouldBeOlleh() {
        String hello = "Hello";
        Reverse reverser = new Reverse();
        assertEquals("olleH", reverser.reverseString(hello));
    }
}