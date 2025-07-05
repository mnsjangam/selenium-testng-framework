package org.seleniumJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapT {
    public static void main(String[] args) {
        HashMap<Integer, HashMapT> map = new HashMap<>();

        HashMapT hashMapT1 = new HashMapT("Girish", "Changlere");
        HashMapT hashMapT2 = new HashMapT("Anjan", "Changlere");
        HashMapT hashMapT3 = new HashMapT("Mansi", "Jangam");

        map.put(101, hashMapT1);
        map.put(102, hashMapT2);
        map.put(103, hashMapT3);

        for (Map.Entry<Integer, HashMapT> entry : map.entrySet()){
            System.out.println(entry.getKey() + " value " +entry.getValue() + " ");
        }
    }

    String firstName, lastName;
    HashMapT(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    @Override
    public String toString(){
        return "Name: "+ this.firstName +" Last Name: "+ this.lastName;
    }
}
