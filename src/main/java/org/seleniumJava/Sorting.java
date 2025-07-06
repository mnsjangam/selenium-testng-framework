package org.seleniumJava;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
//        sort.bubbleSort();

        sort.inversionCount();
    }


    public void bubbleSort(){
        int[] arr = {64, 34, 25, 12};
        for (int i=0; i<arr.length; i++){
            for (int j=1; j< arr.length -i; j++){
                if (arr[j - 1]  > arr[j]) {
                    int temp = arr[j -1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array printed after sorting "+ Arrays.toString(arr));
    }

    public void inversionCount() {
        int count =0;
        int[] a = {10, 4, 5, 62, 9, 45, 20, 59};
        for (int i=0; i <a.length; i++) {
            for (int j=1; j < a.length; j++) {
                if (a[i] > a[j] && i < j) {
                    count++;
                }
            }
        }
        System.out.println("Array printed after sorting "+ count);
    }

}
