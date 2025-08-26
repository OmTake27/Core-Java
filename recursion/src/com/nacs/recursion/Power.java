package com.nacs.recursion;

public class Power {

    // Recursive method to calculate base^exponent
    public static int calculatePower(int base, int exponent) {
        // Base case: any number to the power of 0 is 1
//        if (exponent < 1) {
//            return 1;
//        }
//        // Recursive step
//        return base * calculatePower(base, exponent - 1)*base;
    	return(exponent<1)?1:calculatePower(base,exponent-1)*base;
        
    }

    
}
