package org.seleniumJava;

import java.util.Arrays;

public class Practise2DArraysNew {
    public static void main(String[] args){
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

        p.smallestElementInEachRow(m);


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
}
