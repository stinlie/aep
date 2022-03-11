package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void SquareWithSidesTwoShouldHaveAreaFour(){
        var square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    public void SquareWithSidesTwoShouldHavePerimeterEight(){
        var square = new Square(2);
        assertEquals(8, square.perimeter());
    }

}
