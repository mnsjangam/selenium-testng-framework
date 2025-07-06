package org.seleniumJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

    public static void main(String[] args) {
        // Example usage of the ListToMap class
        System.out.println("List to Map example");

        Student student1 = new Student("Alice", "Broadway");
        Student student2 = new Student("Bob", "Lakeview");
        Student student3 = new Student("Charlie", "Charlotte");

        Map<Student, Integer> map = new HashMap<>();
        map.put(student1, 1);
        map.put(student2, 2);
        map.put(student3, 3);

        for (Map.Entry<Student, Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() +" "+ entry.getValue());
        }
    }

    public static class Student {
        String name;
        String lastName;

        public Student(String name, String lastName){
            this.lastName=lastName;
            this.name=name;
        }

        @Override
        public String toString() {
            return "Student [lastName=" + lastName + ", name=" + name + "]";
        }
    }
}
