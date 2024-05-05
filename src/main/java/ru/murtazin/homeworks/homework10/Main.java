package ru.murtazin.homeworks.homework10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Домашнее задание 10. (ООП. Часть 1)
 * ● Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
 * Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
 * В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
 * ФИО: фамилия имя отчество
 * Год рождения: год рождения
 * e-mail: email
 * В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла
 * выведите информацию только о пользователях старше 40 лет.
 * ● Реализуйте класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
 * Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
 * У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет
 * (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
 * только при условии, что коробка открыта (предметом читаем просто строку).
 * Выполнение методов должно сопровождаться выводом сообщений в консоль.
 */
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public final static int YEAR = 40;

    public static String program;

    public static String obj;

    public static String[] colors = {
            "белый",
            "синий",
            "красный",
            "оранжевый",
            "черный",
            "серый",
            "коричневый",
            "фиолетовый",
            "розовый"
    };

    public static String repaint(String color) {
        boolean result = true;
        String newColor;
        System.out.println("Текущий цвет коробки " + color);
        do {
            System.out.println("Введите цвет");
            newColor = scan.next();
            if (color.equals(newColor)) {
                System.out.println("Коробка уже имеет данный цвет");

            } else {
                for (String s : colors) {
                    if (newColor.equals(s)) {
                        System.out.println("Цвет доступен");
                        result = false;
                    }
                }
                if (result) {
                    System.out.println("Неизвестный цвет");
                }
            }
        } while (result);
        return newColor;
    }

    public static void main(String[] args) {
        do {
            System.out.println("Добро пожаловать!\nСписок доступных команд:\n" +
                    "user - программа \"Пользователь\"\n" +
                    "box - программа \"Коробка\"\n" +
                    "quit - выход\n");
            System.out.println("Введите команду:");
            program = scan.next();
            switch (program) {
                case "user":
                    usersInfo();
                    break;
                case "box":
                    boxes();
                    break;
                case "quit":
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        } while (!program.equals("quit"));
    }

    public static void usersInfo() {
        // Описание пользователей
        User[] users = {
                new User("Кейдж", "Николас", "",
                        LocalDate.of(1964, 1, 7), "face_off@gmail.com"),
                new User("Данст", "Кирстен", "Кэролайн",
                        LocalDate.of(1982, 4, 30), "spidy_best@gmail.com"),
                new User("Крэнстон", "Брайан", "",
                        LocalDate.of(1956, 3, 7), "breaking_bad@gmail.com"),
                new User("Джеймс", "Кевин", "",
                        LocalDate.of(1965, 4, 26), "hitch_can_help_you@gmain.com"),
                new User("Круз", "Том", "Мапотер IV",
                        LocalDate.of(1962, 7, 3), "mission_impossible@gmail.com"),
                new User("Бобби", "Милли", "Браун",
                        LocalDate.of(2004, 2, 19), "strange_girl@gmail.com"),
                new User("Кавилл", "Генри", "Уильям Далглиш",
                        LocalDate.of(1983, 5, 5), "man_of_steel@gmai.com"),
                new User("Йовович", "Милла", "",
                        LocalDate.of(1975, 12, 17), "fifth_elem@gmail.com"),
                new User("Лоуренс", "Дженифер", "",
                        LocalDate.of(1990, 8, 15), "mockingjay@gmail.com"),
                new User("Робби", "Марго", "Элис",
                        LocalDate.of(1990, 7, 2), "harley_quinn@gmail.com"),
        };
        ageSelection(users);
    }

    private static void ageSelection(User[] users) {
        System.out.println("Список актеров старше " + YEAR);
        for (User user : users) {
            if (LocalDate.now().getYear() - user.getBirthDay().getYear() >= YEAR) {
                System.out.println(user.getInfo());
                System.out.println();
            }
        }
    }

    public static void boxes() {
        // Описание ящиков
        Box box1 = new Box(colors[0], 1.0, 1.0, 1.0, false);
        System.out.println("Доступна коробка\n");
        box1.getInfo();
        System.out.println("Вы можете положить предмет в коробку, если она пустая и крышка открыта.\n" +
                "Если в коробке уже хранится предмет, то вы можете заменить ее на новый.\n" +
                "Список доступных команд:\n" +
                "info - информация о коробке\n" +
                "repaint - изменить цвет\n" +
                "open - открыть крышку\n" +
                "close - закрыть крышку\n" +
                "put - положить предмет\n" +
                "delete - удалить предмет\n" +
                "replace - заменить предмет\n");
        do {
            System.out.println("Введите команду:");
            program = scan.next();
            switch (program) {
                case "info":
                    box1.getInfo();
                    break;
                case "repaint":
                    System.out.println("Список доступных цветов\n");
                    System.out.println(Arrays.toString(colors));
                    box1.repaint(repaint(box1.getColor()));
                    break;
                case "open":
                    box1.setCoverPosition(true);
                    System.out.println(box1.coverPosition());
                    break;
                case "close":
                    box1.setCoverPosition(false);
                    System.out.println(box1.coverPosition());
                    break;
                case "put":
                    System.out.println("Введите предмет");
                    obj = scan.next();
                    box1.putContent(obj);
                    break;
                case "delete":
                    box1.deleteContent();
                    break;
                case "replace":
                    System.out.println("Введите предмет");
                    obj = scan.next();
                    box1.replaceContent(obj);
                    break;
                case "quit":
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        } while (!program.equals("quit"));
    }
}
