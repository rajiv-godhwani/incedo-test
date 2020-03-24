package com.rajivg;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    /**
     * Finds the longest substring for a given string
     *
     * @param input - Input string
     * @return - Length of the substring
     */
    public static int execute(String input) {
        Set<Character> characterSet = new HashSet<>();
        int subStringLength = 0;
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            // Repeat char detection
            if (characterSet.contains(input.charAt(i))) {
                characterSet.remove(input.charAt(i));
                count--;
            }

            characterSet.add(input.charAt(i));
            count++;
            if (count > subStringLength) {
                subStringLength = count;
            }
        }

        return subStringLength;
    }
}
