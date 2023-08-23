package com.basic.intro.constructor;

public class Default {

    //this is init block the code inside the init block is inserted inside constructor first line
    {
        System.out.println("Default constructor is running");
    }

    //    Default() {
    //        System.out.println("default constructor is running");
    //    }
    public static void main(String[] args) {
        new Default();
    }
}
