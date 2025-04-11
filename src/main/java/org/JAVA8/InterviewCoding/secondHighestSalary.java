package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class secondHighestSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which Highesh Sailry You want to know");
        int n = s.nextInt();
        List<Employees> list = Arrays.asList(new Employees("Amit", 60000),
                new Employees("Dilip", 75000),
                new Employees("Suman", 90000),
                new Employees("Ravi", 60000),
                new Employees("Nikita", 80000)
        );

        // Distinct Salary in descending Order

        List<Integer> sortedSalaries = list.stream()
                .map(Employees::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Step 2: Get the Nth highest salary
        int nthHighestSalary = sortedSalaries.get(n - 1);

        List<Employees> resWithDetails = list.stream()
                .filter(employees -> employees.getSalary() == nthHighestSalary)
                .collect(Collectors.toList());


//        List<Integer> res = list.stream()
//                .map(Employees::getSalary)
//                .sorted(Comparator
//                        .reverseOrder())
//                .limit(2)
//                .skip(1)
//                .toList();
//        System.out.println(res);
        System.out.println(sortedSalaries);
        System.out.println(resWithDetails);

    }
}

class Employees {
    private String name;
    private Integer Salary;

    public Employees(String name, Integer salary) {
        this.name = name;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}