
import java.util.ArrayList;

public class subsequence {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> list = new ArrayList<>();
        sub_sequence(arr, 0, list);
    }

    static void sub_sequence(int[] arr, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            System.out.println(list);
            return;
        }
        //to print in reverse order : 
        //sub_sequence(arr,i+1,list);
        list.add(arr[i]);
        // take : 
        sub_sequence(arr, i + 1, list);
        // donnot take :
        list.remove(list.size() - 1);
        sub_sequence(arr, i + 1, list);
    }
}
