package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    String name;
    String dept;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee() {

    }
}

class Main {
    public static void main(String[] args) {
//        Employee e = new Employee();
//        HashMap<String, String> map = new HashMap<>();
//        map.put(new Employee("Amit", "IT"),new Employee("Dilip", "Testing"));

        List<Employee> list = Arrays.asList(new Employee("Amit", "IT"),
                new Employee("Dilip", "Testing"),
                new Employee("Suman", "IT"),
                new Employee("Ravi", "HR"),
                new Employee("Nikita", "Testing"));

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(collect);

        collect.forEach((dept, empList) -> {
            System.out.println(dept + " => " + empList);
        });

    }
}
