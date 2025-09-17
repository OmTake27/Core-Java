package com.nacs.java8features.Streamapi;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;

import com.nacs.java8features.Streamapi.entities.Mobile;

public class MainMobile {
    public static void main(String[] args) {
        Mobile[] mobiles = {
            new Mobile(1,"Apple", "13s", 70000, 16, "A15 Bionic", "Titanium", "144hz"),
            new Mobile(2,"Apple", "13s", 70000, 16, "A15 Bionic", "Black", "144hz"),
            new Mobile(3,"Apple", "13s", 70000, 16, "A15 Bionic", "White", "144hz"),
            new Mobile(4,"Samsung", "S20", 50000, 8, "Mediatek", "White", "144hz"),
            new Mobile(5,"Samsung", "S20", 50000, 8, "Mediatek", "Black", "144hz"),
            new Mobile(6,"Samsung", "S20", 50000, 8, "Mediatek", "Blue", "144hz"),
            new Mobile(7,"RedMI", "Note 12", 40000, 16, "Snap Dragon", "Black", "144hz"),
            new Mobile(8,"RedMI", "Note 12", 40000, 16, "Snap Dragon", "White", "144hz"),
            new Mobile(9,"RedMI", "Note 12", 40000, 16, "Snap Dragon", "Red", "144hz"),
            new Mobile(10,"Motorola", "Edge 50", 30000, 8, "Snap Dragon", "Green", "144hz"),
            new Mobile(11,"RedMI", "Edge 50", 30000, 8, "Snap Dragon", "White", "144hz"),
            new Mobile(12,"RedMI", "Edge 50", 30000, 8, "Snap Dragon", "Black", "144hz"),
        };

        // ✅ Example 1: Filter specific mobiles
        System.out.println("=== Filtered Mobiles (Snapdragon, Black, Price 40k-60k) ===");
        Arrays.stream(mobiles)
            .filter(e -> e.getPrice() >= 40000 && e.getPrice() <= 60000)
            .filter(e -> e.getProcessor().equals("Snap Dragon"))
            .filter(e -> e.getColor().equals("Black"))
            .forEach(System.out::println);

        // ✅ Example 2: Distinct, sorted colors in uppercase
        System.out.println("\n=== Distinct Colors (Uppercase) ===");
        Arrays.stream(mobiles)
            .map(Mobile::getColor)
            .distinct()
            .sorted()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // ✅ Example 3: All Apple Mobiles (distinct)
        System.out.println("\n=== Distinct Apple Mobiles ===");
        Arrays.stream(mobiles)
            .filter(m -> m.getManufacturer().equals("Apple"))
            .distinct()
            .forEach(System.out::println);

        // ✅ Example 4: Brand + Color list
        System.out.println("\n=== Manufacturer - Color (Distinct) ===");
        Arrays.stream(mobiles)
            .map(m -> m.getManufacturer() + " - " + m.getColor())
            .distinct()
            .sorted()
            .forEach(System.out::println);

        // ✅ Sorted by price (Comparable)
        System.out.println("\n=== Sorted by Price ===");
        Arrays.stream(mobiles)
            .sorted()
            .forEach(System.out::println);

        // ✅ Sorted by color (Custom Comparator)
        System.out.println("\n=== Sorted by Color ===");
        Arrays.stream(mobiles)
            .sorted((o1,o2) -> o1.getColor().compareTo(o2.getColor()))
            .forEach(System.out::println);

        // ✅ Count mobiles by color
        long blackCount = Arrays.stream(mobiles)
            .filter(e -> e.getColor().equals("Black"))
            .count();
        System.out.println("\nCount of Black mobiles: " + blackCount);

        // ✅ Count mobiles by price
        long count40k = Arrays.stream(mobiles)
            .filter(e -> e.getPrice() == 40000)
            .count();
        System.out.println("Count of 40k price mobiles: " + count40k);

        // ✅ Reduce (Total Expense) + Average
        float expense = Arrays.stream(mobiles)
            .map(Mobile::getPrice)
            .reduce(1000F, Float::sum);
        System.out.println("Total Expense: " + expense);

        double average = Arrays.stream(mobiles)
            .mapToDouble(Mobile::getPrice)
            .average()
            .orElse(0.0);
        System.out.println("Average Price: " + average);

        // ✅ Primitive streams examples
        IntStream intStream = Arrays.stream(new int[] {1,2,3,4,5,6});
        System.out.println("Sum of IntStream: " + intStream.sum());

        DoubleStream doubleStream = Arrays.stream(new double[] {10.23,23.34,24.24,35.54,46.456});
        System.out.println("Average of DoubleStream: " + doubleStream.average().orElse(0.0));

        // ✅ DoubleSummaryStatistics for White mobiles
        DoubleSummaryStatistics stats = Arrays.stream(mobiles)
            .filter(e -> e.getColor().equals("White"))
            .mapToDouble(Mobile::getPrice)
            .summaryStatistics();

        System.out.println("\n=== White Mobiles Price Stats ===");
        System.out.println("Average Price: " + stats.getAverage());
        System.out.println("Total Sum: " + stats.getSum());
        System.out.println("Max Price: " + stats.getMax());
        System.out.println("Min Price: " + stats.getMin());
        System.out.println("Count: " + stats.getCount());
    
    try(Stream<Mobile> mobileStream1 = Arrays.stream(mobiles);){
   String[] proceessArray=	mobileStream1
    	.distinct().map(Mobile::getProcessor).distinct().toArray(String[]::new);
    	System.out.println(Arrays.toString(proceessArray));
    	
    }
}}
