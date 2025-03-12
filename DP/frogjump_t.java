package DP;

public class frogjump_t {
    public static void main(String[] args) {
        int arr[] = {30,20,50,10,40};
        int n=arr.length;
        int dp[]=new int[n];
        dp[0]= 0;
        for (int ind = 1; ind < n; ind++) {
            int oneJump = dp[ind - 1] + Math.abs(arr[ind] - arr[ind - 1]);
            int twoJump = Integer.MAX_VALUE;

            if (ind > 1) {
                twoJump = dp[ind - 2] + Math.abs(arr[ind] - arr[ind - 2]);
            }

            dp[ind] = Math.min(oneJump, twoJump);
        }

        System.out.println(dp[n - 1]);
    }
}
