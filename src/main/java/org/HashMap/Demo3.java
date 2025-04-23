package org.HashMap;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 1, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        System.out.println(map);
    }
}
