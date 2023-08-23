package com.basic.intro.instanceVariable;

public class InitBlock {

    int pr_id;
    String pr_name;

    {//init block
        pr_id = 0;
        pr_name = "sample";
    }
    public static void main(String[] args) {
        InitBlock obj = new InitBlock();

        System.out.println("Product ID      : " + obj.pr_id);
        System.out.println("Product Name    : " + obj.pr_name);
    }
}
