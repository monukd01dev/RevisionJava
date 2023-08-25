package com.basic.intro.initBlock;

class Boss{
    {
        System.out.println("value 0");
    }
}
public class InitOrderMatters extends Boss {
    {
        System.out.println("value 1");
    }
    {
        System.out.println("value 3");
    }
    {
        System.out.println("value 2");
    }
    {
        System.out.println("value 4");
    }

    InitOrderMatters() {
        System.out.println("value 5");
    }

    public static void main(String[] args) {
        new InitOrderMatters();
    }
}
