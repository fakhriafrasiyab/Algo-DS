package pramp;

import java.util.Arrays;

public class K_MessedArray {

    static int[] sortKMessedArray(int[] arr, int k) {
        int n = arr.length;
        int j;
        if (arr == null || n <= 1) {
            return arr;
        }

        for (int i = 1; i < n; i++) {
            k = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
        sortKMessedArray(arr, 2);
    }

}
