package com.basic.intro.thisKeyword;

public class First {
    int emp_id;
    String emp_name;

    void setData(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    void display() {
        System.out.println("---------------------------------------");
        System.out.println("Employee ID      : "+emp_id);
        System.out.println("Employee Name    : "+emp_name);
        System.out.println("---------------------------------------\n");

    }

    public static void main(String[] args) {
        First emp1 = new First();
        First emp2 = new First();

        emp1.setData(101,"Monu KD");
        emp2.setData(102,"Lalit Gupta");

        emp1.display();
        emp2.display();
    }
}


























