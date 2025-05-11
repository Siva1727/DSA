<<<<<<< HEAD
import java.util.*;
public class subsetsum_II {
    // unique sub sets only : 
    public static void main(String[] args){
        int arr[]={2,1,2};
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        subset(0,arr,list,sublist);
        //Collections.sort(list);
        System.out.print(list);
    }
    static void subset(int ind,int[]arr,List<List<Integer>> list,List<Integer> sublist){
        list.add(new ArrayList(sublist));
        for(int i = ind;i<arr.length;i++){
            if( i > ind && arr[i] == arr[i-1])continue;
            sublist.add(arr[i]);
            subset(i+1,arr,list,sublist);
            sublist.remove(sublist.size()-1);
        }
    }
}
=======
import java.util.*;
public class subsetsum_II {
    // unique sub sets only : 
    public static void main(String[] args){
        int arr[]={2,1,2};
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        subset(0,arr,list,sublist);
        //Collections.sort(list);
        System.out.print(list);
    }
    static void subset(int ind,int[]arr,List<List<Integer>> list,List<Integer> sublist){
        list.add(new ArrayList(sublist));
        for(int i = ind;i<arr.length;i++){
            if( i > ind && arr[i] == arr[i-1])continue;
            sublist.add(arr[i]);
            subset(i+1,arr,list,sublist);
            sublist.remove(sublist.size()-1);
        }
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
