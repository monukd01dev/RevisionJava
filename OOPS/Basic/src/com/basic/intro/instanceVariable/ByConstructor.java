package com.basic.intro.instanceVariable;

public class ByConstructor {
    int pr_id;
    String pr_name;

    public ByConstructor(int id ,String name) {
        pr_id = id;
        pr_name= name;
    }

    public static void main(String[] args) {
        ByConstructor obj = new ByConstructor(3,"Third_Product");

        System.out.println("Product ID      : " + obj.pr_id);
        System.out.println("Product Name    : " + obj.pr_name);
    }
}
