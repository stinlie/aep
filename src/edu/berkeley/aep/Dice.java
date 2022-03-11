package edu.berkeley.aep;

// Calculates the probability of an event not occurring.

import java.util.ArrayList;

public class Dice {

    private int possibleOutcomes = 6;
    private int numberOfEvenNumbers = 3;

    public Dice(int possibleOutcomes){
        this.possibleOutcomes = possibleOutcomes;
    }

    // event of not getting an even number on a dice
    public float not() {
        return 1-(numberOfEvenNumbers/possibleOutcomes);
    }
}
