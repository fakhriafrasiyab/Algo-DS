package mediumAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SherlockAnagrams {
    public static int sherlockAndAnagrams(String s) {
        int count = 0;
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length + 1; j++) {
                result.add(Arrays.stream(s.substring(i, j).split("")).sorted().collect(Collectors.joining()));
            }
        }
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (Objects.equals(result.get(i), result.get(j)))
                    count++;
            }
        }
        System.out.println(result);
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        sherlockAndAnagrams("abba");
    }
}
