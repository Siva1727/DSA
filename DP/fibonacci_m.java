package DP;
import java.util.*;
public class fibonacci_m {
    public static void main(String[] args) {
        int a = 2;
        int arr[] = new int[a + 1];
        Arrays.fill(arr, -1);
        System.out.print(solve(a-1, arr));
    }

    static int solve(int a, int[] arr) {
        if (a <= 1) {
            return a;
        }
        if (arr[a] != -1) {
            return arr[a];
        }

        return arr[a] = solve(a - 1, arr) + solve(a - 2, arr);
    }

}
