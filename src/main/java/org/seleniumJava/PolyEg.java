package org.seleniumJava;

public class PolyEg {

    int add(int a, int b) {
        return a + b;
    }

    long add(long a, long b) {
        return a + b;
    }

    int add(double a, double b) {
        return (int) (a + b);
    }

    class animal {

        String name;
        int age;

        animal(String name, int age) {
            this.name = name;

        }
    }
}
