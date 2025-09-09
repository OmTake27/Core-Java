package com.nacs.oops.inhertance.subtype;

import com.nacs.oops.inhertance.supertype.Vehicle;

public class Train extends Vehicle {
    private int noOfBoggies;

    public Train() {
    }

    public Train(int noOfTyres, String engine, int noOfBoggies) {
        super(noOfTyres, engine);
        this.noOfBoggies = noOfBoggies;
    }

    public int getNoOfBoggies() {
        return noOfBoggies;
    }

    public void setNoOfBoggies(int noOfBoggies) {
        this.noOfBoggies = noOfBoggies;
    }
    @Override
    public void setNoOfTyres(int noOfTyres) {
    	System.out.println("this is Sub");
        int newNoOfTyresawithEngine = (noOfBoggies + 2) * 4;
        int newNoOfTyreswithOutEngine = (noOfBoggies) * 4;

        if (newNoOfTyreswithOutEngine <= noOfTyres && newNoOfTyresawithEngine >= noOfTyres) {
            super.setNoOfTyres(noOfTyres);
        } else {
            System.out.println("Invalid Input: Tyres must be between " 
                + newNoOfTyreswithOutEngine + " and " + newNoOfTyresawithEngine);
        }
    }

    @Override
    public String toString() {
        return "Train noOfBoggies : " + noOfBoggies + " \n" + super.toString() + " \n";
    }
}
