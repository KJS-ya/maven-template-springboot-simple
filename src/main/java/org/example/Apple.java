package org.example;

public class Apple {
    private int num;
    private String color;
    public Apple(int num){
        this(num,"红色");
    }

    public Apple(String color){
        this(1,color);
    }
    public Apple(int num, String color) {
        this.num = num;
        this.color = color;
    }

}

