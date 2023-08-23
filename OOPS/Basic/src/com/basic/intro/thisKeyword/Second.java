package com.basic.intro.thisKeyword;

public class Second {
    int emp_id;
    String emp_name;

    void setData(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
//        this.display();
        display();// this he implicitly added here
    }

    void display() {
        System.out.println("---------------------------------------");
        System.out.println("Employee ID       : "+emp_id);
        System.out.println("Employee Email    : "+emp_name);
        System.out.println("---------------------------------------\n");

    }

    public static void main(String[] args) {
        Second emp1 = new Second(),emp2 = new Second();

        emp1.setData(202,"monukd01dev@gmail.com");
        emp2.setData(204,"lkguptaoffical@gmail.com");
    }

}
