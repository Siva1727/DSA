
import java.util.*;

public class mergesort {

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 4, 1, 6, 9, 7};
        int low = 0;
        int high = arr.length - 1;
        System.out.print("Before sort :  ");
        print(arr);
        merge(arr, low, high);
        System.out.print("After sort  :  ");
        print(arr);
    }

    static void merge(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        merge(arr, low, mid);
        merge(arr, mid + 1, high);
        sort(arr, low, mid, high);
        return;
    }

    static void sort(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> list = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                list.add(arr[left]);
                left++;
            } 
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
        return;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }
}
