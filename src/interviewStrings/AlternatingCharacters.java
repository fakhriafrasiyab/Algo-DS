package interviewStrings;

import java.util.Scanner;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 1; i <= cases; i++) {
            String s = scanner.next();
            alternatingCharacters(s);
        }
    }

}

