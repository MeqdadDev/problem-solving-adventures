package org.example;
import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num){
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int ctr = 3; ctr <= Math.sqrt(num); ctr += 2) {
            if (num % ctr == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your number= ");
        int pn = scnr.nextInt();
        if (isPrime(pn))
            System.out.print(pn + " is a prime number");
        else
            System.out.println(pn + " isn't a prime number");
    }
}