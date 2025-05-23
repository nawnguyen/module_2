package ss11.BaiTap.countWord;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "Future depends on your dreams. So don’t hesitate to sleep.";

        text = text.toLowerCase();

        text = text.replaceAll("[^a-zA-Z ]", "");
        String[] words = text.split("\\s+");

        Map<String, Integer> wordMap = new TreeMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("Tần suất xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

