package ru.geekbrains.lesson2.online;

public class onlineapp {

    /**
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 17.01.2022
     */


        public static int valueFromClass = 10;

        public static void main(String[] args) {
//        run();
//        int valueFromMethod = 35;
//        System.out.println(valueFromClass);
//        System.out.println(valueFromMethod);
//        method2();
//        studySwitch();

//        studyFor1();

//        printTable(10,10);

            int a = 0;

            while (a < 10) {
                a++;
//            if (a == 4 || a == 7) {
//                continue;
//            }
//            if (a == 8) {
//                break;
//            }
                System.out.print(a + " | ");

            }

//        do {
//            a++;
//            System.out.print(a + " | ");
//        } while (a < 10);

        }

        public static void studyFor1() {
            System.out.println(3);
            System.out.println(4);
            System.out.println(5);
            System.out.println(6);
            System.out.println(7);

            System.out.println("***");

            for(int i = 1; i <= 5; i++) {
                System.out.println(i + 2);
            }

            for(int i = 1; i <= 9; i = i + 2) {
                System.out.println(i);
            }
        }

        public static void printTable(int width, int height) {
            for (int y = 1; y <= height; y++) {
                for (int x = 1; x <= width; x++) {
                    System.out.print(y * x + "\t");
                }
                System.out.println();
            }
        }

//    public static void run() {
//
//        for (int i = 3; i <= 10; i++) {
//            System.out.println("I run now " + (i + 2) + " circle");
//        }
//    }





//    public static void method2() {
//        System.out.println(valueFromClass);
//    }

//    private static void studySwitch() {
//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Alex") {
//            System.out.println("Send letter to Alex");
//            System.out.println(valueFromClass);
//            int valueFromIf = 99;
//            System.out.println(valueFromIf);
//        } else if (nameLetter == "Boris") {
//            System.out.println("Send letter to Boris");
//        } else if (nameLetter == "Olga") {
//            System.out.println("Send letter to Olga");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("*****************************");
//
//        switch (nameLetter) {
//            case "Boris":
//                System.out.println("Send letter to Boris");
//                break;
//            case "Alex":
//                System.out.println("Send letter to Alex");
//                break;
//            case "Olga":
//                System.out.println("Send letter to Olga");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
}
