package com.digite.kata;

public class FuelPump {

    public void fillFuel(int amount, Vehicle vehical) {
        int fillableAmount = vehical.getMaxFuel() - vehical.getRemainingFuel();

        vehical.setRemainingFuel( amount > fillableAmount ? fillableAmount : vehical.getRemainingFuel() + amount );
    }
}
