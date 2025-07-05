package org.seleniumJava;

import java.util.ArrayList;

public class GFG {
    String name;
    int rollNo;

    GFG(String s, int roll){
        this.name = s;
        this.rollNo = roll;
    }

    @Override
    public String toString() {
       return "Name: "+this.name +" roll No: "+this.rollNo;
    }

    public static void main(String[] args) {
        GFG gfg1 = new GFG("Girish" , 1);
        GFG gfg2 = new GFG("Anjan", 2);
        GFG gfg3 = new GFG("Mansi", 3);

        ArrayList<GFG> arrayList = new ArrayList<>();
        arrayList.add(gfg1);
        arrayList.add(gfg2);
        arrayList.add(gfg3);
        for (GFG gfg : arrayList){
            System.out.println(gfg+" ");
        }

    }
}


