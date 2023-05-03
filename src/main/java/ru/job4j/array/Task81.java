package ru.job4j.array;

/**
 * 6. Найти количество отрицательных, положительных чисел и нулей в массиве
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: метод array должен возвращать массив, который содержит информацию о количестве
 * отрицательных чисел, нулей и положительных чисел (в этом же порядке).
 *
 * Например, для массива значений [5, -5, -4, 0, 3, 1] нужно вернуть массив [2, 1, 3].
 */

public class Task81 {
    public static int[] array(int[] nums) {
        int ngtv = 0;
        int pstv = 0;
        int nll = 0;
        int[] rsl = new int[3];
        for (int num : nums) {
            if (num < 0) {
                ngtv++;
            } else if (num == 0) {
                nll++;
            } else {
                pstv++;
            }
        }
        rsl[0] = ngtv;
        rsl[1] = nll;
        rsl[2] = pstv;
        return rsl;
    }
}
