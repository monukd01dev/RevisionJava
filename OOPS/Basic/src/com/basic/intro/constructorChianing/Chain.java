package com.basic.intro.constructorChianing;

public class Chain {

    Chain(){
        System.out.println("Run Last Output First");
    }

    Chain(int x) {
        this();
        System.out.println("Run Third Output Third Last");
    }

    Chain(int x, int y) {
        this(1);
        System.out.println("Run Second Output Second Last");
    }

    Chain(int x, int y, int z) {
        this(1,2);
        System.out.println("Run First Output Last");
    }


    public static void main(String[] args) {
        new Chain(1, 2, 3);
    }
}
