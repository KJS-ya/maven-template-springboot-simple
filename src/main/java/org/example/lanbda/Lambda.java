package org.example.lanbda;

interface Runnable{
    public void run();
}

public class Lambda {
    public static void main(String[] args) {
        int speed = 100;

        Runnable runnable = ()->{
            System.out.println("Runnable at the speed of" + speed);
        };

        runnable.run();
    }
}
