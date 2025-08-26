package com.nacs.arrays.logicalprogram;

public class Search {
    private Search() {
    }

    // Linear Search
    public static int linearSearch(int target, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Iterative Binary Search
    public static int BinarySearch(int target, int... array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == array[mid]) {
                return mid;
            }
            if (target > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Recursive Binary Search
    public static int RecursionbinarySearch(int left, int right, int target, int... array) {
        // Base case
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (target == array[mid]) {
            return mid;
        }
        if (target < array[mid]) {
            return RecursionbinarySearch(left, mid - 1, target, array);
        } else {
            return RecursionbinarySearch(mid + 1, right, target, array);
        }
    }
}
