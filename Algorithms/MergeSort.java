package Algorithms;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,1,5,6,4,7};
        int low = 0;
        int high = arr.length-1;
        System.out.print("Before sort :  ");
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();

        merge(arr,low,high);
        
        System.out.print("After sort  :  ");
        for(int i : arr){
            System.out.print(i +" ");
        }
      
    }
    static void merge(int [] arr , int low , int high){
        if(low == high){
            return ;
        }
        int mid = (low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        sort(arr,low,mid,high);
    }
    static void sort(int []arr,int low,int mid,int high){
        List<Integer> ls = new ArrayList<>();
        // for the optimal case we can use temp arr instead of arr;
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                ls.add(arr[left]);
                left++;
            }
            else {
                ls.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            ls.add(arr[left]);
            left++;
        }
        while(right <= high){
            ls.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=ls.get(i-low);
        }
        return ;
    }
    
}
