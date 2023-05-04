package ru.job4j.array;

/**
 * 6. Переставить два столбца в матрице
 * Ваша задача переставить два столбца в квадратной матрице. src, dest это индексы столбцов
 */

public class SwapCols {
    public static int[][] swap(int[][] data, int src, int dst) {
        int n = data.length;
        int m = data[0].length;
        for (int i = 0; i < m; i++) {
            int temp = data[i][dst];
            data[i][dst] = data[i][src];
            data[i][src] = temp;
        }
        return data;
    }
}

