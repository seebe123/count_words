package com.company;
import java.util.ArrayList;
import java.util.*;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> countLetters(String s) {
        int count = 0;
        int j=0;
        char ch[] = new char[s.length()];
        ArrayList<Integer> Letters_in_word = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (ch[i] != ' ')
                count++;
            else {
                Letters_in_word.add(count);
                count = 0;
                j++;
            }
        }
        Letters_in_word.add(count);
        return Letters_in_word;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give  a sentence:");
        String word = in.nextLine();
        for (int i = 0; i < countLetters(word).size(); i++) {
            int occurrences = Collections.frequency(countLetters(word), countLetters(word).get(i));
            System.out.println("there are "+occurrences+" words with "+countLetters(word).get(i)+" letters");
        }
    }
}
