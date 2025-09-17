package com.nacs.generic.Classes.main;

import com.nacs.generic.demos.Student;
import com.nacs.generic.entities.Book;

public class GenericMethodDemo {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student(1, "Om");
        Student student2 = new Student(2, "Ganesh");
        Student student3 = new Student(3, "Sumit");

        System.out.println("Students:");
        printArray(student1, student2, student3);

        // Integers
        System.out.println("\nIntegers:");
        printArray(1, 2, 3, 4, 5, 6, 7, 8);

        // Floats
        System.out.println("\nFloats:");
        printArray(1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f);

        // Strings
        System.out.println("\nStrings:");
        printArray("Om", "Ganesh", "Sam", "Mahesh", "Rohit");

        // Integer Array
        Integer[] intArray = {1, 25, 64, 64, 7, 57, 5};
        System.out.println("\nBefore Sorting Integers:");
        pprintArray(intArray);
        sortArray(intArray);
        System.out.println("After Sorting Integers:");
        pprintArray(intArray);

        // Book Array
        Book[] bookArray = {
            new Book(100, "Who Moved My Cheese"),
            new Book(50, "Do Epic Shit"),
            new Book(23, "Let Us C")
        };
        System.out.println("\n\nBefore Sorting Books:");
        pprintArray(bookArray);
        sortArray(bookArray);
        System.out.println("After Sorting Books:");
        pprintArray(bookArray);
    }

    // Generic Varargs Print
    public static <T> void printArray(T... tArray) {
        for (T t : tArray) {
            System.out.println(t + " ");
        }
    }

    // Pretty Print
    public static <T> void pprintArray(T... tArray) {
        for (T t : tArray) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    // Generic Selection Sort
    public static <T extends Comparable<T>> void sortArray(T[] tArray) {
        int minIndex;
        for (int i = 0; i < tArray.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < tArray.length; j++) {
                if (tArray[minIndex].compareTo(tArray[j]) > 0) {
                    minIndex = j;
                }
            }
            T temp = tArray[i];
            tArray[i] = tArray[minIndex];
            tArray[minIndex] = temp;
        }
    }
}
