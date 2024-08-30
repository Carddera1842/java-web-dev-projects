package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice" +
                " ‘without pictures or conversation?";

        Scanner findTerm = new Scanner(System.in);
        System.out.println("What term would you like to Search for in the First Sentence?");
        String findAlice = findTerm.next();

        if (firstSentence.toLowerCase().contains(findAlice)) {
            System.out.println("True");

            Integer index = firstSentence.indexOf(findAlice);
            Integer length = findAlice.length();
            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = firstSentence.replace(findAlice, "");
            System.out.println(modifiedSentence);

        } else {
            System.out.println("Nope, try again");
        }
    }
}
