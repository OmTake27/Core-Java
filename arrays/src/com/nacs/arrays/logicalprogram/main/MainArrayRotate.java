package com.nacs.arrays.logicalprogram.main;

import com.nacs.arrays.logicalprogram.ArrayRotate;

public class MainArrayRotate {

    private MainArrayRotate() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        int[] array = new int[] {12, 23, 34, 45, 56, 67};

        // Rotate left 2 times
        for (int i = 0; i < 2; i++) {
            ArrayRotate.ArrayRotateLeft(array);
        }
        System.out.println();

        // Rotate right once
        ArrayRotate.ArrayRotateRight(new int[] {12, 23, 34, 45, 56, 67});

        // Rotate characters of a string
        String name1 = "Ganesh";
        char[] charArray1 = name1.toCharArray(); // ✅ convert String to char[]
        ArrayRotate.ArrayRotateLeftCharacter(charArray1);
        String name2 = "Mahesh";
        char[] charArray2 = name2.toCharArray();
        ArrayRotate.ArrayRotateRightCharacter(charArray2);
    }
}
