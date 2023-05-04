package ru.job4j.array;

/**
 * 8. Переставить две строки в матрице
 * Вам нужно переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк
 */
public class SwapRows {
    public static int[][] swap(int[][] data, int src, int dst) {
        int n = data.length;
        int m = data[0].length;
        for (int i = 0; i < m; i++) {
            int temp = data[dst][i];
            data[dst][i] = data[src][i];
            data[src][i] = temp;
        }
        return data;
    }
}
