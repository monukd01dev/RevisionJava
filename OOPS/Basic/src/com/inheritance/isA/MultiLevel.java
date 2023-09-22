package com.inheritance.isA;

/*
    Name    : Monu KD (monukd01dev)
    Project : Basic
    Date    : 01-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/

class Animal {
    void tellAnimal() {
        System.out.println("I'm Animal");
    }
}

class Dog extends Animal{
    void tellDog() {
        System.out.println("I'm a dog");
    }
}

class BabyDog extends Dog{
    void tellBaby() {
        System.out.println("I'm Baby Dog");
    }
}

public class MultiLevel {

    public static void main(String[] args) {
        var bdog = new BabyDog();
        bdog.tellAnimal();
        bdog.tellDog();
        bdog.tellBaby();

    }


}
