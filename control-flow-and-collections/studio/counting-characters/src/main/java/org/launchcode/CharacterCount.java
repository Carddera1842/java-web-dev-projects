package org.launchcode;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        HashMap<Character,Integer> letters = new HashMap<>();
        Scanner input = new Scanner(System.in);
        /*String hiddenQuote = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenQuote.toCharArray();*/
        System.out.println("Enter a String: ");
        String userString = input.nextLine().toUpperCase();
        char[] charactersInString = userString.toCharArray();

        for (Character letter : charactersInString) {
            Integer charCount = 0;

            for (int i = 0; i < userString.length(); i++) {
                if (userString.charAt(i) == letter) {
                    charCount ++;
                    letters.put(letter,charCount);
                }
            }
        }
        for (Map.Entry<Character,Integer> count : letters.entrySet()) {
            System.out.println(count.getKey() + ":" + count.getValue());
        }
    }
}
