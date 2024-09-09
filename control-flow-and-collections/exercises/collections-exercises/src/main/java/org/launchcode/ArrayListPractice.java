package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static int checkCharNum(ArrayList<String> arr) {
        Scanner numChars = new Scanner(System.in);
        System.out.println("How many Characters in your word?");
        int countWord = numChars.nextInt();

        for (String word : arr) {
            if (word.length() == countWord) {
                System.out.println(word);
            }
        }
        return countWord;
    }
}
