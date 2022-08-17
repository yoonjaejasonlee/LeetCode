/* 804. Unique Morse Code Words
https://leetcode.com/problems/unique-morse-code-words/ */

import java.util.HashSet;

public class Q804 {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                    "--.." };
            HashSet<String> mor = new HashSet<>();

            for (String s : words) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    sb.append(morse[s.charAt(i) - 'a']);
                }
                mor.add(sb.toString());
            }
            return mor.size();
        }
    }
}
