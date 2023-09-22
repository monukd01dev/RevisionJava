package com.inheritance.isA;

class Horse extends Animal{
    void tellHorse() {
        System.out.println("I'm Horse");
    }
}
class Panda extends Animal{
    void tellPanda() {
        System.out.println("I'm Panda");
    }
}
public class Hierarchical {

    public static void main(String[] args) {
        var pan = new Panda();
        pan.tellAnimal();
        pan.tellPanda();
        var horse = new Horse();
        horse.tellAnimal();
        horse.tellHorse();
    }

}
