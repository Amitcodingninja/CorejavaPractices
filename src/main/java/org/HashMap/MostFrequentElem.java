package org.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int maxFreq = 0;
        int mostFreq = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFreq = entry.getKey();
            }
        }
        System.out.println(map);

        System.out.println(maxFreq);
        System.out.println(mostFreq);

    }
}