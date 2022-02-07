package ru.geekbrains.lesson6.online;

public class Titan extends Warrior {
    public Titan(int health, int power, String name, int speed) {
        super(health, power, name, speed);
    }
    @Override
    public void speak() {
//        System.out.println(name + " don't speak");
        super.run();
       //super.power();
        System.out.println("Hello");
    }
}
