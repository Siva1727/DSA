package DP;

public class Robber_t {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        int dp[]=new int[nums.length];
        dp[0] = nums[0];
        int neg = 0;
        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i > 1){
                take+=dp[i-2];
            }
            int not =  0 + dp[i-1];
            dp[i] = Math.max(take,not);
        }
        System.out.println(dp[nums.length-1]);
    }
}
