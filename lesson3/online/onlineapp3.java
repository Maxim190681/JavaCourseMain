package ru.geekbrains.lesson3.online;

import java.util.Random;
import java.util.Scanner;

public class onlineapp3 {

    /**
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 20.01.2022
     */

        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        public static void main(String[] args) {

//        studyArray1();
//        System.out.println(welcomeUser("Enter your name","Hello "));
//        System.out.println(welcomeUser("Enter your phone","Your phone is "));
//        System.out.println("Result = " + sum());
//        studyRandom();

//        int[][] myArrayInt2 = new int[5][];
//
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            myArrayInt2[i] = new int[random.nextInt(20)];
//        }
//
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            for (int j = 0; j < myArrayInt2[i].length; j++) {
//                myArrayInt2[i][j] = random.nextInt(50);
//            }
//        }


//        int count = 0;
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            for (int j = 0; j < myArrayInt2[i].length; j++) {
//                myArrayInt2[i][j] = count;
//                count++;
//            }
//        }
//
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            for (int j = 0; j < myArrayInt2[i].length; j++) {
//                System.out.print(myArrayInt2[i][j] + "\t");
//            }
//            System.out.println();
//        }
            studyArray2Indexes(10, 10);

//        int[][][][][][][] myArray3 = new int[5][6][7][][][][];
//
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//                for (int k = 0; k < ; k++) {
//                    for (int l = 0; l < ; l++) {
//
//                    }
//                }
//            }
//        }


        }

        public static void studyArray2Indexes(int height, int width) {
            String[][] array = new String[height][width];

            for (int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[y].length; x++) {
                    array[y][x] = "[" + y + ":" + x + "]";
                }
            }

            for (int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[y].length; x++) {
                    System.out.print(array[y][x] + "\t");
                }
                System.out.println();
            }
        }

        public static void studyArray1() {
            int[] arrayInt = new int[5];

            arrayInt[0] = 0;
            arrayInt[1] = 2;
            arrayInt[2] = 8;
            arrayInt[3] = -5;
            arrayInt[4] = 6;

            System.out.println(arrayInt[3] + arrayInt[1]);

            String[] myArrayString = new String[150];

            for (int i = 0; i < myArrayString.length; i++) {
                myArrayString[i] = "String #" + i;
            }

            for (int i = 0; i < myArrayString.length; i++) {
                System.out.print(myArrayString[i] + " | ");
            }

            String[] myArrayString2 = {"Book1", "Book2", "Book3"};

            for (int i = 0; i < myArrayString2.length; i++) {
                System.out.print(myArrayString2[i] + " | ");
            }
        }

        public static void studyRandom() {
            for (int i = 0; i < 10; i++) {
                System.out.print(random.nextInt() + " | "); // [-int;+int]
                System.out.print(random.nextInt(50) + " | "); // [0;value)
                System.out.print(random.nextFloat() + " | "); // [0;1)
                System.out.print(random.nextDouble() + " | "); // [0;1)
            }
        }

        public static String welcomeUser(String systemMsg, String welcomeMsg) {
            System.out.print(systemMsg + " > ");
            return welcomeMsg + scanner.next();
        }

        public static int inputValue(String systemMsg) {
            System.out.print(systemMsg + " > ");
            return scanner.nextInt();
        }

        public static int sum() {
            int a = inputValue("Enter value A");
            int b = inputValue("Enter value B");
            return a + b;
        }
    }
