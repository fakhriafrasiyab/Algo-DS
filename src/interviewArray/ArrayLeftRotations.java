package interviewArray;

import java.util.Arrays;

public class ArrayLeftRotations {

    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int j = 0;
        int[] temp = new int[length];

        for (int i = d; i < length; i++, j++) {
            temp[j] = a[i];
        }
        if (j < length) {
            for (int i = 0; i < d; i++, j++) {
                temp[j] = a[i];
            }
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        rotLeft(a, 4);
    }
}
