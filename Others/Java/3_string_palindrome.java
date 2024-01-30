package org.example;

import java.util.Arrays;

public class Main {

    public static boolean isStrPalindrome_Sol1(String text){
        char[] chars = text.toLowerCase().toCharArray();
        int rightIndex, leftIndex;
        for(leftIndex=0, rightIndex=text.length() - 1; leftIndex<=rightIndex; leftIndex++, rightIndex--){
            char t = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = t;
        }
        System.out.println("Reversed String of " + text.toLowerCase() + " is " + new String(chars));
        // checking if reversed string (Array of chars) == given text?
        return Arrays.equals(text.toLowerCase().toCharArray(), chars);
    }

    public static boolean isStrPalindrome_Sol2(String str){
        String reversedString = new StringBuilder(str.toLowerCase()).reverse().toString();
        System.out.println("Reversed String of " + str.toLowerCase() + " is " + reversedString);
        return reversedString.equals(str.toLowerCase());
    }

    public static void main(String[] args) {

        //      Palindrome examples
        String givenStr1 = "HaHah";

        //      Non-Palindrome examples
        String givenStr2 = "Abc";

        //      Testing Palindrome using Array of Chars-based solution. (Solution 1)
        if (isStrPalindrome_Sol1(givenStr1))
            System.out.println("Given String " + givenStr1 + " is Palindrome\n");
        else
            System.out.println("Given String " + givenStr1 + " is Non-Palindrome\n");

        //      Testing Palindrome using StringBuilder solution. (Solution 2)
        if (isStrPalindrome_Sol2(givenStr2))
            System.out.println("Given String " + givenStr2 + " is Palindrome\n");
        else
            System.out.println("Given String " + givenStr2 + " is Non-Palindrome\n");
    }
}
