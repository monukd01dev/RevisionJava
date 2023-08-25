package com.basic.intro.constructorChianing;

class Parent{
    Parent() {
        this(1);
        System.out.println("I will output 2nd");
    }
    Parent(int x){
        System.out.println("I will output 1st");
    }
}
public class Child extends Parent {

    Child() {
        System.out.println("From Child output 3rd");
    }

    Child(int x) {
        this();
        System.out.println("From Child output 4th");
    }

    public static void main(String[] args) {
        new Child(10);
    }
}
