package org.Revisions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binedList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(34, 6, 73),
                Arrays.asList(45, 73),
                Arrays.asList(1, 2)
        );

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i = 0; i < listOfLists.size(); i++) {
            list.addAll(listOfLists.get(i));
        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
