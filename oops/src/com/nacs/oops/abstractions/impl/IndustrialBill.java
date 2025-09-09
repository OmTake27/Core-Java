package com.nacs.oops.abstractions.impl;

public class IndustrialBill implements ElectricityBill {
    @Override
    public float generateBill(int units) {
        return units * 17.2F;  // Example rate
    }

    @Override
    public void printBill(int units) {
        System.out.println("Industrial Bill for " + units + " units: " + generateBill(units));
    }
}
