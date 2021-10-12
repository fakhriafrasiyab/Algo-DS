package interviewStrings;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        String aa = a;
        String bb = b;
        for (int i = 0; i < a.length(); i++) {
            if (bb.contains(String.valueOf(a.charAt(i)))) {
                aa = aa.replaceFirst(String.valueOf(a.charAt(i)), "");
                bb = bb.replaceFirst(String.valueOf(a.charAt(i)), "");
            }
        }
        int xx = aa.length() + bb.length();
        System.out.println(xx);
        return xx;
    }

    public static void main(String[] args) {
        makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
    }
}
