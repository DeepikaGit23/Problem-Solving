package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Anagrams {
    static boolean isAnagram(String s, String t) {

        if (s.length()!=t.length())
            return false;
        char[] s1=s.toLowerCase().toCharArray();
        char[] t1=t.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("hey","ehy"));
    }
}
