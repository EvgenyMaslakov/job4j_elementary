package ru.job4j.array;

/**
 * 7. Объединить строки квадратного массива
 * Дана квадратная матрица. Ваша задача объединить ее строки в один массив
 *
 * Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}
 */
public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] rsl = new int[data.length * data[0].length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[count] = data[i][j];
                count++;
            }
        }
        return rsl;
    }
}
