package DP;

public class ninjatraining_opti {
    // space optimaization
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int dp[]=new int[4];
        dp[0] = Math.max(arr[0][1], arr[0][2]);
        dp[1] = Math.max(arr[0][0], arr[0][2]);
        dp[2] = Math.max(arr[0][0], arr[0][1]);
        dp[3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2]));

        for(int day = 1; day < arr.length ; day++){
            int temp[]= new int[4];
            for(int last = 0 ; last < 4 ; last++){
                int max = 0;
                for(int task = 0; task < 3 ; task++){
                    if(task != last){
                        int point  = arr[day][task] +dp[task];
                        max = Math.max(max,point);
                    }
                }   
                temp[last] = max;
            }
            dp = temp;
        }

        System.out.println(dp[3]);
    }
    
}
