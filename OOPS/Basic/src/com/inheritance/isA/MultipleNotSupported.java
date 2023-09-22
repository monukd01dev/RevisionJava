package com.inheritance.isA;

/*
* this program will demonstrate that multiple is not supported in java for classes
* */

class A {
    void same() {
        System.out.println("I will cause the ambiguity error");
    }
}
class B {
    void same() {
        System.out.println("I will cause the ambiguity error");
    }
}
//public class MultipleNotSupported extends A,B {
//    public static void main(String[] args) {
//        new MultipleNotSupported().same();
//    }
//}
