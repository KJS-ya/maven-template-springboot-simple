package org.example.lanbda;

interface Runnable001{
    public void run(int speed);
}

public class Lambda001 {
    public static void main(String[] args) {
        int speed = 100;

        //lambda expression:
        Runnable001 r = (carSpeed)->{
            System.out.println("Running at the speed of " + carSpeed);
        };
        r.run(speed);
        //specifying type of parameters
        Runnable001 r1 = (int carSpeed)->{
            System.out.println("Running at the speed of " + carSpeed);
        };
        r1.run(speed);
    }

}
