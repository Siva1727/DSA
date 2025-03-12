package DP;

public class ninjatraining_t {
     public static void main(String[] args) {
        int arr[][] = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int dp[][]=new int[arr.length][4];// there are only 3 tasks , and 4 is for the 1st day no task is picked at first.
        dp[0][0] = Math.max(arr[0][1], arr[0][2]);
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][0], arr[0][1]);
        dp[0][3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2]));

        for(int day = 1; day < arr.length ; day++){
            for(int last = 0 ; last < 4 ; last++){
                int max = 0;
                for(int task = 0; task < 3 ; task++){
                    if(task != last){
                        int point  = arr[day][task] + dp[day-1][task];
                        max = Math.max(max,point);
                    }
                }
                dp[day][last] = max;
            }
        }

        System.out.println(dp[arr.length-1][dp[0].length-1]);
    }
}
