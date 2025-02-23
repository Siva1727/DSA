import java.util.*;
public class subsetsum {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        List<Integer> sublist = new ArrayList<>();
        set(0,0,arr,sublist);
        System.out.print(sublist);
    }
    static void set(int i ,int sum, int[]arr,List<Integer> sublist){
        if(i == arr.length){
            sublist.add(sum);
            return ;
        }
       
        set(i+1,sum+arr[i],arr,sublist);
       
        set(i+1,sum,arr,sublist);

    }
}
