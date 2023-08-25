package com.basic.intro.thisKeyword;

class Temp {
    Temp(Fifth obj) {
        System.out.println("Namaste Bhai!");
    }

    Temp() {}
    void hellow (Fifth obj) {
//        this.obj = obj;
        System.out.println("Hello Jee!");
    }

}
public class Fifth {
    Fifth() {
//        Temp obj = new Temp();
//        obj.hellow(this);
        new Temp(this);
        new Temp().hellow(this);
    }

    public static void main(String[] args) {
        new Fifth();
    }
}
