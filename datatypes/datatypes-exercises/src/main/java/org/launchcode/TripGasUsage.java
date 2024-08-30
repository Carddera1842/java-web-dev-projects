package org.launchcode;

import java.util.Scanner;

public class TripGasUsage {
    public static void main(String[] args) {
        Scanner milesDriven = new Scanner(System.in);
        System.out.println("How many Miles have you driven?");
        double miles = milesDriven.nextDouble();

        Scanner gallonsUsed = new Scanner(System.in);
        System.out.println("How many Gallons of gas were used?");
        double gallons = gallonsUsed.nextDouble();

        Double milesPerGallon = miles / gallons;
        System.out.println("You drove " + milesPerGallon + " miles per gallon!");
    }
}
