package WordPattern;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog bull bull dog")); // true
        System.out.println(wordPattern("abba", "dog cat schlong dog")); // false
        System.out.println(wordPattern("aba", "dog Heil cat 88")); // false
        System.out.println(wordPattern("aaaa", "dog dog dog dog")); // true


    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] ch = pattern.toCharArray();
        if (str.length != ch.length)
            return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                if (!map.get(ch[i]).equals(str[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(str[i])) {
                    return false;
                }
                map.put(ch[i], str[i]);
            }
        }
        return true;
    }
}
