package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner getRadius = new Scanner(System.in);
        System.out.println("What is the Radius of the circle?");
        Double radius = getRadius.nextDouble();

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
