package ru.murtazin.homeworks.homework11;

import java.util.Scanner;

/**
 * Домашнее задание 11. (ООП. Часть 2)
 * Создайте классы Cat, Dog и Horse с наследованием от класса Animal
 * У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
 * Затраты выносливости:
 * Все животные на 1 метр бега тратят 1 ед. выносливости,
 * Собаки на 1 метр плавания - 2 ед.
 * Лошади на 1 метр плавания тратят 4 единицы
 * Кот плавать не умеет.
 * Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время,
 * затраченное на указанное действие, и “понижать выносливость” животного.
 * Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости.
 * При выполнении действий пишем сообщения в консоль.
 * Добавьте метод info(), который выводит в консоль состояние животного.
 */
public class Main {
    public static String competition;
    public static int distance;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog = new Dog("Barni", 4.0, 3.0, 30.0);
        Horse horse = new Horse("Spirit", 10, 5, 100);
        Cat cat = new Cat("Snowball", 6, 0, 25);
        System.out.println("Добро пожаловать!\n" +
                "Уcтроим спортивные соревнования между животными.\n" +
                "Доступны следующие дисциплины:\n" +
                "run - бег\n" +
                "swim - плавание\n" +
                "info - информация об участниках\n" +
                "quit - завершить соревнования");
        do {
            System.out.println("Выберите дисциплину");
            competition = scan.next();
            switch (competition) {
                case "run":
                    System.out.println("Введите дистанцию бега");
                    distance = scan.nextInt();
                    timeToRun(dog);
                    timeToRun(cat);
                    timeToRun(horse);
                    break;
                case "swim":
                    System.out.println("Введите дистанцию плавания");
                    distance = scan.nextInt();
                    timeToSwim(dog);
                    timeToSwim(cat);
                    timeToSwim(horse);
                    break;
                case "info":
                    dog.info();
                    cat.info();
                    horse.info();
                    break;
                case "quit":
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неизвестная дисциплина");
                    break;
            }
        } while (!competition.equals("quit"));
    }

    private static void timeToRun(Animal animal) {
        if (animal.run(distance) > 0.0) {
            System.out.println(animal.getName() + " преодолел дистанцию за " + animal.run(distance) + " с");
            animal.setEndurance(animal.getEndurance() - distance);
            System.out.println("Остаток выносливости " +
                    (animal.getEndurance() != 0 ? animal.getEndurance() :
                            animal.getEndurance() + "\nТребуется отдых") + "\n");
        } else {
            System.out.println(animal.getName() + " преодолеет только " + animal.getEndurance() + " м");
            animal.setEndurance(0.0);
            System.out.println("Остаток выносливости у " + animal.getName() + " равен " + animal.getEndurance() +
                    ".\nТребуется отдых.\n");
        }
    }

    private static void timeToSwim(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            System.out.println(animal.getName() + " не умеет плавать\n");
        } else if (animal.getClass().equals(Dog.class)) {
            if (animal.swim(distance) > 0.0) {
                System.out.println(animal.getName() + " преодолел дистанцию за " + animal.swim(distance) + " с");
                animal.setEndurance(animal.getEndurance() - distance * 2);
                System.out.println("Остаток выносливости " +
                        (animal.getEndurance() != 0 ? animal.getEndurance() :
                                animal.getEndurance() + "\nТребуется отдых") + "\n");
            } else {
                System.out.println(animal.getName() + " преодолеет только " + animal.getEndurance() / 2.0 + " м");
                animal.setEndurance(0.0);
                System.out.println("Остаток выносливости у " + animal.getName() + " равен " + animal.getEndurance() +
                        ".\nТребуется отдых.\n");
            }
        } else if (animal.getClass().equals(Horse.class)) {
            if (animal.swim(distance) > 0.0) {
                System.out.println(animal.getName() + " преодолел дистанцию за " + animal.swim(distance) + " с");
                animal.setEndurance(animal.getEndurance() - distance * 4);
                System.out.println("Остаток выносливости " +
                        (animal.getEndurance() != 0 ? animal.getEndurance() :
                                animal.getEndurance() + "\nТребуется отдых") + "\n");
            } else {
                System.out.println(animal.getName() + " преодолеет только " + animal.getEndurance() / 4.0 + " м");
                animal.setEndurance(0.0);
                System.out.println("Остаток выносливости у " + animal.getName() + " равен " + animal.getEndurance() +
                        ".\nТребуется отдых.\n");
            }
        }
    }
}
