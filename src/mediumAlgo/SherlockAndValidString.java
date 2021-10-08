package mediumAlgo;

import java.util.HashMap;

public class SherlockAndValidString {

    public static String isValid(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int count = 1;
        HashMap<Character, Integer> charactersCount = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    charactersCount.put(chars[i], count);
                }
            }
            count = 1;
        }
        System.out.println(charactersCount);
        return "";
    }

    public static void main(String[] args) {
        isValid("abcdefghhgfedecba");
    }
}
