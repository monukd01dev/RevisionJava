package com.basic.intro.initBlock;

public class DemoInit {
    String name ;
    String place ;

    void display(){
        System.out.println("Name        : "+name);
        System.out.println("Place       : "+place);
    }
    {
       name = "default";
       place = "default";
       display();
    }

    public static void main(String[] args) {
        new DemoInit();
    }

}
