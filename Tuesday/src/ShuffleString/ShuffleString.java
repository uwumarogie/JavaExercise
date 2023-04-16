package ShuffleString;

public class ShuffleString {

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3})); // leetcode
        System.out.println(restoreString("abc", new int[]{0, 1, 2})); // abc
        System.out.println(restoreString("", new int[0])); // "";
    }


    public static String restoreString(String s, int[] indices) {

        if (s.length() != indices.length) return "";

        StringBuilder sb = new StringBuilder();
        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[indices[i]] = s.charAt(i);
        }
        sb.append(c);
        return sb.toString();

    }
}
