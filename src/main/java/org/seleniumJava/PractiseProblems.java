package org.seleniumJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PractiseProblems {

    public static void main(String[] args) {
        PractiseProblems obj = new PractiseProblems();
//        obj.prefixSum();

//        obj.rangeSum();

//        obj.evenRangeSum();

//        obj.rangeSumDemo();

//        obj.equilibriumIndex();

        obj.containsDuplicate();
    }



    public void prefixSum(){
        int[] arr = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};
        int[] c = new int[2];
        int sum=0, k=0;

        for (int i=0; i<b.length; i++) {
            int l = b[i][0];
            int r = b[i][1];
            for (int j = l; j<=r; j++) {
                sum += arr[j];
            }
            c[k] = sum;
            k++;
        }
        System.out.println("Prefix sum array "+ Arrays.toString(c));
    }

    public long[] rangeSum() {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}};
        int k=0;
        long[] c = new long[B.length];
        for (int i=0; i<B.length; i++){
            int sum=0;
            int l = B[i][0];
            int r = B[i][1];

            for (int j=l; j<=r; j++){
                sum += A[j];
            }
            c[k] =  sum;
            k++;
        }
        System.out.println("Range sum array "+ Arrays.toString(c));
        return c;
    }

    public void twoSum() {

    }

    // Even numbers in a range
    public int[] evenRangeSum() {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 2}, {2, 4}, {1, 4}};

        int[] count = new int[B.length];

        for (int i=0; i<B.length; i++) {
            int counter =0;
            int l = B[i][0];
            int r = B[i][1];

            for (int j=l; j<=r; j++){
                if (A[j] % 2 == 0){
                    counter++;
                }
            }
            count[i] = counter;
        }
        System.out.println(Arrays.toString(count));
        return count;
    }

   // Prefix sum for range sum queries
     public long[] rangeSumDemo() {
         int[] A = {1, 2, 3, 4, 5};
         int[][] B = {{0, 3}, {1, 2}};

         long[] prefixSum = new long[A.length +1];

         for (int i=1; i< A.length; i++){
             prefixSum[i] = prefixSum[i -1] + A[i -1];
         }

         long[] result = new long[B.length];

         for (int j=0; j<B.length; j++){
             int l = B[j][0];
             int r = B[j][1];

             result[j] = prefixSum[r +1] - prefixSum[l];
         }
         System.out.println("Range sum result: " + Arrays.toString(result));
         return result;
    }


    // TODO: Implement twoSum method
    // Equilibrium index of an array
    public int equilibriumIndex() {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int n = A.length;
        int[] prefixSum = new int[A.length + 1];

        for (int i=1; i< A.length; i++){
            prefixSum[i] = prefixSum[i-1] + A[i-1];
        }

        for (int i = 0; i < n; i++) {
            int leftSum = prefixSum[i];
            int rightSum = prefixSum[n] - prefixSum[i + 1];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium index found at: " + i);
                return i;
            }
        }

        return -1;
    }

    // Contains Duplicate
    public boolean containsDuplicate(){
        int[] nums = {1, 2, 3, 1};
        boolean isDuplicate = false;

//        List<Integer> list = Arrays.stream(nums).boxed().toList();
//        for (Integer i : list){
//            if (list.contains(i)){
//                isDuplicate = true;
//            }
//        }

        Set<Integer> set = new HashSet<>();
        for (Integer num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        System.out.println("Contains Duplicate: " + isDuplicate);
        return isDuplicate;
    }

}
