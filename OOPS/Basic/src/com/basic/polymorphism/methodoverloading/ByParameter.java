package com.basic.polymorphism.methodoverloading;

/*
    Name    : Monu KD (monukd01dev)
    Project : Basic
    Date    : 22-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class ByParameter {

    public int sum(int a, int b) {
        return a+b;
    }

    public int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        var myObj = new ByParameter();
        System.out.println(myObj.sum(1, 2));
        System.out.println(myObj.sum(1, 2,3));
    }

}
