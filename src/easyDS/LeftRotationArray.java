package easyDS;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationArray {
    public static List<Integer> rotLeft(int d, List<Integer> ar) {
        int[] a = new int[ar.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = ar.get(i).intValue();
        }
        int length = a.length;
        List<Integer> temp = new ArrayList<>();
        int j = 0;

        for (int i = d; i < length; i++, j++) {
            temp.add(j, a[i]);
        }
        for (int i = 0; i < d; i++, j++) {
            temp.add(j, a[i]);
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        rotLeft(2, temp);
    }
}
