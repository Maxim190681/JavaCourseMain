package ru.geekbrains.lesson5.homework5;

public class employee {

    private static int current_year  = 2022; // после разбора

    private String full_Name;
    private String position;
    private String email;
    private String phonenum;
    private int salary;
    private int birthday; //age;

   /* public String getfull_Name() {
        return full_Name;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public float getTellnum() {
        return tellnum;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }*/

    public employee(String full_Name, String position, String email, String phonenum, int salary, int birthday) {
        this.full_Name = full_Name;
        this.position = position;
        this.email = email;
        this.phonenum = phonenum;
        this.salary =salary;
        this.birthday = birthday;
    }

    int getAge() {
        return current_year - birthday;
    }
    int getSalary() {
        return salary;
    }

//        public void outputData() {
//        System.out.println("fullName " + full_Name) и  т.д;    }


    String getFullData() {
        return this.full_Name + ", " + this.position + ", " + this.getAge()+ " years old, " + " Phone Number: " +
                this.phonenum + ", Salary is " + this.getSalary() + "RU";
    }

}
