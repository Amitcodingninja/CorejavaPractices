package org.CompPract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Amit", 21));
        list.add(new Student("Sonu", 32));
        list.add(new Student("Monu", 23));

        Collections.sort(list);
        System.out.println("Sorted By Marks");
        for (Student s : list) {
            System.out.println(s);
        }

        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted By Name");
        for (Student s : list) {
            System.out.println(s);
        }


    }
}
