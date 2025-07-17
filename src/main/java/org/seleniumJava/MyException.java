package org.seleniumJava;

public class MyException extends Exception {
    String message;
    int debugId;
    public MyException(String message, int debugId) {
        this.message = message;
        this.debugId = debugId;
    }

    public MyException() {}

    // 1. Write a program that throws and catches a custom exception if age < 18.
}
