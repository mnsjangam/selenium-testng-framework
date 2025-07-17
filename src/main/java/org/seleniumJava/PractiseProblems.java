package org.seleniumJava;

import java.util.*;
import java.util.stream.IntStream;

public class PractiseProblems {

    private int b;

    public static void main(String[] args) {
        PractiseProblems obj = new PractiseProblems();
//        obj.prefixSum();

//        obj.rangeSum();

//        obj.evenRangeSum();

//        obj.rangeSumDemo();

//        obj.equilibriumIndex();

//        obj.containsDuplicate();

        // obj.productExceptSelf();

//        char[] chars = {'a', 'd', 'g', 'a', 'g', 'a', 'g', 'f', 'g'};
//        obj.pairSmallestSubArray(chars);

//        obj.allSubArrays();
//        int[] A = {1, 3, 2};
//        obj.solve(A);

//        obj.twoDSubarrays(A);

//        obj.maxSubarray();

//        obj.kthsmallest();

//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(
//                Arrays.asList(
//                        new ArrayList<>(Arrays.asList(1, 2, 3)),
//                        new ArrayList<>(Arrays.asList(4, 5, 6)),
//                        new ArrayList<>(Arrays.asList(7, 8, 9))
//                )
//        );

//        obj.antiDiagonal(matrix);
//
//        ArrayList<Integer> B  = new ArrayList<>(Arrays.asList(3, 2, 1, 3));
//        // obj.nobleInteger(B);
//
//        ArrayList<Integer> J = new ArrayList<>(Arrays.asList(3, 5, 1));
//
//        obj.arithmeticProgression(J);
//
//        String Aa = "100";
//        String Bb = "11";
//        obj.addBinary(Aa, Bb);
//        obj.longestPalindrome("forgeeksskeegfor");

//        ArrayList<Character> C = new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'));
//        obj.solveIsalnum(C);

//        obj.solveStringOperations("aeiOUz");

//        obj.countOccurrences("bobob");

//        obj.solveAmazingString("ABEC");

//        obj.solveAnagram("bat","tab");

//        ArrayList<Integer> B  = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 1));
//        obj.repeatedNumber(B);

//        int[] A = {5, -2, 3 , 1, 2};
//        int B = 3;
//
//        obj.pickFromBothSides(A, B);

        obj.sumAllSubArrays();
    }


    public void sumAllSubArrays () {
        int totalSum=0;
        int[] a = {2, 8, -1, 4};
        for (int start =0; start<a.length; start++ ) {
            for (int end = start; end < a.length; end++){
                int sum =0;
                for (int i = start; i<=end; i++) {
                    sum += a[i];
                }
                totalSum += sum;
            }
        }
        System.out.println("Sum of subarray from index "+ totalSum);
    }

    public int  pickFromBothSides(int[] A, int B) {
        int n = A.length;

        int sum= 0;

        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        prefixSum[0] = A[0];

        //int[] A = {5, -2, 3 , 1, 2};

        for (int i=1; i<n; i++) {
            prefixSum[i] += A[i];
        }

        suffixSum[n-1]= A[n-1];
        System.out.println("prefixSum "+Arrays.toString(prefixSum));
        int i=0;
        for (int j=n-2; j>=0; j--) {
            suffixSum[i] += A[j];
            i++;
        }

        System.out.println("suffixSum "+Arrays.toString(suffixSum));

        // while (p1<=p2 && B>0) {
        //     if ( A[p1] >= A[p2] ) {
        //         sum += A[p1];
        //         p1++;
        //         B--;
        //     } else {
        //         sum += A[p2];
        //          p2--;
        //          B--;
        //     }
        // }
        return sum;
    }


    public int repeatedNumber(final List<Integer> a) {
        int result = -1;

        Map<Integer, Integer> hMap = new HashMap<>();
        for (Integer num : a) {
            hMap.put(num, hMap.getOrDefault(num, 0) + 1);
            if (hMap.get(num) > num / 3) {
                result = num;
                System.out.println("Repeated number: " + result);
                break;
            }
        }
        return result;
    }

    //anagrams

    public int solveAnagram(String A, String B) {
        int result =0;

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            result =1;
        }
        System.out.println("result "+result);
        return result;
    }


    public String prefix(ArrayList<String> A) {
        StringBuilder str = new StringBuilder();

        String first = A.get(0);
        boolean found = true;
        for (int j = 0; j < first.length(); j++) {
            char ch = first.charAt(j);
            for (int i = 1; i < A.size(); i++) {
                String s = A.get(i);
                if (s.charAt(j) != ch) {
                    found = false;
                }
            }
            if (found) {
                str.append(ch);
                continue;
            }
            break;
        }
        return str.toString();
    }

    public int solveAmazingString(String A) {

        // given amazing string solve
        // find amazing substring of s
        // amazing substring is the one starts with a vowel a e i o u

        // mansi  a an ans ansi i
        int count =0;
        StringBuilder strB = new StringBuilder();
        for (int i=0; i< A.length(); i++){
            char ch = A.charAt(i);
            // ABEC A AB ABE ABEC E EC
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                strB.append(ch);
                for (int j= i+1; j<A.length() - A.indexOf(ch); j++){
                    strB.append(A.charAt(j));
                }
                System.out.println(" strB "+strB);
                count = strB.length();
            }
        }
        return count;
    }

    public int  countOccurrences(String A) {
        int n = A.length();
        int index =0;
        String longest = A.substring(0, 1);

        for (int i=0; i<A.length(); i++) {
            String temp1 = palin(A, i, i);
            String temp2 = palin(A, i, i+1);
            if (temp1.length() > longest.length()) {
                longest = temp1;
            } else if (temp2.length() > longest.length()) {
                longest = temp2;
            }
        }

        int count =0;
        for (int i = 0; i <= A.length() - longest.length(); i++) {
            if (A.substring(i, i + longest.length()).equals(longest)) {
                count++;
            }
        }

        System.out.println("Index of the longest palindrome: " + count);
        return count;
    }

    public int occur(String A) {
        int len = A.length();

        int count =0;
        int n = "bob".length();

        // abobc

        if (A.contains("bob")){
            for (int i=0; i< len - n; i++) {
                A.substring(i, i + n).equals("bob");
                count++;
            }
        }
        return count;
    }

    public String palin(String A, int i, int j){
        while (i>=0 && j<A.length() && A.charAt(i) == A.charAt(j)){
            i--;
            j++;
        }
        return A.substring(i+1, j);
    }

    public String solveStringOperations(String A) {
        StringBuilder str = new StringBuilder();
        str.append(A.concat(A));

        // delete the uppsercases from str using replaceAll
        str = new StringBuilder(str.toString().replaceAll("[A-Z]", ""));

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str.setCharAt(i,'#');
            }
        }
            System.out.println("Processed String: " + str);
            return str.toString();
        }


    public int solveIsalnum(ArrayList<Character> A) {
        int result =0;
        for (int i=0; i<A.size(); i++) {
            char ch = A.get(i);
            if (Character.isLetterOrDigit(ch)) {
                System.out.println("Character is alphanumeric: " + ch);
                result = 1;
            }
        }
        System.out.println("Result: " + result);
        return result;
    }

    public String longestPalindrome(String A) {
        int len = A.length();

        String temp = "";
        String longest = A.substring(0, 1);

        if (len == 1) {
            return longest;
        }

        for (int i=0; i<len; i++) {
            temp = palincheck(A, i, i);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            temp = palincheck(A, i, i+1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }

    public String palincheck(String s,  int i, int j) {
        while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i+ 1, j);
    }

//    // longestPalindrome
//    public String longestPalindrome(String A) {
//        int len = A.length();
//
//        String longest = A.substring(0, 1);
//
//        if (len <= 1) {
//            return longest;
//        }
//
//        for (int i = 0; i < len; i++) {
//            // Odd length palindrome
//            String p1 = palincheck(A, i, i);
//            if (p1.length() > longest.length()) {
//                longest = p1;
//            }
//            // Even length palindrome
//            String p2 = palincheck(A, i, i + 1);
//            if (p2.length() > longest.length()) {
//                longest = p2;
//            }
//        }
//        System.out.println(longest);
//        return longest;
//    }
//
//        public String palincheck(String A, int i, int j) {
//            while (i>=0 && j<A.length() && A.charAt(i) == A.charAt(j)) {
//                i--;
//                j++;
//            }
//            return A.substring(i + 1, j);
//        }

    //You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
    //You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
    public void toggleCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i <str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                stringBuilder.append(Character.toLowerCase(c));
            } else {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
    }

    //dry run this method
    public String addBinary(String A, String B) {
        int i = A.length() -1, j = B.length() -1;
        int carry = 0, sum =0;
        StringBuilder str = new StringBuilder();
        while (i >=0 || j >=0 || carry > 0) {
            int digit1 = (i >=0 ) ? A.charAt(i) - '0' : 0;
            int digit2 = (j >=0 ) ? B.charAt(j) - '0' : 0;
            sum = digit1 + digit2 + carry;
            int digit = sum % 2;
            carry = sum / 2;
            str.append(digit);
            i--;
            j--;
        }
        str.reverse();
        return str.toString();
    }


public int arithmeticProgression(ArrayList<Integer> A) {
        Collections.sort(A);
        int diff = A.get(1) - A.get(0);
        for (int i=2; i< A.size(); i++) {
            if (A.get(i) - A.get(i-1) != diff){
                System.out.println("Not an arithmetic progression");
                return 0;
            }
        }
        return 0;
    }

    public int solve(final List<ArrayList<Integer>> A) {
        int n = A.size();
        // i +j = n + 1;
        // i + 1 + j + 1 = n + 1;
        // i + j + 2 = n + 1;
        // i + j = n + 1 - 2;
        // i + j = n - 1;
        // j = n - 1 - i;
        // A[i][j] = A[i] + (n - 1 - i);
        int sum =0;
        for (int i =0; i < n; i++) {
            int j = A.get(i).get(n - 1 - i);
            sum += j ;
        }
        return sum;
    }

//    public int nobleInteger(ArrayList<Integer> A) {
//        Collections.sort(A);
//        int n = A.size();
//        for (int i = 0; i < n; i++) {
//            // Skip duplicates
//            // 1, 2, 3, 3
//            if (i < n - 1 && A.get(i).equals(A.get(i + 1))) continue;
//            if (A.get(i) == n - i - 1) {
//                System.out.println("Noble integer found: " + A.get(i));
//                return 1;
//            }
//        }
////
//        return -1;
//    }


    // Anti diagonals

    public ArrayList<ArrayList<Integer>> antiDiagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for (int i=0; i< 2 * A.size() -1; i++){
            B.add(new ArrayList<>());
        }
        for (int i=0; i<A.size(); i++){
            for (int j = 0; j<A.get(0).size(); j++){
                B.get(i + j).add(A.get(i).get(j));
            }
        }
        for (int i=0; i< 2 * A.size() -1; i++){
            while (B.get(i).size() != A.size() ){
                B.get(i).add(0);
            }
        }
        System.out.print("Anti-diagonal matrix: " + B + " ");
        return B;
    }


    //
    public int kthsmallest() {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 2));
        int B = 3;

        Collections.sort(A);
        int index = -1;
        for (int i = 0; i< A.size(); i++) {
            if (A.get(i) == B){
                index = A.get(i -1);
                System.out.println("Kth smallest element: " + index);
                break;
            }
        }
        return index;
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
        int b = 12;
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));

        int maxSum = 0;

        for (int start =0; start<A; start++){
            for (int end= start; end<A; end++){
                int sum =0;
                for (int k=start; k<=end; k++){
                    sum += C.get(k);
                    if (sum > b){
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
