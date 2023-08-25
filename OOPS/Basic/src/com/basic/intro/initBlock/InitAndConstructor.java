package com.basic.intro.initBlock;

class Parent{
    Parent() {
        System.out.println("output from Parent!");
    }
}
public class InitAndConstructor extends Parent {
    {
        System.out.println("output from init block");
    }

    InitAndConstructor() {
        System.out.println("output from constructor");
    }

    public static void main(String[] args) {
        new InitAndConstructor();
    }

}
