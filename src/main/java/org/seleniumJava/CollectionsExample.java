package org.seleniumJava;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        CollectionsExample collections = new CollectionsExample();
//        collections.stackEg();

//        collections.linkedSetEg();

//        collections.setEg();
//        collections.hashMapEg();

//        collections.mapOperations();

//        collections.mapOps();
//        collections.forEachMap();

        collections.mapIterator();
    }

    public void stackEg(){
        Stack<String> stack = new Stack<>();

        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        Iterator<String> iterator = stack.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element+" ");
        }
    }

    public void linkedSetEg() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Mansi");
        set.add("For");
        set.add("Anjan");
        set.add("Girish");
        System.out.println("Set elements: "+set);
    }

    public void setEg() {
        Set<String> set = Set.of("Mansi", "For", "Anjan", "Girish");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.print(element + " ");
        }
    }

    public void hashMapEg() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mansi");
        map.put(2, "For");
        map.put(3, "Anjan");
        map.put(4, "Girish");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " value " +entry.getValue() + " ");
        }
    }

    public void mapOperations(){
        Map<String, String> m = new HashMap<>();
        m.put("GFG", "geeksforgeeks.org");
        m.put("Practice", "practice.geeksforgeeks.org");
        m.put("Code", "code.geeksforgeeks.org");
        m.put("Quiz", "www.geeksforgeeks.org");

        for (Map.Entry<String, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() +" value for "+entry.getValue());
        }
    }

    public void mapOps(){
        Map<String,String> m = new HashMap<String,String>();

        // enter name/url pair
        m.put("GFG", "geeksforgeeks.org");
        m.put("Practice", "practice.geeksforgeeks.org");
        m.put("Code", "code.geeksforgeeks.org");
        m.put("Quiz", "www.geeksforgeeks.org");

        for (String s : m.keySet()){
            System.out.println(s+ " keys");
        }

        for (String s : m.values()){
            System.out.println(s+ " values");
        }
    }

    public void forEachMap() {
        Map<String,String> m = new HashMap<String,String>();

        // enter name/url pair
        m.put("GFG", "geeksforgeeks.org");
        m.put("Practice", "practice.geeksforgeeks.org");
        m.put("Code", "code.geeksforgeeks.org");
        m.put("Quiz", "www.geeksforgeeks.org");

        m.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public void mapIterator() {
        Map<String, String> map = new HashMap<>();

        // enter name/url pair
        map.put("GFG", "geeksforgeeks.org");
        map.put("Practice", "practice.geeksforgeeks.org");
        map.put("Code", "code.geeksforgeeks.org");
        map.put("Quiz", "www.geeksforgeeks.org");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
