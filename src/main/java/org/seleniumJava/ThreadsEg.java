package org.seleniumJava;

public class ThreadsEg extends Thread {

    public static void main(String[] args) {
        ThreadsEg threadsEg = new ThreadsEg();
        threadsEg.start();
        System.out.println(threadsEg.isAlive());
        threadsEg.runThread();
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void runThread() {
        for (int i = 1; i < 5; i++) {
            try {
                // thread to sleep for 500 milliseconds
                sleep(5);
                System.out.println("Currently running - "+ Thread.currentThread().getName());
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
