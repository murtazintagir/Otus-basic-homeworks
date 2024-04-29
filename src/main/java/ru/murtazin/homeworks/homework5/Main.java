package ru.murtazin.homeworks.homework5;

import java.util.Arrays;

/**
 * Домашнее задание 5. (Основы языка. Часть 2) (Основная часть)
 * ● Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в
 * консоль строку указанное количество раз;
 * ● Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
 * элементы, значение которых больше 5, и печатающий полученную сумму в консоль;
 * ● Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
 * массив, метод должен заполнить каждую ячейку массива указанным числом;
 * ● Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
 * массив, увеличивающий каждый элемент массива на указанное число;
 * ● Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
 * консоль информацию о том, сумма элементов какой из половин массива больше;
 * ● Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
 * массив равный сумме входящих;
 * (Дополнительная часть)
 * ● Реализуйте метод, принимающий на вход набор целочисленных массивов,
 * и получающий новый массив равный сумме входящих;
 * ● Реализуйте метод, проверяющий что есть "точка" в массиве, в которой сумма левой и правой части равны;
 * ● Реализуйте метод, проверяющий что все элементы массива идет в порядке убывания или возрастания;
 * ● Реализуйте метод, "переворачивающий" входящий массив;
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Методы основной части домашнего задания\n");
        MethodsPart1.printStringNum("Hello", Math.abs(AdditionalMethods.getRandomNumber()));
        int[] array = AdditionalMethods.getArrayInt();
        System.out.println();
        System.out.println("\nИсходный массив: " + Arrays.toString(array) + "\n");
        MethodsPart1.getSumElArr(array.clone(), AdditionalMethods.getRandomNumber()); // Метод 1
        MethodsPart1.getArrayReplaceEl(AdditionalMethods.getRandomNumber(), array.clone()); // Метод 2
        MethodsPart1.getArrayAddElNum(AdditionalMethods.getRandomNumber(), array.clone()); // Метод 3
        MethodsPart1.getArraySumHalf(array.clone()); // Метод 4
        System.out.println("Методы дополнительной части домашнего задания\n");
        MethodsPart2.getArrSumEl(AdditionalMethods.getArrayInt(), AdditionalMethods.getArrayInt(),
                AdditionalMethods.getArrayInt()); // Метод 1*
        // Массивы для проверки метода 2
        int[] arr1 = {1, 1, 1, 1, 1, 3, 4, -2};
        int[] arr2 = {7, 2, 2, 2, 9, 4};
        MethodsPart2.getIndEqulib(arr1); // Метод 2*
        MethodsPart2.getIndEqulib(arr2);
        MethodsPart2.checkSortArray(AdditionalMethods.getArrayInt()); // Метод 3*
        MethodsPart2.getReverseArray(AdditionalMethods.getArrayInt()); // Метод 4*
    }
}
