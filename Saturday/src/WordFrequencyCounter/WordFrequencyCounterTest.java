package WordFrequencyCounter;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WordFrequencyCounterTest {

    @Test
    public void testWordCounterWithValidInput1() {
        // Test case 1: Valid input with multiple words and spaces
        String input1 = "Hello world, how are you doing today?";
        String expectedOutput1 = "{how=1, doing=1, world=1, Hello=1, are=1, today=1, you=1}";
        String output1 = WordFrequencyCounter.wordCounter(input1);
        Assertions.assertEquals(expectedOutput1, output1, "Word frequency should be calculated correctly");

        // Test case 2: Valid input with repeated words
        String input2 = "Hello world, how are you doing today? Hello world!";
        String expectedOutput2 = "{how=1, doing=1, world=2, Hello=2, are=1, today=1, you=1}";
        String output2 = WordFrequencyCounter.wordCounter(input2);
        Assertions.assertEquals(expectedOutput2, output2, "Word frequency should be calculated correctly");
    }

    @Test
    public void testWordCounterWithEmptyInput() {
        // Test case 3: Empty input
        String input3 = "";
        String expectedOutput3 = "{}";
        String output3 = WordFrequencyCounter.wordCounter(input3);
        Assertions.assertEquals(expectedOutput3, output3, "Word frequency should be empty for empty input");
    }


    @Test
    public void testWordCounterWithValidInput() {
        // Test case 1: Valid input with multiple words and spaces
        String input1 = "Hello world, how are you doing today?";
        String expectedOutput1 = "{how=1, doing=1, world=1, Hello=1, are=1, today=1, you=1}";
        String output1 = WordFrequencyCounter.wordCounter(input1);
        Assertions.assertEquals(expectedOutput1, output1, "Word frequency should be calculated correctly");

        // Test case 2: Valid input with repeated words
        String input2 = "Hello world, how are you doing today? Hello world!";
        String expectedOutput2 = "{how=1, doing=1, world=2, Hello=2, are=1, today=1, you=1}";
        String output2 = WordFrequencyCounter.wordCounter(input2);
        Assertions.assertEquals(expectedOutput2, output2, "Word frequency should be calculated correctly");

        // Test case 3: Valid input with numbers and special characters
        String input3 = "The price of the product is $19.99. It's a great deal!";
        String expectedOutput3 = "{The=1, the=1, a=1, product=1, deal=1, It's=1, price=1, of=1, is=1, great=1, $1999=1}";
        String output3 = WordFrequencyCounter.wordCounter(input3);
        Assertions.assertEquals(expectedOutput3, output3, "Word frequency should be calculated correctly");

        // Test case 4: Valid input with different letter cases
        String input4 = "The quick Brown Fox jumps over the Lazy DOG";
        String expectedOutput4 = "{The=1, over=1, the=1, Lazy=1, Brown=1, quick=1, jumps=1, DOG=1, Fox=1}";
        String output4 = WordFrequencyCounter.wordCounter(input4);
        Assertions.assertEquals(expectedOutput4, output4, "Word frequency should be calculated correctly");
    }

    @Test
    public void testWordCounterWithEmptyInput1() {
        // Test case 5: Empty input
        String input5 = "";
        String expectedOutput5 = "{}";
        String output5 = WordFrequencyCounter.wordCounter(input5);
        Assertions.assertEquals(expectedOutput5, output5, "Word frequency should be empty for empty input");
    }

}
