package facebookAlgo;

import java.util.Arrays;

public class MoveAllZerosEndOfArray {
    static int[] moveZerosToEnd(int[] arr) {
        int len = arr.length;
        int temp;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 23, 0, 3, 0, 4};
        moveZerosToEnd(arr);
    }
}
