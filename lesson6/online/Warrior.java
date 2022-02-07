package ru.geekbrains.lesson6.online;

public class Warrior extends unit {

//    private int health;
     protected int power;
//    private String name;
//    private int speed;
    public Warrior(int health, int power, String name, int speed) {
//        this.health = health;
        super(health, name, speed);
        this.power = power;
//        this.name = name;
//        this.speed = speed;  health  name speed выполняются в общем конмтрукторе
        System.out.println("Heier"); //Наследник
    }
    public Warrior(String name) {
        super(name);
    }

    // public void speak() {
    //     System.out.println(name + " says Something");
    // }
//    public void run() {
//        System.out.println(name + " run with speed " + speed + " m/s");
//    }
    public void attack() {
        System.out.println(name + " has attack with " + power * 15 + " points");
    }
//    public void takeDamage(int damage) {
    //      if (health >= damage) {
    //        health -= damage; // health = health - damage;
    //        System.out.println(name + " get damage" + damage + " point. Health naw is " + health);
    //    } else {
    //       System.out.println(name + " is dead");
    //    }
//    }
    @Override
    public void jump() {
        System.out.println(name + " jump" );
    }
}
