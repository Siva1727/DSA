<<<<<<< HEAD
// 40 *
import java.util.*;
public class combinationsumII {
    public static void main(String[] args) {
        int []candidates={1,2,3,4};
        int target = 5;
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sequence(0,candidates,target,list,sublist);
        System.out.print(list);
    }
    static void sequence(int ind,int[]arr,int k,List<List<Integer>> list,List<Integer> sublist){
        if(k == 0){
            list.add(new ArrayList(sublist));
            return;
        }
        for(int i = ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > k)break;
            sublist.add(arr[i]);
            sequence(i+1,arr,k-arr[i],list,sublist);
            sublist.remove(sublist.size()-1);
        }
    }
}
=======
// 40 *
import java.util.*;
public class combinationsumII {
    public static void main(String[] args) {
        int []candidates={1,2,3,4};
        int target = 5;
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sequence(0,candidates,target,list,sublist);
        System.out.print(list);
    }
    static void sequence(int ind,int[]arr,int k,List<List<Integer>> list,List<Integer> sublist){
        if(k == 0){
            list.add(new ArrayList(sublist));
            return;
        }
        for(int i = ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > k)break;
            sublist.add(arr[i]);
            sequence(i+1,arr,k-arr[i],list,sublist);
            sublist.remove(sublist.size()-1);
        }
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
