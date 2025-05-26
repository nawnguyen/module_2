package ss11.BaiTap.reverseStack;


import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        String input = "MỘT HAI BA BỐN";
        String[] words = input.split(" ");

        Map<Integer, String> wordMap = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordMap.put(i, words[i]);
        }

        String output = "";
        for (int i = words.length - 1; i >= 0; i--) {
            output += wordMap.get(i);
            if (i > 0) output += " ";
        }

        System.out.println("Chuỗi sau khi đảo ngược từ: " + output);
    }
}
