import java.util.*;
public class permutation_II {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        permu(0,arr,list);
        System.out.print(list);
    }
    static void permu(int ind , int[]arr,List<List<Integer>> list){
        if(ind == arr.length){
            List<Integer> sublist = new ArrayList<>();
            for(int i : arr){
                sublist.add(i);
            }
            list.add(new ArrayList(sublist));
            return ;
        }
        for(int i =ind;i<arr.length;i++){
            swap(i,ind,arr);
            permu(ind+1,arr,list);
            swap(i,ind,arr);
        }
    }
    static void swap(int i,int j,int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return ;
    }
}
