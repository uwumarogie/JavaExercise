package WordFrequencyCounter;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        System.out.println(wordCounter("I dancing like dancing and having a ice cream to to  after lunch.")); //  Sentence  with the this words
    }

    public static String wordCounter(@NotNull String sentence) {

        if (sentence.equals("")) {
            return "{}";
        }

        String[] stringArray = sentence.split("[,\\s]+");
        List<String> stringList = Arrays.asList(stringArray);
        stringList.replaceAll(s -> s.replaceAll("[?!\\.]", ""));

        Map<String, Integer> map = new HashMap<>();
        for (String element : stringList) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        return map.toString();
    }


}
