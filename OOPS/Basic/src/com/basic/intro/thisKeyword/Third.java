package com.basic.intro.thisKeyword;

public class Third {
    int emp_id;
    String emp_name;

    Third() {
        this(true);
    }

    Third(boolean ans) {
        setData(0,null);
    }

    void setData(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        display();
    }

    void display() {
        System.out.println("---------------------------------------");
        System.out.println("Employee ID      : " + emp_id);
        System.out.println("Employee Name    : " + emp_name);
        System.out.println("---------------------------------------\n");

    }

    public static void main(String[] args) {
        Third emp1 = new Third();
    }
}
