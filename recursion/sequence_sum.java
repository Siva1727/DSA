<<<<<<< HEAD

import java.util.*;
// sub sequence where sum equals to k;

public class sequence_sum {

    public static void main(String[] args) {
        //int []arr = {1,1,0,2,0};
        int[] arr = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int k = 2;
        //seq(arr,0,list,k,0);

// no.of sub sequences with sum = k
        System.out.print(" Total no.of sub sequences with sum equals to K are : " );
        System.out.println(seq(arr, 0, k, 0));

    }

    // static void seq(int []arr , int i , ArrayList<Integer> list,int k,int sum){
    //     if(i == arr.length){
    //         if(k == sum){
    //         System.out.println(list);
    //         }
    //         return;
    //     }
    //     //take
    //     list.add(arr[i]);
    //     sum +=arr[i];
    //     seq(arr,i+1,list,k,sum);
    //     //not take
    //     list.remove(list.size()-1);
    //     sum -= arr[i];
    //     seq(arr,i+1,list, k,sum);
    // }
//  To print only one sub sequence : 
    // static boolean  seq(int []arr , int i , ArrayList<Integer> list,int k,int sum){
    //     if(i == arr.length){
    //         if(k == sum){
    //         System.out.println(list);
    //         return true;
    //         }
    //         return false;
    //     }
    //     //take
    //     list.add(arr[i]);
    //     sum +=arr[i];
    //     if(seq(arr,i+1,list,k,sum)){
    //         return true;
    //     }
    //     //not take
    //     list.remove(list.size()-1);
    //     sum -= arr[i];
    //     if(seq(arr,i+1,list, k,sum)){
    //         return true;
    //     }
    //     return false;
    // }
// no.of sub sequences with sum = k
    static int seq(int[] arr, int i, int k, int sum) {
        if (i == arr.length) {
            if (k == sum) {
                return 1;
            }
            return 0;
        }
        sum += arr[i];
        int l = seq(arr, i + 1, k, sum);

        sum -= arr[i];
        int r = seq(arr, i + 1, k, sum);

        return l + r;
    }
}
=======

import java.util.*;
// sub sequence where sum equals to k;

public class sequence_sum {

    public static void main(String[] args) {
        //int []arr = {1,1,0,2,0};
        int[] arr = {1, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int k = 2;
        //seq(arr,0,list,k,0);

// no.of sub sequences with sum = k
        System.out.print(" Total no.of sub sequences with sum equals to K are : " );
        System.out.println(seq(arr, 0, k, 0));

    }

    // static void seq(int []arr , int i , ArrayList<Integer> list,int k,int sum){
    //     if(i == arr.length){
    //         if(k == sum){
    //         System.out.println(list);
    //         }
    //         return;
    //     }
    //     //take
    //     list.add(arr[i]);
    //     sum +=arr[i];
    //     seq(arr,i+1,list,k,sum);
    //     //not take
    //     list.remove(list.size()-1);
    //     sum -= arr[i];
    //     seq(arr,i+1,list, k,sum);
    // }
//  To print only one sub sequence : 
    // static boolean  seq(int []arr , int i , ArrayList<Integer> list,int k,int sum){
    //     if(i == arr.length){
    //         if(k == sum){
    //         System.out.println(list);
    //         return true;
    //         }
    //         return false;
    //     }
    //     //take
    //     list.add(arr[i]);
    //     sum +=arr[i];
    //     if(seq(arr,i+1,list,k,sum)){
    //         return true;
    //     }
    //     //not take
    //     list.remove(list.size()-1);
    //     sum -= arr[i];
    //     if(seq(arr,i+1,list, k,sum)){
    //         return true;
    //     }
    //     return false;
    // }
// no.of sub sequences with sum = k
    static int seq(int[] arr, int i, int k, int sum) {
        if (i == arr.length) {
            if (k == sum) {
                return 1;
            }
            return 0;
        }
        sum += arr[i];
        int l = seq(arr, i + 1, k, sum);

        sum -= arr[i];
        int r = seq(arr, i + 1, k, sum);

        return l + r;
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
