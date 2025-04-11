package org.Comparable;


import java.util.Arrays;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
//        return this.marks - o.marks;
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 85);
        Student s2 = new Student("Priya", 92);
        Student s3 = new Student("Amit", 78);
        Student[] students = {s1, s2, s3};
        Arrays.sort(students);

        System.out.println("Student Sorted By Marks : ");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
