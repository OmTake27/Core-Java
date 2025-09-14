package com.nacs.exceptions.basics;

public class Handlers {

    public static void main(String[] args) {
        int number = 0;
        String name = "Tejas";

        try {
            number = 10 / number;   // 🔴 Division by zero
            name.length();          // Won’t execute (exception already thrown)

            try {
                name.charAt(10);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (StringIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

            System.out.println("After Inner try-catch block");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());   // prints "/ by zero"
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("Result :" + number);
    }
}
