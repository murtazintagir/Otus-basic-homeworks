package ru.murtazin.homeworks.homework5;

import java.util.Arrays;

/**
 * Метод 1. Реализуйте метод, принимающий в качестве аргументов целое число и строку,
 * и печатающий в консоль строку указанное количество раз
 */
public class MethodsPart1 {

    public static void printStringNum(String word, int num) {
        System.out.println("Метод 1.");
        String[] arrrayWord = new String[num];
        for (int i = 0; i < arrrayWord.length; i++) {
            arrrayWord[i] = word;
            System.out.print(arrrayWord[i] + " ");
        }
    }

    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
     * суммирующий все элементы, значение которых больше 5,
     * и печатающий полученную сумму в консоль.
     */
    public static void getSumElArr(int[] array, int num) {

        System.out.println("Метод 2.");
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i : array) {
            if (i > num) {
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.printf("Отсутствуют элементы больше %d \n", num);
        } else {
            System.out.printf("Сумма элементов больше %d равна %d \n", num, sum);
            System.out.println();
        }
    }

    /**
     * Метод 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
     * метод должен заполниться каждую ячейку массива указанным числом.
     */
    public static void getArrayReplaceEl(int num, int[] array) {
        System.out.println("Метод 3.");
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
        }
        System.out.printf("Элементы массива заменены на число %d \n", num);
        System.out.println(Arrays.toString(array) + "\n");
    }

    /**
     * Метод 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
     * увеличивающий каждый элемент которого на указанное число.
     */
    public static void getArrayAddElNum(int num, int[] array) {
        System.out.println("Метод 4.");
        for (int i = 0; i < array.length; i++) {
            array[i] += num;
        }
        System.out.printf("К элементам массива прибавлено число %d \n", num);
        System.out.println(Arrays.toString(array) + "\n");
    }

    /**
     * Метод 4. Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
     * и печатающий в консоль сумма элементов какой из половин массива больше.
     */
    public static void getArraySumHalf(int[] array) {
        System.out.println("Метод 5.");
        int sumLeft = 0, sumRight = 0;
        System.out.println(Arrays.toString(array));
        if (array.length % 2 == 1) {
            System.out.println("Количество элементов массива нечетно. " +
                    "Для проверки требуется четное количество элементов\n");
        } else {
            // Считаем сумму элементов левой части массива
            for (int i = 0; i < array.length / 2; i++) {
                sumLeft += array[i];
            }
            // Считаем сумму элементов правой части массива
            for (int i = array.length / 2; i < array.length; i++) {
                sumRight += array[i];
            }
            System.out.println("Сумма элементов левой половины массива равна " + sumLeft + "\n" +
                    "Сумма элементов правой половины массива равна " + sumRight);
            if (sumLeft > sumRight) {
                System.out.println("Сумма элементов левой части больше\n");
            } else if (sumRight > sumLeft) {
                System.out.println("Сумма элементов правой части больше\n");
            } else {
                System.out.println("Сумма элементов левой и правой половины идентичны\n");
            }
        }
    }
}
