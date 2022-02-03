package ru.geekbrains.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Крестики Нолики разбор кода
 */
//console application
public class homework4 {

    public static char[][] field;
    public static int fieldWidth;
    public static int fieldHeight;

    public static char playerOne = 'X';  //сущность  игрока принимаем за X Y
    public static char playerTwo = '0';
    public static char empty = '_';  // добавим _ для прорисовки поля в консоли

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); // вывод шага  компа  рандомно

    public static void main(String[] args) {
        createField();
        viewField();

        while (true) {
            stepPlayerOne();
            viewField();

            if (checkWinLine(playerOne)) {
                System.out.println(playerOne + " is Win!");
                break;
            }
            if (checkFullField()) {
                System.out.println("Sorry, game draw");
                break;
            }

            stepPlayerTwo();
            viewField();

            if (checkWinLine(playerTwo)) {
                System.out.println(playerTwo + " is Win!");
                break;
            }
            if (checkFullField()) {
                System.out.println("Sorry, game draw");
                break;
            }
        }
        System.out.println("Game Over!");
    }

    public static void createField() {
        fieldWidth = inputUserValue("Enter size field");
        fieldHeight = fieldWidth;
//        fieldWidth = 3;    для задания поля из кода
//        fieldHeight = 3;
        field = new char[fieldHeight][fieldWidth];

        for (int y = 0; y < fieldHeight; y++) {       //задаем массив
            for (int x = 0; x < fieldWidth; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void viewField() {
        for (int y = 0; y < fieldHeight; y++) {      // выводим в консоль
            for (int x = 0; x < fieldWidth; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();                    // пробел
        }
        System.out.println("-----------------");
    }

    public static void stepPlayerOne() {

        int x;
        int y;

        do {
            x = inputUserValue("Enter your X-coordinate") - 1; // массив начинается с 0
            y = inputUserValue("Enter your Y-coordinate") - 1; // удобство  пользователя
        } while (!checkStepPlayer(y, x) || !checkCellFree(y, x));

        field[y][x] = playerOne;
    }

    public static void stepPlayerTwo() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldWidth);
            y = random.nextInt(fieldHeight);
        } while (!checkCellFree(y, x));//((!checkStepPlayer(y,x) || !checkCellFree(y,x))); проверка для хода компа не нужна, только факт свободной ячейки
        field[y][x] = playerTwo;

    }

    public static boolean checkCellFree(int y, int x) {
//        if (field[y][x] == empty) return true; млжно  оптимизировать
        return field[y][x] == empty;
    }

    public static boolean checkStepPlayer(int y, int x) {
        return x >= 0 && x < fieldWidth && y >= 0 && y < fieldHeight;
    }

    public static int inputUserValue(String systemMsg) {
        System.out.print(systemMsg + " > ");
        return scanner.nextInt();
    }

    public static boolean checkWinLine(char playerChar) {
        if (field[0][0] == playerChar && field[0][1] == playerChar && field[0][2] == playerChar) return true;
        if (field[1][0] == playerChar && field[1][1] == playerChar && field[1][2] == playerChar) return true;
        if (field[2][0] == playerChar && field[2][1] == playerChar && field[2][2] == playerChar) return true;

        if (field[0][0] == playerChar && field[1][0] == playerChar && field[2][0] == playerChar) return true;
        if (field[0][1] == playerChar && field[1][1] == playerChar && field[2][1] == playerChar) return true;
        if (field[0][2] == playerChar && field[1][2] == playerChar && field[2][2] == playerChar) return true;

        if (field[0][0] == playerChar && field[1][1] == playerChar && field[2][2] == playerChar) return true;
        if (field[0][2] == playerChar && field[1][1] == playerChar && field[2][0] == playerChar) return true;

        return false;


//        if (field[0][0] == playerChar && field[0][1] == playerChar && field[0][2] == playerChar && field[0][3] == playerChar && field[0][4] == playerChar ) return true;
//        if (field[1][0] == playerChar && field[1][1] == playerChar && field[1][2] == playerChar && field[1][3] == playerChar && field[1][4] == playerChar ) return true;
//        if (field[2][0] == playerChar && field[2][1] == playerChar && field[2][2] == playerChar && field[2][3] == playerChar && field[2][4] == playerChar ) return true;
//        if (field[3][0] == playerChar && field[3][1] == playerChar && field[3][2] == playerChar && field[3][3] == playerChar && field[3][4] == playerChar ) return true;
//        if (field[4][0] == playerChar && field[4][1] == playerChar && field[4][2] == playerChar && field[4][3] == playerChar && field[4][4] == playerChar ) return true;

//        if (field[0][0] == playerChar && field[1][0] == playerChar && field[2][0] == playerChar && field[3][0] == playerChar && field[4][0] == playerChar ) return true;
//        if (field[0][1] == playerChar && field[1][1] == playerChar && field[2][1] == playerChar && field[3][1] == playerChar && field[4][1] == playerChar ) return true;
//        if (field[0][2] == playerChar && field[1][2] == playerChar && field[2][2] == playerChar && field[3][2] == playerChar && field[4][2] == playerChar ) return true;
//        if (field[0][3] == playerChar && field[1][3] == playerChar && field[2][3] == playerChar && field[3][3] == playerChar && field[4][3] == playerChar ) return true;
//        if (field[0][4] == playerChar && field[1][4] == playerChar && field[2][4] == playerChar && field[3][4] == playerChar && field[4][4] == playerChar ) return true;

//        if (field[0][0] == playerChar && field[1][1] == playerChar && field[2][2] == playerChar && field[3][3] == playerChar && field[4][4]  == playerChar) return true;
//        if (field[0][4] == playerChar && field[1][3] == playerChar && field[2][2] == playerChar && field[3][1] == playerChar && field[4][0]  == playerChar) return true;
//         return false;
    }

    public static boolean checkFullField() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                return false;
            }
        }
        return true;
    }
}
