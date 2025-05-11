public class Sample{
    public static void main(String[] args) {
        int nums[] = {5,2,3,10,6,8};
        int target = 8;
        System.out.print(solve(nums,target,nums.length-1));
    }
    static int solve(int []arr,int k,int ind){
        if(ind == 0){
            if(k == 0){
                return 1;
            }
            return 0;
        }
        int take = solve(arr,k-arr[ind],ind-1);
        int nottake = solve(arr,k,ind-1);
        
        return take + nottake;
    }
}