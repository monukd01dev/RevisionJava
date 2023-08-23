package com.basic.intro.thisKeyword;

class Temp {
//    Fifth obj;

    void hellow (Fifth obj) {
//        this.obj = obj;
        System.out.println("Hello Jee!");
    }

}
public class Fifth {
    Fifth() {
//        Temp obj = new Temp();
//        obj.hellow(this);
        new Temp().hellow(this);
    }

    public static void main(String[] args) {
        new Fifth();
    }
}
