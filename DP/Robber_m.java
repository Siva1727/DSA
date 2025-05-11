<<<<<<< HEAD
package DP;

import java.util.Arrays;

public class Robber_m {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
     int[]dp = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(solve(nums.length-1,nums,dp));
    }
    static int solve(int ind,int[]arr,int[]dp){
        if(ind == 0)return arr[ind];
        if(ind < 0)return 0;
        if(dp[ind] != -1)return dp[ind];
        int pick = arr[ind] + solve(ind-2,arr,dp);
        int notpick = 0 + solve(ind-1,arr,dp);
        return dp[ind] = Math.max(pick,notpick);
    }
}
=======
package DP;

import java.util.Arrays;

public class Robber_m {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
     int[]dp = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(solve(nums.length-1,nums,dp));
    }
    static int solve(int ind,int[]arr,int[]dp){
        if(ind == 0)return arr[ind];
        if(ind < 0)return 0;
        if(dp[ind] != -1)return dp[ind];
        int pick = arr[ind] + solve(ind-2,arr,dp);
        int notpick = 0 + solve(ind-1,arr,dp);
        return dp[ind] = Math.max(pick,notpick);
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
