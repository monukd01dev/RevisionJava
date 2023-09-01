package com.inheritance;

/*
    Name    : Monu KD (monukd01dev)
    Project : Basic
    Date    : 01-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/

//In this example the relationship between Employee and Programmer is "Programmer IS A Employee"
class Employee{
    float salary;

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}

class Programmer extends Employee{
    int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    void display() {
        System.out.println("Employee Salary : "+ getSalary());
        System.out.println("Programmer Bonus : "+ getBonus());
    }
}
public class SingleLevel {

    public static void main(String[] args) {
        var monu = new Programmer();
        monu.setSalary(50_000);
        monu.setBonus(25_000);
        monu.display();
    }
}





























