package mediumAlgo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int i = 0;
        int j = 1;
        int diff = 0;
        int count = 0;
        while (j < arr.size()) {
            diff = arr.get(j) - arr.get(i);
            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        List<Integer> pairArray = new ArrayList<>();
        pairArray.add(1);
        pairArray.add(5);
        pairArray.add(3);
        pairArray.add(4);
        pairArray.add(2);
        pairs(2, pairArray);
    }
}
