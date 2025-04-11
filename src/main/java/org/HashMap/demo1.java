package org.HashMap;

import java.util.HashMap;

public class demo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Amit");
        hashMap.put(2, "Prakash");
        hashMap.put(3, "Vikash");
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap);
        
    }
}
