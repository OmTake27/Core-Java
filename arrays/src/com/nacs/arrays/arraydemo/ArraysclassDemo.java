package com.nacs.arrays.arraydemo;

import java.util.Arrays;

public class ArraysclassDemo {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {10, 20, 30, 40, 50};
        int[] array3 = {10, 20, 30};
        int[][] array4 = {{10, 20}, {30, 40}};
        int[] array5 = {10};
        int[][] arrays = {{50, 20}, {30, 10, 40}};

        // Example 1: equals
        System.out.println(Arrays.equals(array1, array2)); // false

        // Example 2: deepEquals for 2D arrays
        System.out.println(Arrays.deepEquals(array4, arrays)); // false

        // Example 3: fill
        Arrays.fill(array, 7); 
        System.out.println(Arrays.toString(array)); // [7, 7, 7, 7, 7]

        // Example 4: partial fill
        Arrays.fill(array, 2, 4, 99);
        System.out.println(Arrays.toString(array)); // [7, 7, 99, 99, 7]

        // Example 5: copyOf
        int[] copy = Arrays.copyOf(array, 2);
        System.out.println(Arrays.toString(copy)); // [7, 7]

        // Example 6: copyOfRange
        int[] result = Arrays.copyOfRange(array, 2, 4);
        System.out.println(Arrays.toString(result)); // [99, 99]

        // Example 7: deepToString for 2D array
        System.out.println(Arrays.deepToString(arrays)); // [[50, 20], [30, 10, 40]]

        // Example 8: binarySearch
        int[] sortedArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(sortedArray, 50)); // 4
    }
}
