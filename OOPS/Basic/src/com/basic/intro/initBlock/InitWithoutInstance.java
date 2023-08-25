package com.basic.intro.initBlock;

import javax.imageio.metadata.IIOInvalidTreeException;

class Base{
    {
        System.out.println("output from base");
    }
    Base(){}
    Base(int x) {
        System.out.println("output from base with args");
    }

    Base(int x, int y) {

        System.out.println("output from base with 3 args");
    }
}
public class InitWithoutInstance extends Base{

    {
//        super(10);
        System.out.println("output from derived");
    }

    InitWithoutInstance(int x) {
        System.out.println("constructor with args");
    }
    InitWithoutInstance(){
        super(10);//even after writing explicitly there is still super(); is calling and super(10) is still in the first line thats why there is no error
//        this(1);
//        super(1, 2);
    }

    public static void main(String[] args) {
        new InitWithoutInstance();// if instance of child is created instance of parent created implicitly and reference stored in super;
    }
}
