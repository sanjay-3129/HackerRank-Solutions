/*
Question Link: https://www.hackerrank.com/challenges/s10-weighted-mean/problem

*/

import java.io.*;
import java.util.*;

public class Solution {

    // Time Complexity - O(n)
    // Space Complexity - O(1)
    public static void weightedMean(int[] x, int[] w, int n){
        double meanSum = 0, weightSum = 0;
        for(int i=0; i<n; i++){
            meanSum += x[i] * w[i];
            weightSum += w[i];
        }
        double res = meanSum/weightSum;
        double roundedOff = Math.round(res * 100.0)/100.0;   // by using this, we can round off the decimal to correct value
        System.out.printf("%.1f", roundedOff);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] w = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            w[i] = sc.nextInt();
        }
        weightedMean(x, w, n);
        sc.close();
    }
}
