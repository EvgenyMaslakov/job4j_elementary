package ru.job4j.array;

import java.util.Arrays;

/**
 * 17. Аномалии
 *
 * Назовем аномалиями диапазоны индексов, на которых значения массива
 * меньше или равно down или больше или равно up.
 *
 * Ваша задача найти все аномалии в массиве.
 *
 * Если в аномалии одно, число то нужно вернуть диапазон [i, i]
 * - где i индекс числа выходящего за границы.
 *
 * Например,
 *
 * {5, 10, 15}, up = 16, down = 4 => аномалий нет
 *
 * {5, 4, 15}, up = 16, down = 4 => {{1, 1}}
 *
 * {5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
 *
 * {5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}
 */
public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        boolean anomaly = false;
        for (int i = 0; i < data.length; i++) {
            boolean predAnomaly = i > 0 ? data[i - 1] >= up || data[i - 1] <= down : false;
            boolean currAnomaly = data[i] >= up || data[i] <= down;
            boolean nextAnomaly = i < data.length - 1 ? data[i + 1] >= up || data[i + 1] <= down : false;
            if (currAnomaly && !predAnomaly) {
                result[count][0] = i;
                anomaly = true;
            }
            if (currAnomaly && !nextAnomaly) {
                result[count][1] = i;
                count++;
            }
        }
        return anomaly ? Arrays.copyOf(result, count) : new int[][] {};
    }
}
