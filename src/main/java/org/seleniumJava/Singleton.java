package org.seleniumJava;

public class Singleton {
    private static Singleton isInstance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (isInstance == null){
            isInstance = new Singleton();
        }
        return isInstance;
    }
}
