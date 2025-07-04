package org.seleniumJava;

import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PractiseCode {
    int a = 10;

    //default constructor
    void Practise() {}

    void Practise(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        PractiseCode practiseCode = new PractiseCode();

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

        // practiseCode.countWord("I am learning learning Java programming programming Java programming");

       //  practiseCode.countCharactersOfString("Java is object oriented language");

        // practiseCode.duplicateCharacterOfString("laptop");
        // practiseCode.isAnagram("silent", "listen");

//        practiseCode.firstNonRepeatingCharacter("laptop");
//        practiseCode.reverseString("levels");
//
//        practiseCode.stringExtract("www.erostrum.com");

//        practiseCode.reverseWord("We are learning Java");
//
//       1 practiseCode.reverseEachWord("We are learning Java");

//        int[] arr1 = {1, 3, 5};
//        int[] arr2 = {2, 4, 6};
//
//        int[] arraySorted = practiseCode.mergeSortedArrays(arr1, arr2);
//        System.out.println("Array sorted: " + Arrays.toString(arraySorted));

       //  practiseCode.mergeSort();

       //2  practiseCode.anagrams("silent", "listen");

//        int[] arr = {9, 4, 9, 2, 9, 59, 2, 59};
//       3 practiseCode.countFrequencyOfNumbers(arr);

//      4  practiseCode.fistNonRepeatingCharacter("swiss");
//      5  practiseCode.reverseStringDemo("listen");

//      6  practiseCode.reverseSentence("We are learning Java");
        int[] arr = {3, 6, 3, 5, 35, 2, 2, 2};
//     7   practiseCode.smallAndLargeElement(arr);

         //  practiseCode.findMissingNumber();
//      9  practiseCode.evenOrOdd();
        // 10
//        practiseCode.isPrimeNum(100);

        // 11 practiseCode.isLeapYear(1200);
       // 12 practiseCode.isArmStrong(370);

      // 13  practiseCode.checkVowelOrConsonant('i');
       // 14 practiseCode.factorial(5);

     // 15   practiseCode.fibonacci(4);
     //16   practiseCode.leftStarPattern();
      // 17  practiseCode.rightStarPattern();
      // 18  practiseCode.booleanToString();
     // 19   practiseCode.stringToDouble();

       // 20 practiseCode.doubleToString();

      // 21  practiseCode.stringToLong();

      // 22  practiseCode.longToString();

      //23   practiseCode.intToChar();
     // 24   practiseCode.charToInt();

        // 25  practiseCode.addValue();

      // 26  practiseCode.iterateList();

//     27   int[] a = {1, 2, 3, 5, 7};
//        practiseCode.linearSearch(a, 3);

       // 28 practiseCode.binarySearch();
        //int[] arr = new int[] {3, 10, 18, 25, 60};
       //  int x = 18;
//        int l = 0, r = arr.length - 1;
//        int index = practiseCode.recursiveSearchOfElement(arr, l, r, x);
//        System.out.println("Element found at index: " + index + " element :"+arr[index]);

        // int index = practiseCode.linearSearchDemo(arr, x);

//        int indexElement = practiseCode.binarySearchOfElement(arr, x);
//        System.out.println(indexElement +" element found "+x);
//        int max = practiseCode.LargestElementInArray(arr);
//        System.out.println(max);

//        practiseCode.sortArrayAscending(arr);

//        practiseCode.removeDuplicatesFromArray(arr);

        int[] arr1 = { 10, 20, 30, 40 };
        int[] arr2 = { 50, 60, 70, 80 };
        // practiseCode.mergeTwoArrays(arr1, arr2);

        // System.out.println("Arrays are equal : " +practiseCode.equalityCheck(arr1, arr1));

//        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
//        int k = 3;
//        practiseCode.removeAllOccurrences(a, k);

        // Create Array 1
        String[] str1 = { "Article", "in", "Geeks", "for", "Geeks" };

        // Create Array 2
        String[] str2 = { "Geeks", "for", "Geeks" };
        // practiseCode.findCommonElements(str1, str2);

        int a[] = { 1, 8, 3, 5, 10 };
        // practiseCode.arrayCopy(a);

       //  practiseCode.leftRotateArray1time(a);
        practiseCode.leftRotateArray2times(a);
    }

    // Java Program to Left Rotate the Elements of an Array
    public void leftRotateArray1time(int[] a){
       int last = a.length -1;
       for (int i = a.length-1; i>0; i--){
           a[i] = a[i - 1];
       }
       a[0] = last;
        System.out.println("Rotated array "+Arrays.toString(a));
    }

    // Java program to rotate an array 2 times to left
    public void leftRotateArray2times(int[] a){
        int d = 2, k=0;

        int[] temp = new int[a.length];
        for (int i = d; i <a.length; i++){
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i< d; i++){
            temp[k] = a[i];
            k++;
        }
        for (int i=0; i< temp.length; i++){
            a[i] = temp[i];
        }
        System.out.println("Rotated array "+Arrays.toString(a));
    }

    // Array Copy in Java
    public void arrayCopy(int[] a){
        int[] b = new int[a.length];
        int j=0;
        for (Integer i : a){
            b[j] = i;
            j++;
        }
        System.out.println("Array b is a copy of a : "+Arrays.toString(b));
        System.out.println("Equals "+Arrays.equals(a, b));
    }

    // Program to Find Common Elements Between Two Arrays
    public void findCommonElements(String[] str1, String[] str2){
        Set<String> set = new HashSet<>();
        for (int i= 0; i< str1.length; i++){
            for (int j=0; j< str2.length; j++){
                if (str1[i] == str2[j]){
                    set.add(str1[i]);
                }
            }
        }
        System.out.println("Common elements found : "+set);
    }

    // Remove all Occurrences of an Element from Array in Java
    public void removeAllOccurrences(int[] a, int target){
        int k=0;
        for (Integer i : a) {
            if (i != target) {
                a[k] = i;
                k++;
            }
        }
        System.out.println("Arrays are equal : " +Arrays.toString(a));
    }


    // Program to Check if two Arrays are Equal or not
    public boolean equalityCheck(int[] a, int[] b){
        if (a.length != b.length){
            return  false;
        }
        return Arrays.equals(a, b);
    }

    // Java Program to Find Largest Element in an Array
    public int LargestElementInArray(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (Integer i : arr){
//            if (i > max){
//                max = i;
//            }
//        }
//        return max;

        return Arrays.stream(arr).max().getAsInt();
    }

    // Program to Merge Two Arrays
    public void mergeTwoArrays(int[] arr1, int[] arr2){
        int[] arr3= new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i< arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged array "+Arrays.toString(arr3));
    }

    // Remove duplicates from Sorted Array
    public void removeDuplicatesFromArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : arr){
            if (!set.contains(i)){
                set.add(i);
            }
        }
        System.out.println("Unique elements in set"+ set);
    }

    // Sort the Elements of an Array in Descending Order
    public void sortArrayDescending(int[] arr){
        // how to convert int[] array into Integer wrapper class
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder());
        System.out.println(Arrays.toString(temp));
    }

    public void sortArrayAscending(int[] arr){
        // how to convert int[] array into Integer wrapper class
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
    }

    // Java Program to Search an element in an Array Recursively
    public int recursiveSearchOfElement(int[] arr, int left, int right, int target){
        if (left > right) {
            return -1;
        }
        if (arr[left] == target) {
            return left;
        }
        if (arr[right] == target) {
            return right;
        }
        return recursiveSearchOfElement(arr, left + 1, right - 1, target);
    }

    public int binarySearchOfElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int median = left + (right - left) / 2;
            if (arr[median] == target) {
                System.out.println("Element found at index: " + median);
                return median;
            } else if (arr[median] > target) {
                right = median - 1;
            } else {
                left = median + 1;
            }
        }
        return -1;
    }

    public int linearSearchDemo(int[] arr,int target) {
        if (arr.length == 1){
            return arr[0];
        }
        for (int i=0; i< arr.length; i++){
            if (arr[i] == target){
                System.out.println("Element found at index :"+ i+"  element is "+arr[i]);
                return i;
            }
        }
        return -1;
    }


    // Binary Search
//    Input: arr = { 3, 5, 7, 8, 10, 12, 15}, target = 7
//    Output: 2
    // int median = left + right / 2;
    public void binarySearch() {
        int[] arr = {3, 5, 7, 8, 10, 12, 15};
        int target = 7;

        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int median = left + (right - left) / 2;

            if (arr[median]  == target){
                System.out.println("Element found at index: " + median);
                return;
            } else if (arr[median] > target){
                right = median - 1;
            } else {
                left = median + 1;
            }
        }
    }

    // Java Program for Linear Search
    // Input: a = [ 1, 2, 3, 5, 7], x = 3
    //Output = Element found at index: 2
    public void linearSearch(int[] a, int x) {
        for (int i=0; i< a.length; i++){
            if (a[i] == x) {
                System.out.println("Element found at index: " + i);
            } else {
                System.out.println("Element not found");
            }
        }
    }


    //using Iterator interface to iterate through a list
    public void iterateList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator<String> iterate = list.iterator();

        System.out.println("list iterating "+iterate.next());
        System.out.println("list iterating "+iterate.next());

        System.out.println("list iterating using for loop "+iterate.hasNext());
    }


    // Add values in a hashtable using forEach loop
    public void addValue(){
        Map<Integer, String> map = new Hashtable<>();

//        map.forEach((i, v) -> {
//            map.put(i, "Value" + i);
//            System.out.println("Key: " + i + ", Value: " + map.get(i));
//        });

        map.forEach((i, v) -> {
            map.put(i, "Value" + i);
            System.out.println("Key"+ i +" value "+ v);
        });
    }

    // Int to Char Conversion
    public void intToChar() {
        int num = 75; // ASCII value for 'A'
        char ch = (char) num;
        System.out.println("Int to Char: " + ch);
    }

    // Char to int conversion
    public void charToInt() {
        char ch = 'M';
        int num = (int) ch;
        System.out.println("Char to Int: " + num);
    }

    // String to Long conversion
    public void stringToLong() {
        String str = "898938999288";
        Long l = Long.parseLong(str);
        System.out.println("String to Long: " + l);
    }

    // Long to String conversion
    public void longToString(){
        Long l = 8398939893L;
        String str = String.valueOf(l);
        System.out.println("Long to String: " + str);

    }

    // Double to String conversion
    public void doubleToString(){
        Double d= 127736.3882;
        String str = String.valueOf(d);
        System.out.println("Double to String: " + str);
    }

    // String to Double conversion
    public void stringToDouble() {
        String str = "127736.3882";
        try {
            Double d = Double.parseDouble(str);
            System.out.println("String to Double: " + d);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
    }


    // Boolean to string conversion
    public void booleanToString() {
        boolean bool = true;
        String str = Boolean.toString(bool);
        System.out.println("Boolean to String: " + str);
    }


    // Program to Print Right Triangle Star Pattern
    public void leftStarPattern() {
        for (int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    // Program to Print Left Triangle Star Pattern
    public void rightStarPattern() {
        for (int i=0; i<5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    public void pyramidPatern() {
//        for (int i=0; i< 5; i++){
//            for (int j=0; j< 5- 1; j++){
//                System.out.print(" ");
//            }
//        }
//    }


    // Fibonaaci series program
    public void fibonacci(int n){
        for (int i=0; i<=n; i++){
            System.out.println("Fibinacci "+ callFibonacci(i));
        }
    }

    public int callFibonacci(int n){
        if (n ==0) return 0;
        if (n==1) return 1;

        Map<Integer, Integer> map = new HashMap<>();

        if(map.containsKey(n)){
            return map.get(n);
        }

        int result = callFibonacci(n -1) + callFibonacci(n-2);
        map.put(n, result);
        System.out.println("Result "+ result);
        return result;
    }


    //  Program for Factorial of a Number
    public void factorial(int n){
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial for "+n +" "+fact);
    }


    //isArmStrong number
    public void isArmStrong(int n){
        // int temp = n;

        for (int i=0; i<= n; i++){
            int sum = 0;
            int j = i;

            while (j > 0){
                int digit = j % 10;

                sum += digit * digit * digit;
                j = j / 10;
            }

            if (sum == i) {
                System.out.println("Arm Strong");
            } else
                System.out.println("Not Arm Strong");
        }

    }

    public void isLeapYear(int n){
        int year = 1029;

        if ( year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }

    // All Prime Numbers from 1 to N
    public void isPrimeNum(int n){
        boolean isPrime;
        int k=0;
        int[] primes = new int[25];
        for (int i=2; i<= n; i++){
            isPrime = isPrime(i);
            if (isPrime) {
                primes[k] = i;
                k++;
            }
        }
        for (Integer i : primes){
            System.out.print(i +" ");
        }


    }

    public boolean isPrime(int n){
        int factors =0;
        for (int i= 1; i<=n; i++){
            if (n % i == 0){
                factors++;
            }
        }
        if (factors == 2){
            return true;
        }
        return false;
    }

    public int biggestOfThree(int x, int y, int z){
//        if (x > y && x > z)
//            return x;
//        else if (y> x && y > z)
//            return y;
//        else
//            return z;
        return Math.max(z, Math.max(x, y));
    }

    // Find Missing Number In Array
    public void addingAllArrayElements() {
        // add all the numbers in the array first
        int result = 0;

        int[] arr = IntStream.range(1, 11).toArray();

        for (Integer i : arr){
            result += i;
        }

        System.out.println("sum of all numbers "+result);
    }

    // Program to Check Whether the Character is Vowel or Consonant
    public void checkVowelOrConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }


    public void findMissingNumber() {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9 ,10};

        Set<Integer> set = new HashSet<>();

        for (Integer i : arr){
            set.add(i);
        }

        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);

        for (int i=min; i<= max; i++){
            if (!set.contains(i)){
                System.out.println("Missing number is: " + i);
            }
        }
    }

    public void missingFinderNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10}; // Example: 7 is missing, no explicit range

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Find min and max in the array to determine the range dynamically
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.println("Missing number is: " + i);
                break;
            }
        }
    }

    public void evenOrOdd(){
        int n= 101;

        if (n % 2== 0){
            System.out.println("even");
        } else  {
            System.out.println("odd");
        }
    }

    // How to find largest and smallest element in array
    public void smallAndLargeElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer i : arr){
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

    public void reverseSentence(String sentence) {
        String[] words= sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=words.length -1; i >=0; i--) {
            String word = words[i];
           for (int j=word.length() - 1; j>=0; j--){
                sb.append(word.charAt(j));
            }
            sb.append(" ");
        }
        System.out.println(sb+" ");
    }

    public void reverseStringDemo(String str) {
        StringBuilder strB = new StringBuilder();

        for (int i = str.length() - 1; i>=0 ; i--){
            strB.append(str.charAt(i));
        }

        System.out.println(strB);
    }

    public void countFrequencyOfNumbers(int[] arr){
        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i=0; i< arr.length; i++){
            if (hMap.containsKey(arr[i])){
                hMap.put(arr[i], hMap.getOrDefault(arr[i], 0) + 1);
            } else {
                hMap.put(arr[i], 1);
            }
        }

        int[] arr2 = new int[10];
        int count=0, k=0;
        for (Integer key : hMap.keySet()){
            count = hMap.get(key);
            for (int i=0; i< count; i++){
                arr2[k] = key;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

// Find First Non Repeated character
    public void fistNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i< str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            } else
                map.put(str.charAt(i), 1);
        }

        for (Character key : map.keySet()){
            if (map.get(key) == 1){
                System.out.println("First non-repeating character is: " + key);
                return;
            }
        }
    }



    // Count the occurrence of word in a given string
    public void countWord(String str){

        Map<String, Integer> hMap = new HashMap<>();

        int count = 1;

        String[] word = str.split(" ");

        for (String s : word) {
            if (!hMap.containsKey(s)){
                hMap.put(s, count);
            } else {
                hMap.put(s, hMap.get(s) +1);
            }
        }

        for (String key : hMap.keySet()){
            System.out.println("the word "+ key +" is present "+ hMap.get(key) + " times");
        }
    }

    public void countCharactersOfString(String str) {
        int result =0;
        Set<Character> set = new HashSet<>();

        for (int i=0; i< str.length(); i++){
            if (!set.contains(i)){
                set.add(str.charAt(i));
            }
        }
        if (!set.isEmpty()){
            for (Character i : set){
                result = str.length() - str.replaceAll(i.toString(), "").length();
                System.out.println("The character count of the string is: "
                        + i +" occurs these many times "+ result);
            }

        }
    }

    public void duplicateCharacterOfString(String str){
        Set<Character> set = new HashSet<>();
        int count = 0;
        char a = ' ';

        for (int i=0; i< str.length(); i++){
            if (!set.contains(i)){
                set.add(str.charAt(i));
                count++;
                a = str.charAt(i);
            }
        }
        if (count > 0){
            System.out.println("The string has duplicate character. "+ a);
        } else {
            System.out.println("The string does not have duplicate characters.");
        }
    }

    public void isAnagram(String str1, String str2){
        if (str1.length() != str2.length()){
            System.out.println("Strings are not anagrams.");
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }

    public void firstNonRepeatingCharacter(String str){
        Map<Character, Integer> hMap = new LinkedHashMap<>();
        // LinkedHashMap maintains the insertion order so it will return l from laptop
        char firstNonRepeating = ' ';
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!hMap.containsKey(ch)){
                hMap.put(ch, 1);
            } else {
                hMap.put(ch, hMap.get(ch) + 1);
            }
        }
        for (Character s: hMap.keySet()) {
            if (hMap.get(s) == 1){
                firstNonRepeating = s;
                break;
            }
        }
        System.out.println("First non-repeating character is: " + firstNonRepeating);
    }

    public void reverseString(String str){
        StringBuilder strB = new StringBuilder();
        for (int i =str.length() - 1; i>= 0 ;i--) {
            strB.append(str.charAt(i));
        }
        System.out.println("String reversed "+strB);
        if (strB.toString().equals(str)){
            System.out.println("String reversed is palindrome");
        }
    }

    public void stringExtract(String str){
        // first 4 characters
        String st = str.substring(0, 4);
        System.out.println("String extract is: " + st);

        String last4 = str.substring(str.length() -4);
        System.out.println("String extract is: " + last4);
    }

    public void reverseWord(String str){
        String[] ch = str.split(" ");
        StringBuilder b =  new StringBuilder();
        for (int i=ch.length -1; i>=0; i--){
            b.append(ch[i]);
            b.append(" ");
        }
        System.out.println("String reversed is: " + b);
    }

    public void reverseEachWord(String str){
        String[] ch = str.split(" ");
        // "We are learning Java"
        StringBuilder sb = new StringBuilder();
        for (String s : ch){
            StringBuilder b = new StringBuilder(s);
            b.reverse();
            sb.append(b);
            sb.append(" ");
        }
        System.out.println("each word reversed is: " + sb);
    }

    public int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        int i=0, j=0, k=0;

        int[] mergedArray = new int[length1 + length2];

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < length1){
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < length2){
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("Array sorted: " + Arrays.toString(mergedArray));
        return mergedArray;
    }

    // Sort the arrays using merge sort algorithm
    // step1 - find the length of the arrays should be greater than 1 to sort
    // steps 2- find the 0th index and last index of the array
    // steps2 - from the above 2 find the median of the array
    // now if the array left index == right index return an empty array this is the base condition
    // create 2 new arrays left array and right array using the median value
    // left array - arr, 0, median
    // right array - arr, median +1 , right
    // one we have the arrays sorted then merge into 1 array by using the above function mergeSortedArrays

    public void mergeSort() {
        int[] arr = {10, 4, 5, 62, 9, 45, 20, 59};
        int left = 0;
        int right = arr.length -1;

        mergeSortHelper(arr, left, right);
    }

    private int[] mergeSortHelper(int[] arr, int left, int right) {
        int median = (left + right) / 2;
        if (left == right){
            int[] base = new int[1];
            base[0] = arr[left];
            return base;
        }

        int[] leftArray = mergeSortHelper(arr, left, median);
        int[] rightArray = mergeSortHelper(arr, median + 1, right);

        return mergeSortedArrays(leftArray, rightArray);
    }

    public int inversionCount(){
        int[] arr = {10, 4, 5, 62, 9, 45, 20, 59};
        int count = 0;

        for (int i=0; i< arr.length; i++){
            for (int j=1; j< arr.length; j++){
                if (arr[i] > arr[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }

    public void anagrams(String str1, String str2){
        if (str1.length() != str2.length()){
            System.out.println("Strings are not anagrams.");
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagrams.");
        } else System.out.println("Strings are not anagrams.");
    }

}