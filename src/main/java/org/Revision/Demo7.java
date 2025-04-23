package org.Revision;

import java.util.Arrays;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 13, 14, 16, 17, 18, 19);
//        int groupSize = 3;
        for (int i = 0; i < list.size() - 1; i++) {
            List<Integer> list1 = list.subList(i, i + 3);
            i = i + 2;
            System.out.println(list1);
        }


    }
}
