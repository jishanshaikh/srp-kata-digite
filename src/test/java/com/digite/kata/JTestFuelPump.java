package com.digite.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JTestFuelPump {

    FuelPump fuelPump;
    Vehicle vehicle;

    @Before
    public void setUp() {
        fuelPump = new FuelPump();
        vehicle = new Vehicle(100);
    }

    @Test
    public void testFillFuel() {
        vehicle.setRemainingFuel(40);
        fuelPump.fillFuel(20, vehicle);

        assertEquals(60, vehicle.getRemainingFuel());
    }
}
