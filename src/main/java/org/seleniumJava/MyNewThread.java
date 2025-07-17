package org.seleniumJava;

public class MyNewThread implements Runnable {

    @Override
    public void run() {
        System.out.println("MyNewThread run");
    }
}
