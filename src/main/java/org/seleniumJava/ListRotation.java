package org.seleniumJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRotation {

//    Java Program to Rotate Elements of the List

    public static void main(String[] args) {
        ListRotation  listRotation = new ListRotation();
        listRotation.listRotate();
    }


    // List Before Rotation : [10, 20, 30, 40, 50, 60, 70]
    //List After Rotation :  [40, 50, 60, 70, 10, 20, 30]
    public void listRotate() {
        List<Integer> my_list = new ArrayList<>();

        my_list.add(10);
        my_list.add(20);
        my_list.add(30);
        my_list.add(40);
        my_list.add(50);
        my_list.add(60);
        my_list.add(70);

        System.out.println("List Before Rotation: "+my_list);

        // Rotating the list at distance -3
        Collections.rotate(my_list, -4);
        // Output of this is - 
//        List Before Rotation: [10, 20, 30, 40, 50, 60, 70]
//        List After Rotation: [50, 60, 70, 10, 20, 30, 40]

//        List<Integer> temp = new ArrayList<>();
//        for (int i=0; i<=2; i++){
//            temp.add(my_list.get(i));
//        }
//        int k=0;
//        for (int i= 3; i< my_list.size(); i++){
//            my_list.set(k, my_list.get(i));
//            k++;
//        }
//        for (int i=0; i< temp.size(); i++) {
//            my_list.set(k, temp.get(i));
//            k++;
//        }
        System.out.println("List After Rotation: "+my_list);
    }
}
