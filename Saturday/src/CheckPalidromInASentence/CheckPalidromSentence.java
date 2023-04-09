package CheckPalidromInASentence;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.stream.Collectors;

public class CheckPalidromSentence {

    public static void main(String[] args) {
        System.out.println(checkIfSentenceIsAPalidrom("Hallo Test.")); // false
        System.out.println(checkIfSentenceIsAPalidrom("A man, a plan, a canal: Panama")); // true
        System.out.println(checkIfSentenceIsAPalidrom("Hello my name is Phillips.")); // false

        LinkedList<Integer> n = new LinkedList<>(Arrays.asList(1, 12, 32133, 23));
        LinkedList<Integer> reverse = n.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedList::new));
    }

    public static boolean checkIfSentenceIsAPalidrom(String sentence) {
        String modiString = removeSpecialCharacters(sentence);
        String originalStringInLowerCase = modiString.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        String reverseOriginalStringLowerCase = new StringBuilder(originalStringInLowerCase).reverse().toString();
        return originalStringInLowerCase.equals(reverseOriginalStringLowerCase);
    }

    public static String removeSpecialCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return empty input or null as is
        }

        // Use regex to replace special characters with empty string
        return input.replaceAll("[,?!\\-:&%$§\"!/()==?.']", "");
    }

}
