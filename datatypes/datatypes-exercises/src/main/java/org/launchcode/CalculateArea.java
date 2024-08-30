package org.launchcode;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner inputLength = new Scanner(System.in);
        System.out.println("What is the length of your rectangle? ");
        float length = inputLength.nextFloat();

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("What is the width of your rectangle? ");
        float width = inputWidth.nextFloat();

        float area = length * width;
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area + "!");

    }
}
