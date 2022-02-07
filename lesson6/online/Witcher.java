package ru.geekbrains.lesson6.online;

public class Witcher extends unit {

//    private int health;
//    private String name;
//    private int speed;
    private int intellect;
    private int mana;
    private int costCreateFire = 20;
    private int costCreateIce = 30;

    public Witcher(int health, String name, int speed, int intellect, int mana) {
//        this.health = health;
//        this.name = name;
//        this.speed = speed;
        super(health, name, speed);
        this.intellect = intellect;
        this.mana = intellect * 2;
    }
   // public void speak() {
   //     System.out.println(name + " says Something");
   // }
   //    public void run() {
   //        System.out.println(name + " run with speed " + speed + " m/s");
   //    }
    public void createFire() {
        if (mana >= costCreateFire) {
            mana -= costCreateFire;
            System.out.println(name + " has created Fire. Current mana > " + mana);
        } else {
            System.out.println("Not enough mana. Need " + (costCreateFire - mana) + " point");
        }
    }
    public void CreateIce() {
        if (mana >= costCreateIce) {
            mana -= costCreateIce;
            System.out.println(name + " has created Ice. Current mana > " + mana);
        } else {
            System.out.println("Not enough mana. Need " + (costCreateIce - mana) + " point");
        }
    }
//    public void takeDamage(int damage) {
//        if (health >= damage) {
//            health -= damage; // health = health - damage;
//            System.out.println(name + " get damage " + damage + " point. Health naw is " + health);
//        } else {
//            System.out.println(name + " is dead");
//        }
//    }

    public void jump() {
        System.out.println(name + " jump-jump-jump");
    }
}
