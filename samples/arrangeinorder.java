import java.util.*;

public class arrangeinorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        //int n = sc.nextInt();
        // int arr[] = new int[n];
        int arr[] = {5,3,2,8,1,4,7};
        int n = arr.length;
        
        // Input array elements
        // for(int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Separate evens and odds
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evens.add(arr[i]);
            } else {
                odds.add(arr[i]);
            }
        }
        
        // Final result array
        int[] result = new int[n];
        int evenIndex = 0, oddIndex = 0;
        boolean evenTurn = arr[0] % 2 == 0; // true if first element is even
        
        for(int i = 0; i < n; i++) {
            if(evenTurn && evenIndex < evens.size()) {
                result[i] = evens.get(evenIndex++);
            } else if(!evenTurn && oddIndex < odds.size()) {
                result[i] = odds.get(oddIndex++);
            } else if(evenIndex < evens.size()) {
                result[i] = evens.get(evenIndex++);
            } else {
                result[i] = odds.get(oddIndex++);
            }
            evenTurn = !evenTurn;
        }
        
        // Print result
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
