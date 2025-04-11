package org.Revision;

import java.util.Objects;

public class demo3 {

    public static void main(String[] args) {
        Person p1 = new Person("Amit");
        Person p2 = new Person("Amit");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return  true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name);
    }


    public int hashCode() {
        return Objects.hash(name);
    }
}