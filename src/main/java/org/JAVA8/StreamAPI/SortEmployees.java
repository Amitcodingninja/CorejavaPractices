package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;
    String dept;

    Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String toString() {
        return name + " - " + age + " - " + dept;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", 30, "HR"),
                new Employee("Amit", 25, "IT"),
                new Employee("Sneha", 28, "HR"),
                new Employee("Neha", 22, "Finance"),
                new Employee("Raj", 29, "IT")
        );
        employees.stream()
                .sorted(Comparator.comparing(e -> e.age)).forEach(System.out::println);


    }
}

