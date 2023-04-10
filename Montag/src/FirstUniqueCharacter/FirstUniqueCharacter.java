package FirstUniqueCharacter;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s = "leetcode";
        int index = findUnique(s);
        System.out.println("Index of the first non-repeating character: " + index); // return  0


        String s1 = "loveleetcode";
        int index1 = findUnique(s1);
        System.out.println("Index of the first non-repeating character: " + index1); // return 2


        String s2 = "aabbcc";
        int index2 = findUnique(s2);
        System.out.println("Index of the first non-repeating character: " + index2); // return -1

    }

    public static int findUnique(String name) {
        int[] frequency = new int[26];

        // Iterate through the string and count the frequency of each character
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            frequency[c - 'a']++;
        }

        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (frequency[c - 'a'] == 1) {
                // Return the index of the first non-repeating character
                return i;
            }
        }

        // If no non-repeating character is found
        return -1;
    }


}
