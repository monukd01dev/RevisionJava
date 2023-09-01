package com.basic.intro.staticKeyword;

class Parent{
    static {
        System.out.println("number4");
    }
    static {
        System.out.println("from parent static block");
    }

    {
        System.out.println("From Parent init");
    }

    Parent(int x) {
        System.out.println("from parent chain");
    }
    Parent() {
        this(5);
        System.out.println("from parent constructor");
    }
}
public class StaticBlock extends Parent{
    static{
        System.out.println("number2");
    }
    static {
        System.out.println("from child static block");
    }
    static{
        System.out.println("number1");
    }
    static{
        System.out.println("number3");
    }

    {
        System.out.println("From Child init");
    }

    StaticBlock(int x) {
        System.out.println("From child chain");
    }
    StaticBlock() {
        this(2);
        System.out.println("Child Constructor");
    }


    public static void main(String[] args) {
        new StaticBlock();
    }
}
