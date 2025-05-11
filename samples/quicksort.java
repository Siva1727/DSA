public class quicksort {
    public static void main(String[] args) {
        int []arr = {4,6,2,5,7,9,1,3};
        print(arr);
        quick(arr,0,arr.length-1);
        print(arr);
    }
    static void quick(int []arr,int low , int high){
        if(low < high){
            int parti = sort(arr,low,high);
            quick(arr,low,parti-1);
            quick(arr,parti+1,high);
            return ;
        }
        return ;
    }
    static int sort(int[]arr,int low,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i <= j){
            while(arr[i] <= pivot && i <= high){
                i++; 
            }

            while(arr[j] > pivot && j >= low){
                j--;
            }
            if( i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
    static void print(int[]arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
