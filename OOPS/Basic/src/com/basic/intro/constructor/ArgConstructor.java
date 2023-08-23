package com.basic.intro.constructor;

public class ArgConstructor {
    int emp_id;
    String emp_name;
    ArgConstructor(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;

        display();
    }
    void display() {
        System.out.println("---------------------------------------");
        System.out.println("Employee ID      : "+emp_id);
        System.out.println("Employee Name    : "+emp_name);
        System.out.println("---------------------------------------\n");

    }

    public static void main(String[] args) {
        ArgConstructor emp1 = new ArgConstructor(301,"Krishna");
    }
}
