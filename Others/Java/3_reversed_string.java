package org.example;

public class Main {

    public static String reverseString_Sol2(String s){
        return new StringBuffer(s).reverse().toString();
    }

    public static String reverseString_Sol1(String s){
        char chars[] = s.toCharArray();
        String reversed = "";
        for(int c=chars.length-1;c>=0;c--){
            reversed+=(String.valueOf(chars[c]));
        }
        return reversed;
    }

    public static String reverseString_Sol3(String s) {
        char[] chars = s.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }

    public static String reverseString_Sol4(String text){
        char[] chars = text.toCharArray();
        int rightIndex, leftIndex;
        for(leftIndex=0, rightIndex=text.length() - 1; leftIndex<=rightIndex; leftIndex++, rightIndex--){
            char t = chars[leftIndex];
            chars[leftIndex] = chars[rightIndex];
            chars[rightIndex] = t;
        }
        return String.valueOf(chars).toString();
    }

    public static void main(String[] args) {
        String givenStr = "Palestine";
        System.out.println("Given String = " + givenStr);
        System.out.println("Reversed String (Solution1): " + reverseString_Sol1(givenStr));
        System.out.println("Reversed String (Solution2): " + reverseString_Sol2(givenStr));
        System.out.println("Reversed String (Solution3): " + reverseString_Sol3(givenStr));
        System.out.println("Reversed String (Solution4): " + reverseString_Sol4(givenStr));
    }

}