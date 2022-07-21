package org.example.lanbda;

import java.lang.Runnable;

public class Demo001 {
    public static void main(String[] args) {

        // Thread Implementation using anonymous class
        Runnable run = new Runnable(){
            public void run() {
                System.out.println("Thread running...");
            }
        };
        new Thread(run).start();

        // Thread Implementation using lambda expression
        Runnable run1 = ()->System.out.println("Thread Running using lambda...");
        new Thread(run1).start();

    }
}
