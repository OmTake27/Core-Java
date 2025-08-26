package com.nacs.arrays.logicalprogram.main;

import com.nacs.arrays.logicalprogram.Search;

public class MainSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 11, 111, 1111, 11111, 111111};

        // Linear Search
        System.out.println("Linear Search (1111): " + Search.linearSearch(1111, numbers));

        // Iterative Binary Search
        System.out.println("Binary Search (1111): " + Search.BinarySearch(1111, numbers));

        // Recursive Binary Search
        System.out.println("Recursive Binary Search (111111): " + 
                           Search.RecursionbinarySearch(0, numbers.length - 1, 111111, numbers));
    }
}
