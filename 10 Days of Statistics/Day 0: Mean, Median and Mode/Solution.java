/*
Question Link: https://www.hackerrank.com/challenges/s10-basic-statistics/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    //mean
    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static void mean(int[] arr, int n){
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        double res = sum/n;
        System.out.printf("%.1f \n", res);
    }
    
    //median
    // Time Complexity - O(1)
    // Space Complexity - O(1)
    public static void median(int[] arr, int n){
        int mid = 0;
        if(n % 2 == 0){  // even
            mid = (n-1)/2;
            double res = (arr[mid] + arr[mid+1]);
            System.out.printf("%.1f \n", res/2);
        } else{
            mid = (n-1)/2;
            System.out.printf("%.1f \n", arr[mid]);
        }
    }
    
    //mode
    // Time Complexity - O(n)
    // Space Complexity - O(n)
    public static void mode(int[] arr, int n){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == max) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // we need it to find median and mode. check the definition in hackerrank.
        mean(arr,n);
        median(arr,n);
        mode(arr,n);
        sc.close();
    }
}
