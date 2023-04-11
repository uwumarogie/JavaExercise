package ReverseANumber;

public class ReverseANumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(123)); // 321
        System.out.println(reverseNumber(Integer.MAX_VALUE)); // 0
        System.out.println(reverseNumber(Integer.MIN_VALUE)); // 0
        System.out.println(reverseNumber(-12121213)); // -31212121
        System.out.println(reverseNumber(0)); // 0
    }

    public static int reverseNumber(int x) {
        int reversed = 0;

        for (; x != 0; x /= 10) {
            int digit = x % 10;
            if (reversed > 0 && reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            if (reversed < 0 && reversed < (Integer.MIN_VALUE - digit) / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}
