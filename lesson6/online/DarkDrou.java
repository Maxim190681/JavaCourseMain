package ru.geekbrains.lesson6.online;

public class DarkDrou extends unit {

//    private int health;
//    private String name;
//    private int speed;
    private int power;
    private int dexterity;

    public DarkDrou(int health, String name, int speed, int power, int dexterity) {
//        this.health = health;
//        this.name = name;
//        this.speed = speed;
        super(health, name, speed);
        this.power = power;
        this.dexterity = dexterity;
    }

    //  public void speak() {
    //      System.out.println(name + " says Something");
    //  }
    //    public void run() {
    //      System.out.println(name + " run with speed " + speed + " m/s");
    //}
    public void attack() {
        System.out.println(name + " has attack with " + (power*(20 + dexterity)) + " points");
    }

//    public void takeDamage(int damage) {
//        if (health >= damage) {
//            health -= damage; // health = health - damage;
//            System.out.println(name + " get damage " + damage + " point. Health naw is " + health);
//        } else {
//            System.out.println(name + " is dead");
//        }
//    }

    public void escapeFromBattle() {
        if (health < 20) {
            System.out.println(name + " has escape from battle");
        }
    }
    @Override
    public void jump() {
        System.out.println(name + " jump");
    }
}
