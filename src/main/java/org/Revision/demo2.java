package org.Revision;

import java.util.Set;
import java.util.TreeSet;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 2, 6,8,7};
        Set <Integer> set = new TreeSet<>();
        for (int n :arr){
            set.add(n);
        }
        System.out.println(set);
    }
}
