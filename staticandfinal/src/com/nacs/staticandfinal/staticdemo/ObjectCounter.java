package com.nacs.staticandfinal.staticdemo;

public class ObjectCounter {

    // Static counter (shared across all instances)
    private static int staticCounter;

    // Non-static counter (unique to each object)
    private int nonStaticCounter;

    // Static block to initialize static members
    static {
        staticCounter = 0;
    }

    // Default constructor
    public ObjectCounter() {
        staticCounter++;      // Shared count for all objects
        nonStaticCounter++;   // Each object starts at 0 and increments
    }

    // Parameterized constructor
    public ObjectCounter(int nonStaticCounter) {
        this.nonStaticCounter = nonStaticCounter;
        staticCounter++;
    }

    // Getter and Setter for staticCounter
    public static int getStaticCounter() {
        return staticCounter;
    }

    public static void setStaticCounter(int staticCounter) {
        ObjectCounter.staticCounter = staticCounter;
    }

    // Getter and Setter for nonStaticCounter
    public int getNonStaticCounter() {
        return nonStaticCounter;
    }

    public void setNonStaticCounter(int nonStaticCounter) {
        this.nonStaticCounter = nonStaticCounter;
    }

    @Override
    public String toString() {
        return "Non-static Counter = " + nonStaticCounter +
               "\nStatic Counter = " + staticCounter;
    }
}
