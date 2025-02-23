import java.util.*;
// bruteforce - with extra space :
public class permutation {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        List<List<Integer>> list = new ArrayList();
        List<Integer> sublist = new ArrayList<>();
        boolean barr[] = new boolean[arr.length];//mark the ele that is taken or not.
        permu(arr,list,sublist,barr);
        System.out.println(list);
    }
    static void permu(int[] arr,List<List<Integer>> list,List<Integer> sublist, boolean barr[]){
        if(sublist.size() == arr.length){
            list.add(new ArrayList(sublist));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if( ! barr[i] ){
                sublist.add(arr[i]);
                barr[i] = true;
                permu(arr,list,sublist,barr);
                sublist.remove(sublist.size()-1);
                barr[i]= false ;
            }
        }
    }
}
