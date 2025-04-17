package org.HashMap;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class demo2 {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
        List<Integer> list = Arrays.asList(2, 3, 57, 1);
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
//        System.out.println(map);
        for (Integer key : map.keySet()) {
            map.put(3, "C");
        }
        System.out.println(map);
        System.out.println(list);

    }
}