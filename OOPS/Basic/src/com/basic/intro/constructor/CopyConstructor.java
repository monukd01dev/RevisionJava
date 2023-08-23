package com.basic.intro.constructor;

public class CopyConstructor {
    // In java there is no copy constructor like c++ but we can create
    int emp_id;
    String emp_name;

    CopyConstructor() {}
    CopyConstructor(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;

        display();
    }

    CopyConstructor(CopyConstructor cc) {
        this.emp_id = cc.emp_id;
        this.emp_name = cc.emp_name;
    }
    void display() {
        System.out.println("---------------------------------------");
        System.out.println("Employee ID      : "+emp_id);
        System.out.println("Employee Name    : "+emp_name);
        System.out.println("---------------------------------------\n");

    }

    public static void main(String[] args) {
        CopyConstructor emp1 = new CopyConstructor(301,"Krishna");
        CopyConstructor emp2 = new CopyConstructor(emp1);
        emp2.display();

    }
}
