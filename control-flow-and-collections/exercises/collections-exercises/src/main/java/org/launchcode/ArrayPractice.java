package org.launchcode;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1,1,2,3,5,8};
        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
/*
        for (int i : integerArray) {
            System.out.print(i);
        }

        for (int i : integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
*/
        String[] words = rhyme.split(" ");
        System.out.println(Arrays.toString(words));

        //String[] sentences = rhyme.split("\\.");
        //System.out.println(Arrays.toString(sentences));

        int[] justSomeNumbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        ArrayList<Integer> findEvens = new ArrayList<>();
        for (int nums : justSomeNumbers) {
            findEvens.add(nums);
        }
        System.out.println(ArrayListPractice.sumEven(findEvens));

        ArrayList<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }
        System.out.println(ArrayListPractice.checkCharNum(wordList));

    }
}

