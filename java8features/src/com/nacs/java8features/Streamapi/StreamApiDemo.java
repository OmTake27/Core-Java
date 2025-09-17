package com.nacs.java8features.Streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.nacs.java8features.Streamapi.entities.Student;

public class StreamApiDemo {
    public static void main(String[] args) {

        System.out.println();
        int[] intArray = {1, 3, 5, 6, 7, 8, 9, 34, 54, 56, 67, 45, 34, 34};
        Arrays.stream(intArray)
              .filter(n -> n % 2 == 0)
              .filter(n -> n > 7)
              .forEach(System.out::println);

        System.out.println();
        String[] stringArray1 = {"om", "mahesh", "ganesh", "suresh", "rohit", "kajal"};
        Arrays.stream(stringArray1)
              .filter(str -> str.charAt(1) == 'a')
              .filter(str -> str.length() % 2 != 0)
              .forEach(System.out::println);

        System.out.println();
        int[] intArray3 = {67, 70, 80, 65, 77};
        Arrays.stream(intArray3)
              .filter(no -> no % 2 != 0)
              .mapToDouble(no -> no * 3.14f)
              .forEach(System.out::println);

        System.out.println();
        String[] names = {"ABsdgcbdsC", "BBsdgC", "gdsgfBC", "asfae"};
        Arrays.stream(names)
              .map(String::length)
              .map(number -> number + 1)
              .sorted()
              .forEach(System.out::println);

        System.out.println();
        int[] intArray4 = {67, 70, 70, 77, 80, 65, 77, 3224, 34563, 34563, 235, 34, 5653445, 243, 354};
        Arrays.stream(intArray4)
              .filter(n -> n % 2 != 0)
              .map(n -> n * n)
              .limit(2)
              .forEach(System.out::println);

        System.out.println();
        String[] names1 = {"OM","ganesh","JAY","VIVEK","vaibhav","grish","YASH","abhijeet","MOHAN","mahesh","pranav"};
        Arrays.stream(names1)
              .distinct()
              .filter(str -> str.length() % 2 == 0)
              .map(String::toLowerCase)
              .sorted()
              .forEach(System.out::println);

        System.out.println();

        // Max and Min
        int[] values = {7, 3, 4, 5, 6};
        int max = Arrays.stream(values).max().orElseThrow();
        int min = Arrays.stream(values).min().orElseThrow();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println();

        // Students array
        Student[] studentArray = {
            new Student(1, "ABC"),
            new Student(2, "BBC"),
            new Student(0, "CBC")
        };

        Optional<Student> maxStudent = Arrays.stream(studentArray)
                                             .max(Comparator.comparing(Student::getName));
        maxStudent.ifPresent(s -> System.out.println("Max by name: " + s.getName()));

        Optional<Student> minStudent = Arrays.stream(studentArray)
                                             .min(Comparator.comparing(Student::getName));
        minStudent.ifPresent(s -> System.out.println("Min by name: " + s.getName()));

        System.out.println();

        // Find first
        OptionalInt first = Arrays.stream(values).findFirst();
        first.ifPresent(f -> System.out.println("First element: " + f));

        // Find any
        OptionalInt any = Arrays.stream(values).findAny();
        any.ifPresent(a -> System.out.println("Any element: " + a));

        // Any match
        boolean hasOdd = Arrays.stream(values).anyMatch(n -> n % 2 != 0);
        System.out.println("Has odd number? " + hasOdd);
try (IntStream intStream = Arrays.stream(new int[] {7,3,1,5,9,2});){
	int[] result =intStream.map(n->n+1).toArray();
	System.out.println(Arrays.toString(result));
}
	
	

String[] namees = {"Ansh", "Niraj", "sai", "tejas", "soham", "Rohit"};

try (Stream<String> nameStream = Arrays.stream(namees)) {
    String[] result = nameStream
            .filter(s -> s.length() > 1 && s.charAt(1) == 'o') // safe check
            .toArray(String[]::new);

    System.out.println(Arrays.toString(result));
}

    }
}
