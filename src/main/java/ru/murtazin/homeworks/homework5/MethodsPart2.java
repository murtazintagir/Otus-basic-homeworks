package ru.murtazin.homeworks.homework5;

import java.util.Arrays;

public class MethodsPart2 {
    /**
     * Метод 1*.
     * Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
     * массив равный сумме входящих;
     */
    public static void getArrSumEl(int[]... num) {
        System.out.println("Метод 1*");
        int maxLength = 0;
        // Определяем количество элементов на входе
        for (int[] ints : num) {
            if (ints.length > maxLength) {
                maxLength = ints.length;
            }
        }
        System.out.println("Максимальный размер массива " + maxLength);
        int[] result = new int[maxLength]; // Результирующий массив
        System.out.println("Массивы на входе " + Arrays.deepToString(num) + "\n");
        // Формируем результирующий массив из суммы элементов входных массивов
        for (int[] ints : num) {
            for (int j = 0; j < ints.length; j++) {
                result[j] += ints[j];
            }
        }
        System.out.println("Результирующий массив " + Arrays.toString(result) + "\n");
    }

    /**
     * Метод 2*.
     * Реализуйте метод, проверяющий, что есть “точка” в массиве, в которой сумма левой и правой части
     * равны. “Точка находится между элементами”
     */
    public static void getIndEqulib(int[] arr) {
        System.out.println("Метод 2*");
        int equilibindex = -1;
        int sumAll = 0;
        System.out.println(Arrays.toString(arr));
        // Получаем сумму элементов массива
        for (int i = 0; i < arr.length; i++) {
            sumAll += arr[i];
        }

        int sumLeft = 0; // сумма левой части массива
        int sumRight; // сумма правой части массива

        for (int i = 0; i < arr.length; i++) {
            sumRight = sumAll - (sumLeft + arr[i]); // получаем сумму правой части
            sumLeft += arr[i]; // получаем сумму левой части
            if (sumLeft == sumRight) {
                equilibindex = i;
            }
        }
        if (equilibindex < 0) {
            System.out.println("Индекс равновесия не найден\n");
        } else {
            System.out.println("Индекс равновесия " + equilibindex + "\n");
        }
    }

    /**
     * Метод 3*.
     * Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания или
     * возрастания (по выбору пользователя)
     */
    public static void checkSortArray(int[] array) {
        System.out.println("Метод 3*");
        int srt = 0; // -1 - массив недостаточного размера, 0 - значение по умолчанию,
        boolean direct = true; // true - прямая сортировка, false - обратная сортировка
        // 1 - массив отсортирован, 2 - массив не отсортирован
        System.out.println("Проверяемый массив " + Arrays.toString(array));
        if (array.length < 2) {
            srt = -1;
        } else {
            if (array[0] < array[1]) { // если первый элемент меньше следующего, проверяем массив на прямую сортировку
                System.out.println("Проверяем массив на прямую сортировку");
            } else { // если первый элемент больше следующего, проверяем массив на обратную сортировку
                System.out.println("Проверяем массив на обратную сортировку");
                direct = false;
            }
        }
        srt = AdditionalMethods.getSrt(array, srt, direct);
        switch (srt) {
            case -1:
                System.out.println("Количество элементов массива недостаточно для проверки\n");
                break;
            case 1:
                System.out.println("Массив отсортирован\n");
                break;
            case 2:
                System.out.println("Массив не отсортирован\n");
                break;
            default:
                System.out.println("Неизвестная ошибка");
                break;
        }
    }

    /**
     * Метод 4*.
     * Реализуйте метод, “переворачивающий” входящий массив
     */
    public static void getReverseArray(int[] arr) {
        System.out.println("Метод 4*");
        System.out.println("Исходный массив " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int util = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = util;
        }
        System.out.println("Инвертированный массив " + Arrays.toString(arr));
    }
}
