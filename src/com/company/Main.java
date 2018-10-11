package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("The dog jumped over the fence");
    }

    public static void countingWords(String words) {
        for (String newWords : words.split(" ", 5)) {
            System.out.println(newWords);
        }
    }
}



