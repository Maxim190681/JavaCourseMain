package ru.geekbrains.lesson6.online;

public class heroes {

    public static void main(String[] args) {

        Warrior warrior = new Warrior(100, 50,"Konan", 40);
        DarkDrou darkDrou = new DarkDrou(60, "Legolas", 80,20,50);
        Witcher witcher = new Witcher(20,"Witcher", 60, 30,55 );
        Titan titan = new Titan(200,200,"Titan", 10);

        System.out.println("--------------------");

        unit[] army = {warrior, darkDrou, witcher, titan};
//        ((DarkDrou) army[1]).escapeFromBattle();
        for (int i = 0; i < army.length; i++) {
            army[i].speak();
            army[i].run();
            if (army[i] instanceof DarkDrou) {  // instanceof проверка
                ((DarkDrou) army[i]).escapeFromBattle();
            }
        }

        warrior.speak();
        warrior.run();
        warrior.attack();
        warrior.takeDamage(101);

        System.out.println("--------------------");

        darkDrou.speak();
        darkDrou.run();
        darkDrou.attack();
        darkDrou.takeDamage(70);
        darkDrou.escapeFromBattle();

        System.out.println("--------------------");

        witcher.speak();
        witcher.run();
        witcher.createFire();
        witcher.CreateIce();
        witcher.createFire();
        witcher.takeDamage(30);

        System.out.println("--------------------");

        titan.attack();
        titan.run();
        titan.takeDamage(10);
        titan.speak();
    }
}
