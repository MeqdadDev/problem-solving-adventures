package org.example;

public class Main {

    public static boolean isIntPalindrome_Sol1(int n){
        int d = String.valueOf(n).length();
        int clone = n; // for division
        String s = "";
        while (d != 0){
            int p = clone%10;
            clone = clone/10;
            s = s.concat(String.valueOf(p));
            d--;
        }
        System.out.println("Reversed Integer " + s);
        return String.valueOf(n).equals(s);
    }

    public static boolean isIntPalindrome_Sol2(int n){
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Integer " + reversed);

        return original == reversed;
    }

    public static void main(String[] args) {

        //      Palindrome examples
        int givenInt1 = 2112;

        //      Non-Palindrome examples
        int givenInt2 = 432;

        //      Testing Palindrome Integer using String accumulation technique.
        if (isIntPalindrome_Sol1(givenInt1))
            System.out.println("Given Integer " + givenInt1 + " is Palindrome\n");
        else
            System.out.println("Given Integer " + givenInt1 + " is Non-Palindrome\n");

        //      Testing Non-Palindrome Integer.
        if (isIntPalindrome_Sol2(givenInt2))
            System.out.println("Given Integer " + givenInt2 + " is Palindrome\n");
        else
            System.out.println("Given Integer " + givenInt2 + " is Non-Palindrome\n");
    }
}