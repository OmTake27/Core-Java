package com.nacs.oops.abstractions.impl;

public class ResidentialBill implements ElectricityBill {
    @Override
    public float generateBill(int units) {
        return units * 9.5F;  // Example rate
    }

    @Override
    public void printBill(int units) {
        System.out.println("Residential Bill for " + units + " units: " + generateBill(units));
    }
}
