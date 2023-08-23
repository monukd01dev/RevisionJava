package com.basic.intro.instanceVariable;

public class ByMethod {
    int pr_id;
    String pr_name;

    //    methods
    void setValue(int id, String name) {
        pr_id = id;
        pr_name= name;
    }

    public static void main(String[] args) {
        ByMethod obj = new ByMethod();
        obj.setValue(2,"Second_test_product");

        System.out.println("Product ID      : " + obj.pr_id);
        System.out.println("Product Name    : " + obj.pr_name);
    }
}



























