package com.basic.intro.thisKeyword;

public class Sixth {
    Sixth getReference() {
        return this;
    }

    public static void main(String[] args) {
        Sixth obj = new Sixth();
        System.out.println(obj);
        System.out.println(obj.getReference());
    }
}
