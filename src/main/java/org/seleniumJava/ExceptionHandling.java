package org.seleniumJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
//        exceptionHandling.arithmeticException();
        exceptionHandling.fileNotFoundException();
    }

    public void arithmeticException() {
        try {
          int a = 10;
          int b= 0;
          int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public void fileNotFoundException() throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("oldFile.txt");
        } catch (FileNotFoundException e){
            System.out.println("File Not Found Exception: " + e.getMessage());
        }
    }
}
