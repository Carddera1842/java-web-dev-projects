package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner getRadius = new Scanner(System.in);
        //System.out.println("What is the Radius of the circle?");
        double radius = -1;

        do {
            System.out.println("What is the Radius of the circle?");
            String input = getRadius.nextLine();
            if (input.isEmpty()) {
                System.out.println("Radius cannot be empty!");
                break;
            }
            try {
                radius = Double.parseDouble(input);
                if (radius < 0) {
                    System.out.println("Radius cannot be negative!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Radius must be a number!");
                break;
            }
        } while (radius < 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);

        getRadius.close();
    }
}
