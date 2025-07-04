package org.seleniumJava;

public class Example {

    int real, image = 0;

    Example(int i, int r){
        this.real = r;
        this.image = i;
    }

    public void printFun(){
        System.out.println("printing "+ this.real +" "+ this.image);
    }
}
