package org.example;
import java.util.Arrays;

public class Main {

    public static void findDuplicates(String s){
        char[] chars = s.toCharArray();

        // Sort the character array
        Arrays.sort(chars);

        // Iterate through the sorted array to find duplicates
        System.out.println("Duplicate characters in the string '" + s + "':");
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                System.out.println(chars[i]);
            }
        }
    }

    public static void main(String[] args) {

        String givenStr = "hello";

        findDuplicates(givenStr);

    }

}