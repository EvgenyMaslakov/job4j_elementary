package ru.job4j.array;

/**
 * 24. Числа Фибоначчи.
 * Числа Фибоначчи - это последовательность чисел, в котором каждое число начиная
 * с третьего равно сумме двух предыдущих.
 * Например:
 *
 * 1, 3, 4, 7, 11, 18, 29, 47, 76....
 *
 * Вам необходимо реализовать метод, который проверит является ли последовательность
 * целочисленных значений, которая находится во входящем массиве, последовательностью
 * чисел Фибоначчи. Метод должен вернуть true, если последовательность чисел - числа Фибоначчи.
 */
public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 3; i < data.length; i++) {
            int prev1 = data[i - 2];
            int prev2 = data[i - 1];
            int next = data[i];
            if (prev1 + prev2 != next) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
