package DP;
public class fibonacci_t {
    // tablation method with extra sc :  
    // public static void main(String[] args) {
    //     int n = 5;
    //     int arr[] = new int[n+1];
    //     //Arrays.fill(arr,-1);
    //     System.out.println(solve(n-1,arr));
    // }
    // static int solve(int n,int[]arr){
    //     arr[0] = 0;
    //     arr[1] = 1;
    //     for(int i=2;i<=n;i++){
    //         arr[i] = arr[i-1]+arr[i-2];
    //     }
    //     return arr[n];
    // }


    //tabulation method : 

    public static void main(String[] args) {
        int n = 6;
        int prev = 0;
        int prev2 = 1;
        for(int i=2;i<=n;i++){
            int ans = prev+prev2;
            prev = prev2;
            prev2=ans;
        }
        System.out.print(prev2);
    }
}
