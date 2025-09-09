package com.nacs.oops.abstractions.impl;

import com.nacs.oops.abstractions.GenerateBill;

public interface ElectricityBill extends GenerateBill {
    
    // Each implementing class must provide this
    void printBill(int units);

    // Default method for Small Cap
    default void smallprintBill(int units) {
        System.out.println("Bill for Small Cap is: " + generateBill(units));
    }

    // Default method for Mid Cap
    default void midprintBill(int units) {
        System.out.println("Bill for Mid Cap is: " + generateBill(units));
    }
}
