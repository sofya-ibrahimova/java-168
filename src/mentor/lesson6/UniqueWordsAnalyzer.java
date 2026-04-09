package mentor.lesson6;

import java.util.*;

public class UniqueWordsAnalyzer {


    private static List<String> words(String sentence) {
        List<String> words = List.of(sentence.split(" "));
        return words;
    }

    public static int uniqueWordsCounter(String sentence) {
        Set<String> set = new HashSet<>(words(sentence));
        return set.size();
    }

    public static String largestWord(String sentence) {
        List<String> list = List.of(sentence.split(" "));
        int length = 0;
        String largestWord = null;
        for (String word : list) {
            if (word.length() >= length) {
                length = word.length();
                largestWord = word;
            }
        }
        return "Largest word: " + largestWord;
    }

    public static Map<String, Integer> wordCounterInSentence(String sentence) {
        List<String> list = new ArrayList<>(words(sentence));
        Map<String, Integer> map = new HashMap<>();
       for (String words : list){
           map.put(words, map.getOrDefault(words, 0) + 1);
       }
        return map;
    }

}
