package com.nacs.oops.inhertance.main;

import com.nacs.oops.inhertance.subtype.Train;

public class MainTrainVehicle {
    public static void main(String[] args) {
        Train vandeBharat = new Train();
        vandeBharat.setNoOfBoggies(10);
        vandeBharat.setEngine("6500hp");
       // vandeBharat.setNoOfTyres(43);

        System.out.println(vandeBharat);
    }
}
