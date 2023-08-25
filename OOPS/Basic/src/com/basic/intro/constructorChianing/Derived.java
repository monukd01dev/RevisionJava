package com.basic.intro.constructorChianing;

class Base{
    Base() {
        System.out.println("Base non arg");
    }

    Base(int x) {
        this();
        System.out.println("Base args");
    }

    Base(int x, int y, int z) {
        System.out.println("Base 3 args");
    }
}


public class Derived extends Base{
    Derived() {
        super(10);
        System.out.println("Derived non arg");
    }

    Derived(int x) {
        this();
        System.out.println("Derived args");
    }

    public static void main(String[] args) {
        new Derived(10);
    }
}
