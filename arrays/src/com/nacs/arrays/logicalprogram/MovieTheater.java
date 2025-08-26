package com.nacs.arrays.logicalprogram;

public class MovieTheater {
    private String[][] seats;

    public MovieTheater() {
    }

    public MovieTheater(String[]... seats) {
        this.seats = seats;
    }

    public void bookTickets(String[]... seats) {
        this.seats = seats;
    }

    public void bookedSeats() {
        for (int i = 0; i < seats.length; i++) { // ✅ fixed outer loop
            for (int j = 0; j < seats[i].length; j++) { // ✅ fixed inner loop
                System.out.print(" " + seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
