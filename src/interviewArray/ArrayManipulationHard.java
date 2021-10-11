package interviewArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulationHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//size of array
        int m = scanner.nextInt();// num of operation
        int[] arr = new int[n + 1];
        while (m-- > 0) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int summand = scanner.nextInt();
            arr[p - 1] += summand;
            arr[q] -= summand;
            System.out.println(Arrays.toString(arr));
        }
        scanner.close();
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.println(sum);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
