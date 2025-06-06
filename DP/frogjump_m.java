<<<<<<< HEAD
package DP;
// Given an integer array height[] where height[i] represents the height of the i-th stair,
//  a frog starts from the first stair and wants to reach the top. From any stair i, the frog has two options:

import java.util.Arrays;

//   it can either jump to the (i+1)th stair or the (i+2)th stair. The cost of a jump is the absolute 
//   difference in height between the two stairs. Determine the minimum total cost required for the frog to reach 
//   the top.

// Example:

// Input: heights[] = [20, 30, 40, 20] 
// Output: 20
// Explanation:  Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:
// jump from stair 0 to 1: cost = |30 - 20| = 10
// jump from stair 1 to 3: cost = |20-30|  = 10
// Total Cost = 10 + 10 = 20
// Input: heights[] = [30, 20, 50, 10, 40]
// Output: 30

// Explanation: Minimum cost will be incurred when frog jumps from stair 0 to 2 then 2 to 4:
// jump from stair 0 to 2: cost = |50 - 30| = 20
// jump from stair 2 to 4: cost = |40-50|  = 10
// Total Cost = 20 + 10 = 30


public class frogjump_m {
    public static void main(String[] args) {
        int arr[] = {30,20,50,10,40};
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int min = solve(0, arr,dp);
        System.out.println(min);
    }

    static int solve(int ind,int[]arr,int[]dp){
        if(ind == arr.length-1){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int one = Integer.MAX_VALUE, two = Integer.MAX_VALUE;
        
        if(ind+1 < arr.length){
            one = Math.abs(arr[ind] - arr[ind+1]) +solve(ind+1,arr,dp);
        }
        if(ind+2 < arr.length){
            two = Math.abs(arr[ind] - arr[ind+2]) +solve(ind+2,arr,dp);
        }
        
        return dp[ind] = Math.min(one,two);
    }
    
}
=======
package DP;
// Given an integer array height[] where height[i] represents the height of the i-th stair,
//  a frog starts from the first stair and wants to reach the top. From any stair i, the frog has two options:

import java.util.Arrays;

//   it can either jump to the (i+1)th stair or the (i+2)th stair. The cost of a jump is the absolute 
//   difference in height between the two stairs. Determine the minimum total cost required for the frog to reach 
//   the top.

// Example:

// Input: heights[] = [20, 30, 40, 20] 
// Output: 20
// Explanation:  Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:
// jump from stair 0 to 1: cost = |30 - 20| = 10
// jump from stair 1 to 3: cost = |20-30|  = 10
// Total Cost = 10 + 10 = 20
// Input: heights[] = [30, 20, 50, 10, 40]
// Output: 30

// Explanation: Minimum cost will be incurred when frog jumps from stair 0 to 2 then 2 to 4:
// jump from stair 0 to 2: cost = |50 - 30| = 20
// jump from stair 2 to 4: cost = |40-50|  = 10
// Total Cost = 20 + 10 = 30


public class frogjump_m {
    public static void main(String[] args) {
        int arr[] = {30,20,50,10,40};
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int min = solve(0, arr,dp);
        System.out.println(min);
    }

    static int solve(int ind,int[]arr,int[]dp){
        if(ind == arr.length-1){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int one = Integer.MAX_VALUE, two = Integer.MAX_VALUE;
        
        if(ind+1 < arr.length){
            one = Math.abs(arr[ind] - arr[ind+1]) +solve(ind+1,arr,dp);
        }
        if(ind+2 < arr.length){
            two = Math.abs(arr[ind] - arr[ind+2]) +solve(ind+2,arr,dp);
        }
        
        return dp[ind] = Math.min(one,two);
    }
    
}
>>>>>>> 01ed7d3 (commit stack and queue)
