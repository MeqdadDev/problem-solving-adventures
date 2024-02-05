package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
        Set<Integer> hs = new LinkedHashSet<Integer>(arr);
        arr.clear();
        arr.addAll(hs);

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of your items: ");

        int itemsNumber = scanner.nextInt();

        System.out.println("Enter your numbers...");
        for (int i=0; i<itemsNumber; i++){
            System.out.print("Enter item number " + (i+1) + ": ");
            int n = scanner.nextInt();
            numbers.add(n);
        }
        System.out.println(numbers);

        System.out.println(removeDuplicates(numbers));
    }

}