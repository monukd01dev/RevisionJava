package com.basic.intro.thisKeyword;

public class Fourth {
    void last(Fourth obj) {
        System.out.println("This can be used to pass as an argument in method call");
    }

    void runLast() {
        last(this);
    }

    public static void main(String[] args) {
        new Fourth().runLast();
    }
}
class Fourth2 {
    static void printReference(Fourth2 obj) {
        System.out.println(obj);
        
    }

    void runStaticMethod() {
        printReference(this);
    }

    public static void main(String[] args) {
        var myObj = new Fourth2();
        System.out.println(myObj);
        myObj.runStaticMethod();
    }
}