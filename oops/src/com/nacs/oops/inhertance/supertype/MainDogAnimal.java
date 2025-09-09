package com.nacs.oops.inhertance.supertype;

import com.nacs.oops.inhertance.subtype.Dog;

public class MainDogAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog("Woof Woof!!"); // Upcasting
        animal.getSound();  // Calls overridden method from Dog

        Dog johny = new Dog("Bow Bow!!");
        johny.getSound();   // Dog-specific sound
        System.out.println(johny); // Calls toString()
    }
}
