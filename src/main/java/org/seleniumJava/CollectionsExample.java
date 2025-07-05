package org.seleniumJava;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        CollectionsExample collections = new CollectionsExample();
//        collections.stackEg();

//        collections.linkedSetEg();

//        collections.setEg();
        collections.hashMapEg();
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
}
