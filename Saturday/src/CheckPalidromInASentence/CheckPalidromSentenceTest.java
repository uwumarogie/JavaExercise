package CheckPalidromInASentence;

import org.junit.Assert;
import org.junit.Test;

public class CheckPalidromSentenceTest {

    @Test
    public void testPalindromeWithAlphanumericCharacters() {
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("A man, a plan, a canal: Panama"));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Never odd or even"));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Radar"));
    }

    @Test
    public void testPalindromeWithNonAlphanumericCharacters() {
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Are we not drawn onward, we few, drawn onward to new era?"));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Evil is a name of a foeman, as I live."));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Mr. Owl ate my metal worm."));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Able was I ere I saw Elba"));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("A man a plan a canal Panama"));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Madam In Eden, I'm Adam"));
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Was it a car or a cat I saw?"));
    }

    @Test
    public void testNonPalindrome() {
        Assert.assertFalse(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Hello World"));
        Assert.assertFalse(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Palindrome Test"));
        Assert.assertFalse(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Java is fun"));
        Assert.assertFalse(CheckPalidromSentence.checkIfSentenceIsAPalidrom("This is not a palindrome"));
        Assert.assertFalse(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Madam Arora"));
        Assert.assertFalse(CheckPalidromSentence.checkIfSentenceIsAPalidrom("Mr. Alien, sir, is a menace. His pernicious"));
    }

    @Test
    public void testEmptyString() {
        Assert.assertTrue(CheckPalidromSentence.checkIfSentenceIsAPalidrom(""));
    }
}
