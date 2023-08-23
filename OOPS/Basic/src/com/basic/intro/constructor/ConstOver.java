package com.basic.intro.constructor;

public class ConstOver {

    int emp_id;
    String emp_name;

    ConstOver() {}
    ConstOver(int emp_id, String emp_name) {
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
        ConstOver emp1 = new ConstOver(301,"Krishna");
        ConstOver emp2 = new ConstOver();
        emp2.display();
    }
}
