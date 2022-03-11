package edu.berkeley.aep;

// Compares lengths in different units

public class Measurement {

    private final int number;
    private final String unit;


    public Measurement(int number, String unit) {
        this.number = number;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
