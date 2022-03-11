package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeasurementTest {

    @Test
    public void TestSomething(){
        var unit1 = new Measurement(1, "foot");
        var unit2 = new Measurement(12, "inches");
        assertEquals(unit1, unit2);
    }

}
