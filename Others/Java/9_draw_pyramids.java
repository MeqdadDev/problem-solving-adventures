package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void drawPyramidPattern(int pl){
        for(int i=0; i<pl; i++){
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void drawBalancedPyramidPattern(int pl){
        for(int i=0; i<pl; i++){
            for(int j=0; j<(pl-i); j++)
                System.out.print(" ");
            for(int m=0; m<=i; m++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void drawPyramidNumbersPattern(int pl){
        for(int i=0; i<pl; i++){
            for(int j=0; j< (pl-i); j++)
                System.out.print(" ");
            for(int u=0; u<=i; u++)
                System.out.print(u+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int patterLines = 5;

        drawPyramidPattern(patterLines);
        System.out.println("-----------");
        drawBalancedPyramidPattern(patterLines);
        System.out.println("-----------");
        drawPyramidNumbersPattern(patterLines);
        System.out.println("-----------");
        
    }

}