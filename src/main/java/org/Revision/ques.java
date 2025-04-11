package org.Revision;

import java.util.LinkedHashMap;

public class ques {
    public static void main(String[] args) {

        String s = "amitsjfhjas"; //mit
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                sb.append(c);
                if (sb.length() == 3) break;
            }
        }

        System.out.println(sb.toString());
    }
}

