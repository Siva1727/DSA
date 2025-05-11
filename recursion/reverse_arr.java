<<<<<<< HEAD
public class reverse_arr {
// Iterative approach :
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     reverse(arr,0,arr.length-1);
    //     for(int i : arr){
    //         System.out.print(i+" ");
    //     }
    // }
    // static void reverse(int arr[],int l,int r){
    //     if(l >= r){
    //         return ;
    //     }
    //     swap(arr[l],arr[r]);
    //     reverse(arr,l+1,r-1);
    // }
    // static void swap( int l , int r){
    //     int temp = l;
    //     l = r;
    //     r = temp;
    //     return;
    // }
    
    // Recursive approach :
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(0,arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    static void reverse(int i , int [] arr){
        if(i >= arr.length/2){
            return;
        }
        swap(arr,i, arr.length-1-i);
        reverse(i+1 , arr);
        return ;
    }
    static void swap( int arr[] , int l , int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
=======
public class reverse_arr {
// Iterative approach :
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     reverse(arr,0,arr.length-1);
    //     for(int i : arr){
    //         System.out.print(i+" ");
    //     }
    // }
    // static void reverse(int arr[],int l,int r){
    //     if(l >= r){
    //         return ;
    //     }
    //     swap(arr[l],arr[r]);
    //     reverse(arr,l+1,r-1);
    // }
    // static void swap( int l , int r){
    //     int temp = l;
    //     l = r;
    //     r = temp;
    //     return;
    // }
    
    // Recursive approach :
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(0,arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    static void reverse(int i , int [] arr){
        if(i >= arr.length/2){
            return;
        }
        swap(arr,i, arr.length-1-i);
        reverse(i+1 , arr);
        return ;
    }
    static void swap( int arr[] , int l , int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
>>>>>>> 01ed7d3 (commit stack and queue)
