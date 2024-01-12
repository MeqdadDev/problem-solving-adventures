package org.example;
import java.util.Scanner;

public class Main {
    public static int fibonacciByRecursion(int num) {
        if (num == 0)
            return 0;
        if (num == 1 || num == 2){
            return 1;
        }
        return fibonacciByRecursion(num - 1) + fibonacciByRecursion(num - 2);
    }

    public static int fibonacciByLoop(int num) {
        if (num == 0)
            return 0;
        if (num == 1 || num == 2){
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int fs = 1;
        for (int i=2;i<num;i++){
            fs = f1 + f2;
            f1 = f2;
            f2 = fs;
        }
        return fs;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci= ");
        int f = input.nextInt();

        int fibRec = fibonacciByRecursion(f);
        System.out.println("By Recursion\nF" + f + " = " + fibRec);
        int fibFor = fibonacciByLoop(f);
        System.out.println("By For Loop\nF" + f + " = " + fibFor);

    }
}