package org.HashMap;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String s = "banana";
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char n : ch) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println(map);
    }
}
