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
