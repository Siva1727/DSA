<<<<<<< HEAD
package DP;

import java.util.Arrays;

public class ninjatraining_m {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int dp[][]=new int[arr.length][arr[0].length+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(solve( arr.length - 1, 3, arr,dp));
    }

    static int solve(int day, int last, int arr[][],int dp[][]) {
        if(dp[day][last] != -1)return dp[day][last];
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < arr[0].length; i++) {
                if (i != last) {
                    max = Math.max(max, arr[day][i]);
                }
            }
            return dp[day][last] = max;
        }
        int max = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (i != last) {
                int point = arr[day][i] + solve(day-1,i,arr,dp);
                max = Math.max(point,max);
            }
        }
        return dp[day][last] = max;
    }

}
=======
package DP;

import java.util.Arrays;

public class ninjatraining_m {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int dp[][]=new int[arr.length][arr[0].length+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(solve( arr.length - 1, 3, arr,dp));
    }

    static int solve(int day, int last, int arr[][],int dp[][]) {
        if(dp[day][last] != -1)return dp[day][last];
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < arr[0].length; i++) {
                if (i != last) {
                    max = Math.max(max, arr[day][i]);
                }
            }
            return dp[day][last] = max;
        }
        int max = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (i != last) {
                int point = arr[day][i] + solve(day-1,i,arr,dp);
                max = Math.max(point,max);
            }
        }
        return dp[day][last] = max;
    }

}
>>>>>>> 01ed7d3 (commit stack and queue)
