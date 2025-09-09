package com.nacs.oops.inhertance.subtype;

import com.nacs.oops.inhertance.supertype.Animal;

public class Dog extends Animal {
    private String bark;

    public Dog() {
        super();
    }

    public Dog(String bark) {
        super();
        this.bark = bark;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    @Override
    public String getSound() {
        System.out.println("Dog barks: " + bark);
		return bark;
    }

    @Override
    public String toString() {
        return "Dog [bark=" + bark + "]";
    }
}
