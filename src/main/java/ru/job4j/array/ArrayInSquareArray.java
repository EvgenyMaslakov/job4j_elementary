package ru.job4j.array;

/**
 * 10. Превратить одномерный массив в двумерный.
 *
 * Метод принимает массив целочисленных значений.
 * Необходимо реализовать метод, который превратит одномерный массив в квадратный двумерный.
 * Напомню, что квадратный двумерный массив - это массив, в котором число рядов и элементов
 * в каждом ряду одинаково.
 * При этом если элементов в исходном массиве не хватает, чтобы заполнить весь двумерный
 * массив - необходимо заполнить его 0.
 */
public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int l = Math.sqrt(array.length) % 1 == 0
                ? (int) Math.sqrt(array.length) : (int) (Math.sqrt(array.length) + 1);
        int[][] rsl = new int[l][l];
        int count = 0;
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl[i].length; j++) {
                rsl[i][j] = count < array.length ? array[count] : 0;
                count++;
            }
        }
        return rsl;
    }
}
