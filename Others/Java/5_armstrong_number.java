package org.example;

public class Main {

    public static boolean isArmstrong(int n){
        int clone = n;
        int sum = 0;
        while(clone > 0){
            int digit = clone%10;
            clone /= 10;
            sum+= (int) Math.pow(digit, 3);
        }
        return n == sum;
    }

    public static void main(String[] args) {

        int givenNum = 153;
        
        if (isArmstrong(givenNum))
            System.out.println(givenNum + " is Armstrong number.");
        else
            System.out.println(givenNum + " is Non-Armstrong number.");
    }
}