package Challenges.HashTable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {

    public static String maxWord(String string) {
        if (string == "") {
            return null;
        }
        String[] splitString = string.split("[., ]");
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String stringed : splitString) {
            if (stringed.equals("")) {
                System.out.println("null");
            } else {
                if (wordMap.containsKey(stringed)) {
                    wordMap.put(stringed, wordMap.get((stringed)) + 1);
                } else {
                    wordMap.put(stringed, 1);
                }
            }
        }
        int maxString = Collections.max(wordMap.values());
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() == maxString) {
                return entry.getKey();
            }

        }
        return "";
    }

}
