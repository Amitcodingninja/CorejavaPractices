package org.Revisions;

import java.util.HashMap;
import java.util.Map;

public class firstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetCode";
        int i = firstUniqChar(s);
        System.out.println(i);

    }

    public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : ch) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(freqMap);

        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
