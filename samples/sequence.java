import java.util.*;
public class sequence {
    public static void main(String[] args) {
        int []arr = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        int k =  2;
        seq(arr,0,list,k,0);
    }

    static void seq(int []arr , int i , ArrayList<Integer> list,int k,int sum){
        if(i == arr.length){
            if(k == sum){
            System.out.println(list);

            }
            return;
        }
        
        
        list.add(arr[i]);
        sum +=arr[i];
        seq(arr,i+1,list,k,sum);
        
        list.remove(list.size()-1);
        sum -= arr[i];
        seq(arr,i+1,list, k,sum);
        
    }
}
