package org.seleniumJava;

import java.util.Arrays;
import java.util.Stack;

public class StringOperations {
    public static void main(String[] args) {
        StringOperations s = new StringOperations();

//        String str = "hello world";
//        s.getCharFromString("Geeks", 2);

        // Replace a character at a specific index in a String in Java
        // Input: String = "Geeks Gor Geeks", index = 6, ch = 'F'
        //Output: "Geeks For Geeks."
        String string = "Geeks Gor Geeks";
        char c = string.charAt(6);
//        StringBuilder stringBuilder = new StringBuilder(string);
//        stringBuilder.setCharAt(6, 'F');
//        System.out.println(stringBuilder);

//        String str = string.substring(0, 6) + 'F' + string.substring(7);
//        System.out.println(str);

         // s.reverseString("Geeks");

       //  s.reverseWithStack("GeeksForGeeks");

      //   s.sortString("GeeksforGeeks");

       //  s.swapCharPair("GeeksForGeeks");

        s.anagram("silent", "listen");
    }

    // Java Program to Get a Character from a String
    // Input: str = "Geeks", index = 2
    public void getCharFromString(String string, int i) {
        char c = string.charAt(i);
        System.out.println(" Character at "+i +" "+c);
    }

    // Reverse a String in Java
    public void reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() -1; i >=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }

    // Java Program to Reverse a String using Stack
    public void reverseWithStack(String str){
        Stack<Character> stack = new Stack<>();
        for (int i=str.length() -1; i>=0; i--){
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
    }

    // Sort a String in Java (2 different ways)
    public void sortString(String str){
        char[] charArray = new char[str.length()];
        int k=0;
//        Arrays.sort(charArray);
//        System.out.println(Arrays.toString(charArray));
        for (int i= str.length() - 1; i>=0 ; i--){
            charArray[k] = str.charAt(i);
            k++;
        }
        System.out.println(Arrays.toString(charArray));
    }


    // Swapping Pairs of Characters in a String in Java
    public void swapCharPair(String str){
        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length - 1; i++){
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i +1] = temp;
        }
        System.out.println(Arrays.toString(charArray));
    }

    // Strings are anagram
    public void anagram(String str1, String str2){
        char[] str3 = str1.toCharArray();
        char[] str4 = str2.toCharArray();
        Arrays.sort(str3);
        Arrays.sort(str4);
        if (Arrays.equals(str3, str4)){
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }

    // Check if a given string is Pangram in Java
    public void pangram(){

    }
}
