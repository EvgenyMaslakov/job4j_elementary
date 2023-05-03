package ru.job4j.array;

/**
 * 7. Найти суммы отрицательных, положительных чисел и нулей в массиве
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: метод array должен возвращать массив, который содержит информацию о сумме
 * положительных значений во входящем массиве, сумме отрицательных значений, а также количестве нулей (в том же порядке).
 *
 * Например, для массива значений [5, -3, -4, 0, 3, 1] нужно вернуть массив [9, -7, 1].
 */
public class Task82 {
    public static int[] array(int[] nums) {
        int ngtvSum = 0;
        int pstvSum = 0;
        int nll = 0;
        int[] rsl = new int[3];
        for (int num : nums) {
            if (num < 0) {
                ngtvSum += num;
            } else if (num == 0) {
                nll++;
            } else {
                pstvSum += num;
            }
        }
        rsl[0] = pstvSum;
        rsl[1] = ngtvSum;
        rsl[2] = nll;
        return rsl;
    }
}

