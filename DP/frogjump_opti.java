<<<<<<< HEAD
package DP;

public class frogjump_opti {
    public static void main(String[] args) {
        int arr[] = {30,20,50,10,40};
        int n=arr.length;
        int dp[]=new int[n];
        int prev = 0;
        int prev2 = 0;
        for (int ind = 1; ind < n; ind++) {
            int oneJump = prev + Math.abs(arr[ind] - arr[ind - 1]);
            int twoJump = Integer.MAX_VALUE;

            if (ind > 1) {
                twoJump = prev2 + Math.abs(arr[ind] - arr[ind - 2]);
            }
            int cur = Math.min(oneJump, twoJump);

            prev2 = prev;
            prev = cur;

        }
        System.out.print(prev);
    }
}
=======
package DP;

public class frogjump_opti {
    public static void main(String[] args) {
        int arr[] = {30,20,50,10,40};
        int n=arr.length;
        int dp[]=new int[n];
        int prev = 0;
        int prev2 = 0;
        for (int ind = 1; ind < n; ind++) {
            int oneJump = prev + Math.abs(arr[ind] - arr[ind - 1]);
            int twoJump = Integer.MAX_VALUE;

            if (ind > 1) {
                twoJump = prev2 + Math.abs(arr[ind] - arr[ind - 2]);
            }
            int cur = Math.min(oneJump, twoJump);

            prev2 = prev;
            prev = cur;
        }
        System.out.print(prev);
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
