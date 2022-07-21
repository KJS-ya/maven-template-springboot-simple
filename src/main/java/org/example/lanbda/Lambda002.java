package org.example.lanbda;

interface Runnable002{
    public String run(int speed, int distance);
}

public class Lambda002 {
    public static void main(String[] args) {
        //lambda expression:without return
        Runnable002 r = (carSpeed,distance)->
            ("Distance covered " + distance + "Km at the speed of " + carSpeed);
        String r15 = r.run(80,150);
        System.out.println(r15);

        Runnable002 r2 = (carSpeed,distance)->{
            return ("Distance covered " + distance + "Km at the speed of " + carSpeed);
        };
        String fz = r2.run(100,200);
        System.out.println(fz);
    }
}
