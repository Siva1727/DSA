import java.util.*;
public class subsetsum {
    public static void main(String[] args) {
        int arr[] = {35, 2, 8, 22};
        List<Integer> sublist = new ArrayList<>();
        int ans =set(0,0,arr,0);
        System.out.print(ans);
    }
    static int set(int i ,int sum, int[]arr,int k){
        if(i == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }
       
        int take = set(i+1,sum+arr[i],arr,k);
       
        int not = set(i+1,sum,arr,k);
        return take + not;

    }
}
