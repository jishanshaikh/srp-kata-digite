package com.digite.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JTestVehicle {

    Vehicle vehicle;

    @Before
    public void setUp() {
        vehicle = new Vehicle(100);
    }

    @Test
    public void testGetMaxFuel() {
        assertEquals(100, vehicle.getMaxFuel());
    }

    @Test
    public void testRemFuelAfterAccelarate() {
        vehicle.accelerate();
        vehicle.accelerate();

        assertEquals(98, vehicle.getRemainingFuel());
    }
}
