package ru.geekbrains.lesson2.homework;

public class homeworkapp {

    public static void main(String[] args) {
        System.out.println("HomeWork 2");
        System.out.println("<<<<<>>>>>");

        System.out.println(sum10and20(11, 10));
        System.out.println("----------");

        positiveNegative(-5);
        System.out.println("----------");

        System.out.println(onlyNegative(5));
        System.out.println("----------");

        PrntWordNTime("GeekBrains", 5);
        System.out.println("----------");
        System.out.println("<The END>");

// Самостоятельно задача оказалась не по  зубам
        System.out.println("Разобрался только с  подсказкой");
        int currentYear = 2024;
        System.out.println("Year " + currentYear + " is leap? > " + isLeapYear(currentYear));


    }

    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
// в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
    public static boolean sum10and20(int a, int b) {
        System.out.println("1");
//        if (a + b >= 10 && a + b <= 20) return true;
//        else return false;
//        Работа над ошибками
          return (a + b <= 20) && (a + b >= 10);
    }

// Написать метод, которому в качестве параметра передается целое число, метод должен
// напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
// считаем положительным числом*/
    public static void positiveNegative(int c) {
        System.out.println("2");
        if (c >= 0) {
            System.out.println("Number " + c + " positive");
        } else {
            System.out.println("Number " + c + " negative");
        }
    }

// Написать метод, которому в качестве параметра передается целое число, метод должен
// вернуть true, если число отрицательное и вернуть false если положительное
    public static boolean onlyNegative(int d) {
        System.out.println("3");
        if (d < 0) return true;
        return false;
// как надо
// return d <= 0
    }

    // Написать метод, которому в качестве аргументов передается строка и число, метод должен
// отпечатать в консоль указанную строку, указанное количество раз
    public static void PrntWordNTime(String word, int times) {
        System.out.println("4");
        //for (times = 0; times < 5; times++) {
        //    System.out.println("String-" + word);
        //    Работа над ошибками
            for (int i = 1; i <= times; i++){
                System.out.println("String #" + i + ": " + word);
        }
    }
// Написать метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false)
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

}
