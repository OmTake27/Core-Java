package com.nacs.arrays.logicalprogram.main;

import com.nacs.arrays.logicalprogram.MovieTheater;

public class MainMovieTheater {

    public static void main(String[] args) {
        String[][] seats = new String[3][];

        seats[0] = new String[] { null, "Booked", null };
        seats[1] = new String[] { "Booked", "Booked", null, "Booked", "Booked" };
        seats[2] = new String[] { null, null, "Booked", "Booked", "Booked", null, null };

        // Create object
        MovieTheater theater1 = new MovieTheater();

        // Pass seats
        theater1.bookTickets(
                new String[] { null, "Booked", null },
                new String[] { "Booked", "Booked", null, "Booked", "Booked" },
                new String[] { null, null, "Booked", "Booked", "Booked", null, null }
        );

        // Show booked seats
        theater1.bookedSeats();
    }
}
