package Algorithms;

public class Sort_Quick {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        System.out.print("Before sort : ");
        print(arr);

        quick(arr, 0, arr.length - 1);
        
        System.out.print("After sort  : ");
        print(arr);

    }

    static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int partition = sort(arr, low, high);
            quick(arr, low, partition - 1);
            quick(arr, partition + 1, high);
        }
    }

    static int sort(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot ) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        // int temp = arr[j];
        // arr[j] = pivot;
        // arr[low] = temp;
        return j;
        
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
