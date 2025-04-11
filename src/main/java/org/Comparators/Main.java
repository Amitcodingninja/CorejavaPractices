package org.Comparators;

import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class MarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}

class nameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 23));
        students.add(new Student("Jahida", 89));
        students.add(new Student("Aman", 73));
        students.add(new Student("Priya", 45));
        students.add(new Student("Rahul", 56));
        students.add(new Student("Neha", 67));
        students.add(new Student("Ravi", 92));
        students.add(new Student("Pooja", 34));
        students.add(new Student("Ankit", 78));
        students.add(new Student("Suman", 81));
        System.out.println("Sorted By Marks");

        Collections.sort(students, new MarksComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Sorted By Name");

        Collections.sort(students, new nameComparator());
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
