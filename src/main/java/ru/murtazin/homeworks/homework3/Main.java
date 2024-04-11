package ru.murtazin.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

/**
 * Домашнее задание 3. (Основы языка. Часть 1)
 * ● Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
 * ● Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
 * Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
 * в противном случае - “Сумма отрицательная”;
 * ● Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
 * Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20
 * включительно, то “Желтый”, если больше 20 - “Зеленый”;
 * ● Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными
 * значениями. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 * ● Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment). Если increment = true,
 * то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть;
 * Каждый метод последовательно вызовите из метода main();
 * ● При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод,
 * соответствующий указанному номеру со случайным значением аргументов;
 */
public class Main {

    public static Random randomInt = new Random();
    public static Random randomBool = new Random();

    public static void main(String[] args) {

        System.out.println("Курс Java DeveloperBasic. Домашнее задание №3\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 для вызова соответствующего метода. " +
                "Для вызова всех методов введите 0");
        int result = scan.nextInt(); // Результат ввода пользователя
        System.out.println();
        switch (result) {
            case 0:
                greetings();
                checkSign(getRandomNumber(), getRandomNumber(), getRandomNumber());
                selectColor(getRandomNumber());
                compareNumbers(getRandomNumber(), getRandomNumber());
                addOrSubtractAndPrint(getRandomNumber(), getRandomNumber(), getRandomBool());
                break;
            case 1:
                greetings();
                break;
            case 2:
                checkSign(getRandomNumber(), getRandomNumber(), getRandomNumber());
                break;
            case 3:
                selectColor(getRandomNumber());
                break;
            case 4:
                compareNumbers(getRandomNumber(), getRandomNumber());
                break;
            case 5:
                addOrSubtractAndPrint(getRandomNumber(), getRandomNumber(), getRandomBool());
                break;
            default:
                System.out.println("Неизвестный символ");
                break;
        }
    }

    /*
    Метод 1.
    Печатает в консоль в столбец 4 слова: Hello, World, from, Java
     */
    public static void greetings() {
        System.out.println("Метод 1");
        System.out.println("Hello\nWorld\nfrom\nJava\n");
    }

    /*
    Метод 2.
    Метод вычисляет сумму трех чисел, и если она больше или равна 0,
    то выводит в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”
     */
    public static void checkSign(int a, int b, int c) {
        System.out.println("Метод 2");
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        System.out.println((a + b + c) >= 0 ? "Сумму положительная\n" : "Сумма отрицательная\n");
    }

    /*
    Метод 3.
    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    если от 10 до 20 включительно, то “Желтый”,
    если больше 20 - “Зеленый”
     */
    public static void selectColor(int data) {
        System.out.println("Метод 3");
        System.out.println("data = " + data);
        if (data <= 10) {
            System.out.println("Красный\n");
        } else if (data <= 20) {
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }
    }

    /*
    Метод 4.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”
     */
    public static void compareNumbers(int a, int b) {
        System.out.println("Метод 4");
        System.out.println("a = " + a + ",\nb = " + b);
        System.out.println(a >= b ? "a >= b\n" : "a < b\n");
    }

    /*
    Метод 5.
    Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    в противном случае - вычесть
     */
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("Метод 5");
        System.out.println("initValue = " + initValue + ",\ndelta = " + delta + ",\nincrement = " + increment);
        if (increment) {
            initValue += delta;
        } else {
            initValue -= delta;
        }
        System.out.println("Результат равен = " + initValue);
    }

    // Генератор псевдослучайных чисел для типа int
    public static int getRandomNumber() {
        // Генерируем число в диапазоне -100 - 100
        int max = 100;
        int min = -100;
        return randomInt.nextInt(max - min) + min;
    }

    // Генератор псевдослучайных чисел для типа boolean
    public static boolean getRandomBool() {
        return randomBool.nextBoolean();
    }
}
