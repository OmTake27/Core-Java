package com.nacs.java8features.Streamapi;

import java.util.Arrays;
import com.nacs.java8features.Streamapi.entities.Mobile;

public class MainMobile {
    public static void main(String[] args) {
        Mobile[] mobiles = {
            new Mobile(1,"Apple", "13s", 70000, 16, "A15 Bionic", "Titaniam", "144hz"),
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
            .map(Mobile::getColor)   // Extract colors
            .distinct()              // Remove duplicates
            .sorted()                // Sort alphabetically
            .map(String::toUpperCase)// Convert to UPPERCASE
            .forEach(System.out::println);

        // ✅ Example 3: All Apple Mobiles (distinct)
        System.out.println("\n=== Distinct Apple Mobiles ===");
        Arrays.stream(mobiles)
            .filter(m -> m.getManufacturer().equals("Apple"))
            .distinct() // works because we fixed equals() + hashCode()
            .forEach(System.out::println);

        // ✅ Example 4: Brand + Color list
        System.out.println("\n=== Manufacturer - Color (Distinct) ===");
        Arrays.stream(mobiles)
            .map(m -> m.getManufacturer() + " - " + m.getColor())
            .distinct()
            .sorted()
            .forEach(System.out::println);
        System.out.println(mobiles.hashCode());
        
    }
}
