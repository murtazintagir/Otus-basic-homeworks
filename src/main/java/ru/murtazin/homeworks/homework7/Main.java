package ru.murtazin.homeworks.homework7;

import java.util.Arrays;

/**
 * Домашнее задание 7. (Основы языка. Часть 3)
 * ● Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
 * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
 * ● Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов "*"
 * со сторонами соответствующей длины;
 * ● Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его
 * диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
 * ● Реализовать метод findMax(int[][] array), который должен найти и вернуть максимальный элемент массива;
 * ● Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует,
 * то в качестве результата необходимо вернуть -1
 */
public class Main {
    public static int[][] arrayUneven = AdditionalMethods.getMultiDimUnevenArray();
    public static int[][] arrayEven = AdditionalMethods.getMultiDimEvenArray();

    public static void main(String[] args) {
        System.out.println("\nИсходный массив: " + Arrays.deepToString(arrayUneven) + "\n");
        System.out.println("Сумма элементов массива больше нуля равна " +
                getSumOfPositiveElements(arrayUneven) + "\n"); // Метод 1
        printSquareOfSymbol(Math.abs(AdditionalMethods.getRandomNumber()));  // Метод 2
        ArrayWithZeroDiag(arrayEven); // Метод 3
        System.out.println("Максимальный элемента массива равен " + findMax(arrayUneven) + "\n"); // Метод 4
        System.out.println(sumElArray(arrayUneven));// Метод 5
    }


    /**
     * Метод 1.
     * Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
     */
    public static int getSumOfPositiveElements(int[][] array) {
        System.out.println("Метод 1");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    /**
     * Метод 2.
     * Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов *
     * со сторонами соответствующей длины
     */
    public static void printSquareOfSymbol(int size) {
        System.out.println("Метод 2");
        char symbol = '*';
        int num = 0;
        while (num < size) {
            if (num == 0 || num == size - 1) {
                for (int i = 0; i < size; i++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        System.out.print(symbol + " ");
                    } else if (i == size - 1) {
                        System.out.print(symbol + "\n");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            num++;
        }
        System.out.println();
    }

    /**
     * Метод 3.
     * Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
     * и заменяющий элементы по диагоналям на значение ноль
     */
    private static void ArrayWithZeroDiag(int[][] mas) {
        System.out.println("Метод 3");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j || j == mas[i].length - i - 1) {
                    mas[i][j] = 0;
                }
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод 4.
     * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива
     */
    public static int findMax(int[][] array) {
        System.out.println("Метод 4");
        int result = array[0][0];
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    /**
     * Метод 5.
     * Реализуйте метод, который считает сумму элементов второй строки/столбца двумерного массива,
     * если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
     */
    public static String sumElArray(int[][] array) {
        System.out.println("Метод 5");
        final int EL = 1; // индекс анализируемой строки/столбца
        int sumElSecondStr = 0; // сумма элементов в строке
        int sumElSecondCol = 0; // сумма элементов в столбце
        int numCol = array.length; // количество столбцов в массиве
        String sSumElSecondStr; // текст для суммы элементов в строке
        String sSumElSecondCol; // текст для суммы элементов в столбце
        System.out.println("Анализируемый массив " + Arrays.deepToString(array));
        if (array.length < EL + 1 || array[EL].length == 0) { // второй элемент массива отсутствует/пустой
            sSumElSecondStr = "Второй строки массива не существует\n";
        } else {
            for (int i = 0; i < array[EL].length; i++) {
                sumElSecondStr += array[EL][i];
            }
            sSumElSecondStr = "Сумма элементов второй строки массива равна " + sumElSecondStr + "\n";
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length < EL + 1) { // Если второй столбец отсутствует в массиве, уменьшаем переменную.
                // Если достигли значения ноль, значит второй столбец отсутствует
                numCol--;
            } else {
                sumElSecondCol += array[i][EL];
            }
        }
        if (numCol == 0) {
            sSumElSecondCol = "Второго столбца массива не существует\n";
        } else {
            sSumElSecondCol = "Сумма элементов второго столбца массива равна " + sumElSecondCol + "\n";
        }

        return sSumElSecondStr + sSumElSecondCol;
    }
}
