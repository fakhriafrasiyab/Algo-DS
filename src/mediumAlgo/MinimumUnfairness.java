package mediumAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumUnfairness {
    //11 casede fail olub
//    public static int maxMin(int k, List<Integer> arr) {
//        Collections.sort(arr);
//        int[] k_arr = new int[k];
//        for (int i = 0; i < k; i++) {
//            k_arr[i] = arr.get(i);
//        }
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < k_arr.length; i++) {
//            if (min > k_arr[i]) {
//                min = k_arr[i];
//            }
//            if (max < k_arr[i]) {
//                max = k_arr[i];
//            }
//        }
//        System.out.println(max-min);
//        return max - min;
//    }
    public static int maxMin(int k, List<Integer> arr) {
        int unfairness = Integer.MAX_VALUE;
        Collections.sort(arr);
        int n = arr.size();
        for (int i = 0; i < n - k + 1; i++) {
            if (arr.get(i + k - 1) - arr.get(i) < unfairness)
                unfairness = arr.get(i + k - 1) - arr.get(i);
        }
        System.out.println(unfairness);
        return unfairness;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(100);
        list.add(200);
        maxMin(4, list);
    }
}
