package ru.geekbrains.lesson3.homework;

import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
        System.out.println("HomeWork_3");
        System.out.println(">>>>>1<<<<<");
        invertArray();
        System.out.println();
        System.out.println("----------");
        System.out.println(">>>>>2<<<<<");
        fillArray();
        System.out.println("----------");
        System.out.println(">>>>>3<<<<<");
        changeArray();
        System.out.println();
        System.out.println("----------");
        System.out.println(">>>>>4<<<<<");
        System.out.println("выполнено с  разбором  кода с помощью друга разработчика");
        fillDiagonal(4);
        System.out.println("----------");
        System.out.println(">>>>>5<<<<<");
        System.out.println("выполнено с  разбором  кода с помощью друга разработчика");
        printArrayInConsole(TwoArgums(5,2));
        System.out.println("----------");
        System.out.println();
        System.out.println("<The END>");
    }

    public static void invertArray() {

//Задать целочисленный массив, состоящий из элементов 0 и 1.Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] newarray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int adData = newarray.length;
        for (int i = 0; i < adData; i++) {
            System.out.print(i + "-" + newarray[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < adData; i++)
            if (newarray[i] == 1) {
                newarray[i] = 0;
            } else newarray[i] = 1;
        System.out.println();
        for (int i = 0; i < adData; i++) {
            System.out.print(i + "-" + newarray[i] + " ");
        }
    }
    public static void fillArray() {
// Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++);
        int j = 1;
        int adData = arr.length;
        for(int i = 0; i < adData; i++) {
            System.out.print (i + "-" + arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < adData; i++, j = j+1){
            arr[i] = j;
        }
        System.out.println();
        for(int i = 0; i < adData; i++){
            System.out.print (i + "-" + arr[i]+" ");
        }
    }
    public static void changeArray(){
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) arr[i] = arr[i] * 2;
            }
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print (i + "-" + arr[i]+" ");
        }

    }

    public static void fillDiagonal(int square){
// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
// заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] Sq2Array = new int[square][square];
        for (int i = 0; i < square; i++) {
            for (int f = 0; f < square; f++){
                Sq2Array[i][f] = (i == f || f == (square - i - 1))? 1 : (int) (Math.random()*100);
                System.out.printf("%4d", Sq2Array[i][f]);
            }
        System.out.println();
        }
    }

// Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
// одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] TwoArgums(int len, int initialValue) {
        int arr [] = new int[len];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = initialValue;
        }
        return arr;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }


}





