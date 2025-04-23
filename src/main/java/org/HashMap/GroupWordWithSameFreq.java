package org.HashMap;

import java.util.Arrays;
import java.util.HashMap;

//{
//        {a=1,b=2}=>["abb","bba","bab"],
//        {a=1,b=1,c=1}=>["abc","cab"]
//        }


public class GroupWordWithSameFreq {
    public static void main(String[] args) {
        String[] arr = {"abb", "bba", "bab", "abc", "cab"};

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            map.put(sortedStr, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);





    }
}
