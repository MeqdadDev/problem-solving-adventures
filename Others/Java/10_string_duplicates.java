package org.example;
import java.util.Arrays;

public class Main {

    public static void findDuplicates_Sol1(String s){
        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                System.out.println(chars[i]);
            }
        }
    }

        public static void findDuplicates_Sol2(String str){
        char chars[] = str.toCharArray();
        String duplicates = "";
        System.out.println(chars);
        for(int c=0; c< chars.length; c++){
            for (int d=0; d<c; d++){
                if (chars[c] == chars[d]){
                    duplicates+= chars[d];
                }
            }
        }
        System.out.println("duplicates = " + duplicates);
    }


    public static void main(String[] args) {

        String givenStr = "hello";

        findDuplicates(givenStr);

    }

}