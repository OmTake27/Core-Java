package com.nacs.generic.entities;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private Float price;
    private String name;

    // Constructors
    public Book(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public Book(int price, String name) {
        this((float) price, name);
    }

    // Getters & Setters
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Default sorting: by name
    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    // Extra comparators
    public static Comparator<Book> byPrice = Comparator.comparing(Book::getPrice);
    public static Comparator<Book> byName = Comparator.comparing(Book::getName);

    @Override
    public String toString() {
        return "Book [price=" + price + ", name=" + name + "]";
    }
}
