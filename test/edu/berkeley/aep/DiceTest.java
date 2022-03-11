package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceTest {

    @Test
    public void probabilityOfNotGettingNumberThreeOnADice(){
        var dice = new Dice(6);
        assertEquals(3d/6d, dice.not(), 2);

    }
}
