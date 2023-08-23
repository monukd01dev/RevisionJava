package com.basic.intro.anonymousObject;

public class AnonymObj {
    String message;

    void showMessage(String mes) {
        message = mes;
        System.out.println("your Message : " + message);
    }
    public static void main(String[] args) {
        new AnonymObj().showMessage("monukd01dev@gmail.com");
    }
}
