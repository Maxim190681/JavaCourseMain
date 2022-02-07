package ru.geekbrains.lesson6.homework;

public class Dog extends Animal {
    public static int countDog = 0;
    public static String typeThisClass = "Animal Dog";

    Dog(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }
}
