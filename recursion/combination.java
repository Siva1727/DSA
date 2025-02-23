// package sample;

import java.util.*;
public class combination {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        sequence(0, candidates, list, sublist, target);
		System.out.print(list);
    }

    static void sequence(int i, int[] arr, List<List<Integer>> list, List<Integer> sublist, int k) {
        //k < 0 is very imp..; because it causes index bound exception
        if (i == arr.length || k < 0) {
            if (k == 0) {
                list.add(new ArrayList(sublist));
            }
            return;
        }
        if (arr[i] <= k) {
            sublist.add(arr[i]);
            sequence(i, arr, list, sublist, k - arr[i]);
            sublist.remove(sublist.size() - 1);
        }

        sequence(i + 1, arr, list, sublist, k);
    }
}


