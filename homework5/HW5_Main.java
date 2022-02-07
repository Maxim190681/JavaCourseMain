package ru.geekbrains.lesson5.homework5;

/**
 * ZhegunovM 2022-1 Java1 GB 5
 *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет
 */

public class HW5_Main {
        public static void main(String[] args) {

            employee[] employees = new employee[5];
            employees[0] = new employee("Ivanov II", "staff", "ivanov@mail", "9104564545",50,1999);
            employees[1] = new employee("Petrov pp", "junstaff", "petrov@mail", "911456445",40,2000);
            employees[2] = new employee("Sidorov SS", "Ingener", "sidorov@mail", "9124564545",60,1985);
            employees[3] = new employee("Ivanova AA", "seniorstaff", "ivanova@mail", "9144564545",60,1981);
            employees[4] = new employee("Andreev AA", "manager", "andreev@mail", "9164564545",100,1980);

            getAllEmployeeData(employees);
            System.out.println("-----------------");
            getOver40YearsOld(employees,40);

        }

        private static void getAllEmployeeData(employee[] employees) {
            System.out.println("AllEmployee: " );
            for (int i = 0; i < employees.length; i++)
                 System.out.println((i + 1) + " " + employees[i].getFullData());
        }

        private static void getOver40YearsOld(employee[] employees, int year) {
            for (int i = 0; i < employees.length; i++)
                if (employees[i].getAge() > year) {
                    System.out.println(employees[i].getFullData());
                }

        }

}
