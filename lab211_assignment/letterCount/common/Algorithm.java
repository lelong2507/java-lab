package letterCount.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import lab211_assignment.letterCharacter.common.Alogorithm;

public class Algorithm {

    // Đếm số chuỗi
    public static void countString(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        Map<String, Integer> stringMap = new HashMap<>();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            if (stringMap.containsKey(word)) {
                int count = stringMap.get(word);
                stringMap.put(word, count + 1);
            } else {
                stringMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.print("{" + word + "=" + count + "}");
            
        }
        System.out.println();
    }

    // Đếm số ký tự trùng lặp trong chuỗi
    public static void countCharDuplicate(String input) {
        StringTokenizer st = new StringTokenizer(input, " ");
        HashMap<Character, Integer> charCount = new HashMap<>();
        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            for (char c : word.toCharArray()) {
                char lowerCase = Character.toLowerCase(c);
                if (charCount.containsKey(lowerCase)) {
                    charCount.put(lowerCase, charCount.get(lowerCase) + 1);
                } else {
                    charCount.put(lowerCase, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.print("{ " + entry.getKey() + " = " + entry.getValue() + " }");
                } else {
                    System.out.print("{" + entry.getKey() + " = "  + entry.getValue() + "}");
                }
            }
        }
    }
}
