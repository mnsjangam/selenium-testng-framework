package org.seleniumJava;

import com.sun.source.doctree.SeeTree;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Practise2DArraysNew {
    public static void main(String[] args) throws MyException{
        Practise2DArraysNew p = new Practise2DArraysNew();

//        int[][] mat = { { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 } };
        // p.print2DArray(mat);

//        int[][] A = { { 1, 2 }, { 3, 4 } };
//        int[][] B = { { 1, 1 }, { 1, 1 } };
//        p.add2DArray(A, B);

        int[][] m= { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 } };
       // p.largestElementInRow(m);

//        p.smallestElementInEachRow(m);

//        p.sortElementsInRow(m);

//        p.sortElementsInColumn(m);

//        p.arithmatic();

//        p.listTask();

//        p.lambdaSortStrings();
//
//        p.lambdaIntegerStream();
//        p.customException(15);

//        p.stringImmutability();

//        p.stringFunctions();

        p.stringCompare();
    }


    // StringImmutability
    public void stringImmutability() {
        String str = "Hello";

        str.concat("Mansi");
        System.out.println("String updated "+str);

        str = str.concat(" ");
        str = str.concat("Mansi");
        System.out.println("String updated later with concat and saving into the string literal str "+str);
    }

    //  Create a string and try to modify it using concat and substring
    public void stringFunctions() {
        String str = "Capgemini";
        str = str.concat(" Is my Company Forever ");
        System.out.println("String updated "+str);
        System.out.println(" substring "+str.substring(0, 23));
    }

    // Compare memory references using '==' vs equals().
    public void stringCompare(){
        String str1 = "Mansi";
        String str2 = "Mansi";

        String str3 = new String("Mansi");
        if (str2.equals(str3)) {
            System.out.println(" str1 equals str3 ");
        }
    }


    // 1. Write a program that throws and catches a custom exception if age < 18.

    public void customException(int age) {
        MyException exception = new MyException();
        try {
            if (age < 18) {
                System.out.println("I am here ");
                throw exception;
            }
        } catch (MyException e) {
            System.out.println("Exception thrown as age wasn the correct one "+e.getMessage());
        }

    }


    // 2. Demonstrate try-catch-finally in file reading.
    public void readFile() {
        try {
           String fileName, path;

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name to create:");
            fileName = bf.readLine();

            System.out.println("Enter the path of the file to create:");
            path = bf.readLine();

            String fullPath = path +"\\"+ fileName;

            File file =  new File(fullPath);

            if (file.createNewFile() ){
                System.out.println("File created successfully at: " + fullPath);
            } else {
                System.out.println("File already exists at: " + fullPath);
            }

        } catch (IOException e) {
            System.out.println("Error occurred while trying to read the file"+e.getMessage());
        }

    }

// Fiedelity practice code
    public void lambdaList() {
        List<String> names = Arrays.asList("a", "b", "C", "D", "E");
        names.forEach(System.out::println);
    }

    public void lambdaIntegerStream() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);
        List<Integer> num = numbers.stream().filter( n -> n % 2 == 0).toList();
        num.forEach(System.out::println);
    }
//
//    1. Use Stream API to find the sum of even numbers in a list.
    public int lambdaIntegerStream2() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);
        List<Integer> nums = numbers.stream().filter(n -> n % 2 ==0).toList();
        int sum=0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;
    }

//2. Use lambda to sort a list of strings alphabetically.
//
    public void lambdaSortStrings() {
        List<String> names = new ArrayList<>();

        names.add("chetan");
        names.add("baban");
        names.add("cista");
        names.add("srujan");
        names.add("mansi");
        names.add("albert");

        names.stream().sorted().forEach(System.out::println);
    }


    // Exception Handling
    public void arithmetic(){
        try {
            int num = 10 / 0;
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("I am in the finally block");
        }
    }




    //    Practice Tasks:
//    List Task: Add 5 student names to an ArrayList, then print them in reverse.
    public void listTask() {
        List<String> names = new ArrayList<>();
        names.add("Mansi");
        names.add("Anjan");
        names.add("Girish");
        names.add("Sanjay");
        names.add("Ravi");

        for(String name : names) {
            System.out.println(name);
        }
    }

//    Set Task: Add a list of city names to a HashSet, then try adding duplicates and observe output.
    public void setTask() {
        Set<String> set = new HashSet<>();
        set.add("New York");
        set.add("Mumbai");
        set.add("New York");
        set.add("Tokyo");
        set.add("Pune");

        for (String string : set) {
            System.out.println(string);
        }
    }

//    Map Task: Create a Map<Integer, String> to store roll number and student name. Iterate in two ways
    public void taskMap(){
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "mansi");
        hMap.put(2, "anjan");
        hMap.put(3, "girish");

        for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
            System.out.println("key is "+entry.getValue() +" value is "+entry.getValue());
        }

        for (Integer i : hMap.keySet()) {
            System.out.println("key is "+ i+ " value " +hMap.get(i));
        }
    }

    // Java Program to Print the 2D Array
    public void print2DArray(int[][] a){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }

    // Java Program to Add two Matrices
    public void add2DArray(int[][] a, int[][] b){
        int[][] c= new int[a.length][a[0].length];
        for (int i=0; i<a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

    }

    // Sorting a 2D Array according to values in any given column in Java
    public void largestElementInRow(int[][] a){
        for (int i=0; i<a.length; i++) {
            int temp = Integer.MIN_VALUE;
            for (int j = 0; j < a[0].length; j++) {
                if (temp < a[i][j]){
                    temp = a[i][j];
                }
            }
            System.out.println("Max value from current column = "+temp);
        }
    }

    public void smallestElementInEachRow(int[][] a){
        for (int i=0; i<a.length; i++){
            int temp = Integer.MAX_VALUE;
            for (int j=0; j <a[0].length; j++){
                if (a[i][j] < temp){
                    temp = a[i][j];
                }
            }
            System.out.println("Min value from current column = "+temp);
        }
    }

    public void sortElementsInRow(int[][] a){
        for (int i=0; i<a.length; i++){
            Arrays.sort(a[i]);
            System.out.println("Sorted row "+i+" = "+ Arrays.toString(a[i]));
        }
    }

    public void sortElementsInColumn(int[][] a){
            for (int j=0; j<a[0].length; j++){
                int[] col = new int[a.length];
                for (int i=0; i<a.length; i++) {
                    col[i] = a[i][j];
                    Arrays.sort(col);
                    System.out.println("Sorted column " + Arrays.toString(a[j]));
            }
        }
    }
}
