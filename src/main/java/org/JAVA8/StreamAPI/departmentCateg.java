//package org.JAVA8.StreamAPI;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//class Employee {
//    String name;
//    String dept;
//
//    Employee(String name, String dept) {
//        this.name = name;
//        this.dept = dept;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", dept='" + dept + '\'' +
//                '}';
//    }
//}
//
//public class departmentCateg {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee("Ravi", "HR"),
//                new Employee("Amit", "IT"),
//                new Employee("Sneha", "HR"),
//                new Employee("Neha", "Finance"),
//                new Employee("Raj", "IT")
//        );
//
////        System.out.println(employees);
//        Map<String, List<String>> collect = employees
//                .stream()
//                .collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println(collect);
//
//    }
//}