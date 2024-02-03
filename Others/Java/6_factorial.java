package org.example;

public class Main {
    
    public static int findFactorial_Iter(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Input must be non-negative");

        if (n == 0 || n == 1)
            return 1;
        
        int r = 1;
        for (int c = n; c > 0; c--) {
            r = r * c;
        }
        return r;
    }

    public static int findFactorial_Rec(int n){
        if (n < 0)
            throw new IllegalArgumentException("Input must be non-negative");

        if (n == 0 || n == 1)
            return 1;

        return n * findFactorial_Rec(n-1);
    }

    public static void main(String[] args) {

        int givenNum = -1;

        System.out.println("Factorial by Iterative Method: " + findFactorial_Iter(givenNum));
        System.out.println("Factorial by Recursive Method: " + findFactorial_Rec(givenNum));

    }
}