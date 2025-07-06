package org.seleniumJava;

import java.util.*;

public class MorePractise {
    public Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        MorePractise morePractise = new MorePractise();
        // int n = morePractise.fibonacciSeries(5);

        morePractise.stringToCharList("Java Welcome to Selenium");
    }

    public int fibonacciSeries(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        map.put(n, result);
        System.out.print(result + " ");
        return result;
    }

    public void stringToCharList(String str) {
        List<Character> charList = new ArrayList<>();
        for (int i=0; i< str.length(); i++){
            charList.add(str.charAt(i));
        }
        System.out.println("Character List: " + charList);
    }
}
