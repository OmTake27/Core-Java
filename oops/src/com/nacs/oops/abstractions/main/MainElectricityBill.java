package com.nacs.oops.abstractions.main;

import com.nacs.oops.abstractions.impl.ElectricityBill;
import com.nacs.oops.abstractions.impl.IndustrialBill;
import com.nacs.oops.abstractions.impl.ResidentialBill;

public class MainElectricityBill {
    public static void main(String[] args) {
        
        // Industrial Bill
        ElectricityBill industrialBill = new IndustrialBill();
        industrialBill.printBill(50);

        // Residential Bill
        ElectricityBill residentialBill = new ResidentialBill();
        residentialBill.printBill(50);

        // Small Cap (Anonymous Class)
        ElectricityBill smallCap = new ElectricityBill() {
            @Override
            public float generateBill(int units) {
                return units * 25.50F;
            }

            @Override
            public void printBill(int units) {
                System.out.println("SmallCap Bill for " + units + " units: " + generateBill(units));
            }
        };
        smallCap.smallprintBill(100);  // using default method
        smallCap.printBill(100);       // using overridden method

        // Mid Cap (Anonymous Class)
        ElectricityBill midCap = new ElectricityBill() {
            @Override
            public float generateBill(int units) {
                return units * 32.50F;
            }

            @Override
            public void printBill(int units) {
                System.out.println("MidCap Bill for " + units + " units: " + generateBill(units));
            }
        };
        midCap.midprintBill(100);   // using default method
        midCap.printBill(100);      // using overridden method
    }
}
