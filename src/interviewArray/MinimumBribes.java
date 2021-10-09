package interviewArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumBribes {

    public static void minimumBribes(List<Integer> q) {
        List<Integer> sortedList = new ArrayList<>(q);
        Collections.sort(sortedList);
        int count = 0;
        int size = q.size();
        for (int i = size - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 5, 1, 3, 4};
        List<Integer> bribes = Arrays.asList(arr);
        minimumBribes(bribes);
    }
}
