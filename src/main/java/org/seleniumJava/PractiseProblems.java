package org.seleniumJava;

import java.util.*;

public class PractiseProblems {

    public static void main(String[] args) {
        PractiseProblems obj = new PractiseProblems();
//        obj.prefixSum();

//        obj.rangeSum();

//        obj.evenRangeSum();

//        obj.rangeSumDemo();

//        obj.equilibriumIndex();

//        obj.containsDuplicate();

        // obj.productExceptSelf();

        char[] chars = {'a', 'd', 'g', 'a', 'g', 'a', 'g', 'f', 'g'};
//        obj.pairSmallestSubArray(chars);

//        obj.allSubArrays();
        int[] A = {1, 3, 2};
//        obj.solve(A);

//        obj.twoDSubarrays(A);

        obj.maxSubarray();
    }

    // Pick from both sides!
    //Unsolved
    //feature icon
    //Using hints except Complete Solution is Penalty free now
    //Use Hint
    //Problem Description
    //
    //You are given an integer array A of size N.
    //
    //You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
    //
    //Find and return the maximum possible sum of the B elements that were removed after the B operations.
    //
    //NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
    //
    //Remove 3 elements from front and 0 elements from the back, OR
    //Remove 2 elements from front and 1 element from the back, OR
    //Remove 1 element from front and 2 elements from the back, OR
    //Remove 0 elements from front and 3 elements from the back.


//    You are given an integer array C of size A. Now you need to find a subarray
//            (contiguous elements)
//    so that the sum of contiguous elements is maximum.
//    But the sum must not exceed B.
    public int maxSubarray() {
        int A = 5;
        int B = 12;
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));

        int maxSum = 0;

        for (int start =0; start<A; start++){
            for (int end= start; end<A; end++){
                int sum =0;
                for (int k=start; k<=end; k++){
                    sum += C.get(k);
                    if (sum > B){
                        break; // If sum exceeds B, no need to continue
                    }
                }
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println("Maximum subarray sum not exceeding B: " + maxSum);
        return maxSum;
    }


    // Generate all subarrays
    public int[][] twoDSubarrays(int[] A) {
        int n = A.length;
        int[][] B = new int[n][n];

        for (int start=0; start<n; start++){
            for (int end=start; end<n; end++){
                for (int k= start; k<= end; k++){
                    B[start][end] = A[k];
                }
            }
        }
        System.out.println("2D Subarrays: " + Arrays.deepToString(B));
        return B;
    }

     //  Closest Subarray from MinMax
    public int solve(int[] A) {
        int n= A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex=-1, maxIndex=-1;
        int ans = Integer.MAX_VALUE;
        for (int i: A){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        for (int i=0; i<A.length; i++) {
            if (A[i] == max) {
                maxIndex = Math.max(maxIndex, i);
            }
            if (A[i] == min) {
                minIndex = Math.max(minIndex, i);
            }

            if (minIndex != -1 && maxIndex != -1) {
                int len = Math.abs(minIndex - maxIndex) + 1;
                ans = Math.min(ans, len);
            }
        }
        System.out.println("Minimum length of subarray containing min and max: " + ans);
            return ans;
    }

    // Generate all possible subArrays
    public void allSubArrays() {
        int[] a = {1, 2, 3, 4};
        for (int start=0; start < a.length; start++) {
            for (int end=start; end < a.length; end++) {
                for (int i=start; i<=end; i++) {
                    System.out.print(a[i]+" ");
                }
                System.out.println();
            }
        }
    }


    public long solve(String A) {
        long count=0;
        int n = A.length();
        for (int i=0; i<n; i++) {
            if (A.charAt(i) == 'A'){
                for (int j = i+1; j<n; j++){
                    if (A.charAt(j) == 'G'){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void pairSmallestSubArray(char[] A){
        int n = A.length;
        int count =0;
        for (int i=0; i< n; i++) {
            if (A[i] == 'a'){
                for (int j=i+1; j<n; j++){
                    if (A[j] == 'g'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    // TODO
    public int[] productExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] answer = new int[n];

        int prefix =1, suffix = 1;
        Arrays.fill(answer, prefix);

        for (int i=0; i<nums.length; i++){
            prefix *= nums[i];
            answer[i] = prefix;
            System.out.println(Arrays.toString(answer));
        }

        for (int i=nums.length -1; i >=0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
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
