package Arrays;

public class eqilibrium {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,2};
        int n = arr.length;
        int tsum = 0;
        for(int i : arr){
            tsum += i;
        }
        int psum = 0;
        for(int i=0;i<n;i++){
            tsum -= arr[i];
            if(psum == tsum)System.out.println(i);
            psum += arr[i];
        }

        // int prev[] = new int[n];
        // int next[] = new int[n];
        // int sum = 0;
        // prev[0] = 0;
        // for(int i=0;i<n;i++){
        //     prev[i] = sum;
        //     sum += arr[i];
        // }
        // next[n-1] = 0;
        // sum = 0;
        // for(int i=n-1;i>=0;i--){
        //     next[i] = sum;
        //     sum += arr[i];
        // }
        // int ind = -1;
        // for(int i=0;i<n;i++){
        //     if(prev[i] == next[i]){
        //         ind = i;
        //     }
        // }
        // // System.out.println(Arrays.toString(prev));

        // // System.out.println(Arrays.toString(next));

        // System.out.println(ind);
    }
}
