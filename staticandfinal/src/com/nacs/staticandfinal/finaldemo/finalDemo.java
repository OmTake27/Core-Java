package com.nacs.staticandfinal.finaldemo;

public final class finalDemo {
    private final int NUMBER = 10; // constant value

    public finalDemo() {
        super();
    }

    public void setNumber(final int number) {
        // NUMBER = number;  // ❌ Not allowed because NUMBER is final
        final int number1 = number; // Just a local constant for demonstration
    }

    public int getNUMBER() {
        return NUMBER;
    }
}
