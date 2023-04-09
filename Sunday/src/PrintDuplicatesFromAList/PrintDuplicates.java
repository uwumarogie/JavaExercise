package PrintDuplicatesFromAList;

import java.util.*;

public class PrintDuplicates {

    // Usage of S in SOLID :)
    public static void main(String[] args) {

        List<String> list = generateStrings(1000000);
        printDuplicateNames(list);

        printDuplicateNames(Collections.emptyList()); // Nothing in the list
        printDuplicateNames(Arrays.asList("Tom", "Mikhail", "Mikhail", "Andi", "Phillips")); // Mikhail
        printDuplicateNames(Arrays.asList("Tom", "Mikhail", "Maxi", "Andi", "Phillips"));
    }

    public static void printDuplicateNames(List<String> list) {
        if (list.isEmpty())
            System.out.println("There is nothing in the list.");

        Map<String, Integer> map = countDuplikate(list);
        printAllDuplikates(map);
    }

    public static void printAllDuplikates(Map<String, Integer> map) {
        map.forEach((name, count) -> {
            if (count > 1) {
                System.out.println(name);
            }
        });
    }

    public static HashMap<String, Integer> countDuplikate(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String el : list) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        return map;
    }

    public static List<String> generateStrings(int count) {
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String randomString = generateRandomString();
            strings.add(randomString);
        }
        return strings;
    }

    private static String generateRandomString() {
        // Define characters to be used in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 10; // Length of each random string
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char c = characters.charAt(index);
            sb.append(c);
        }
        return sb.toString();
    }

}
