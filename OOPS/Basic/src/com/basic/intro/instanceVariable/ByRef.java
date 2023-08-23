package com.basic.intro.instanceVariable;


public class ByRef {
    int product_id;
    String product_name;

    public static void main(String[] args) {
        ByRef obj1 = new ByRef();
        obj1.product_id = 1;
        obj1.product_name = "TestProduct";

        System.out.println("Product ID      : " + obj1.product_id);
        System.out.println("Product Name    : " + obj1.product_name);

    }
}
