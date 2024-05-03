package ru.murtazin.homeworks.homework7;

import java.util.Random;

public class AdditionalMethods {

    public static Random randomInt = new Random();

    // Метод для генерации двухмерного неровного массива
    public static int[][] getMultiDimUnevenArray() {
        int max = 10; // максимальный размер элемента и длины массива
        int minEl = -10; // минимальный размер элемента массива
        int minLength = 1; // минимальная длина массива
        int[][] array = new int[randomInt.nextInt(max - minLength) + minLength][randomInt.nextInt(max - minLength) + minLength];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomInt.nextInt(max - minEl) + minEl;
            }
        }
        return array;
    }

    // Метод для генерации двухмерного квадратного массива
    public static int[][] getMultiDimEvenArray() {
        int max = 5; // максимальный размер элемента и длины массива
        int minEl = -10; // минимальный размер элемента массива
        int minLength = 1; // минимальная длина массива
        int dim = (randomInt.nextInt(max - minLength) + minLength); // генерируем размер массива
        int[][] array = new int[dim][dim];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomInt.nextInt(max - minEl) + minEl;
            }
        }
        return array;
    }

    // Метод для генерации случайного числа типа int
    public static int getRandomNumber() {
        // Генерируем число в диапазоне 1 - 10
        int max = 10;
        int min = -10;
        return randomInt.nextInt(max - min) + min;
    }
}
