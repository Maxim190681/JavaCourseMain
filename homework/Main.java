package ru.geekbrains.lesson6.homework;

public class Main {
    public static void main(String[] args) {

        String tempWinEvent = " Its done";
        String tempLossEvent = " Its not done";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Tom", 2, 200);
        Cat cat2 = new Cat("Matroskin", 5, 400);
        Dog dog1 = new Dog("Gufi", 0.5f, 500);
        Dog dog2 = new Dog("Lessi", 1.5f, 350);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " can ";

            eventName = "run on " + animals[i].getMaxRun() + " м. try run on ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "swim on " + animals[i].getMaxSwim() + " м. try swim on ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " It did not work, because does not swim";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("All animals = " + Animal.countAnimal + " > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м and" + resultEvent);
    }
}
