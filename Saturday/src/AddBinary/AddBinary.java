package AddBinary;

import java.util.List;
import java.util.stream.Collectors;

public class AddBinary {

    public static void main(String[] args) throws Exception {
        System.out.println(addBinary("0000", "1111")); // 01111
        System.out.println(addBinary("1111", "1111")); // 11110
        System.out.println(addBinary("0001", "1111")); // 10000
        System.out.println(addBinary("0100", "1111")); // 10011
        // System.out.println(addBinary("111", "11")); // Throw new Exception
        // System.out.println(addBinary("", ""));  // Throw new Exception
    }

    public static String addBinary(String first, String second) throws Exception {

        List<Character> firstList = convertStringToListOfCharacter(first);

        List<Character> secondList = convertStringToListOfCharacter(second);

        if (firstList.isEmpty() || secondList.isEmpty())
            throw new Exception("Check your input of the strings. Your input shouldn't be empty.");

        if (firstList.size() != secondList.size())
            throw new Exception("Your number should have the same length.");

        StringBuilder sb = new StringBuilder();
        char carry = '0'; // Initialize carry as '0'


        for (int i = firstList.size() - 1; i >= 0; i--) {

            char firstBit = firstList.get(i);
            char secondBit = secondList.get(i);
            char sum;

            if (firstBit == '0' && secondBit == '0') {
                sum = carry;
                carry = '0';
            } else if (firstBit == '1' && secondBit == '0' || firstBit == '0' && secondBit == '1') {
                sum = carry == '0' ? '1' : '0';
            } else { // Both bits are '1'
                sum = carry;
                carry = '1';
            }

            sb.append(sum);
        }

        return sb.append(carry).reverse().toString();
    }

    public static List<Character> convertStringToListOfCharacter(String string) {
        return string.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }
}
