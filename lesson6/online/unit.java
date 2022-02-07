package ru.geekbrains.lesson6.online;

public abstract class unit { // абстрактный -  в классе есть метод  без реализации

    protected int health;
    protected String name;
    protected int speed;

    public unit(int health, String name, int speed) {
        this.health = health;
        this.name = name;
        this.speed = speed;
        System.out.println("Parent");
    }
    public unit(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " says Something");
    }
    public void run() {
        System.out.println(name + " run with speed " + speed + " m/s");
    }
    public void takeDamage(int damage) {
        if (health >= damage) {
            health -= damage; // health = health - damage;
            System.out.println(name + " get damage" + damage + " point. Health naw is " + health);
        } else {
            System.out.println(name + " is dead");
        }
    }
    public abstract void jump();
}
