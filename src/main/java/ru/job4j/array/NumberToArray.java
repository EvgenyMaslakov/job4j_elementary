package ru.job4j.array;

import java.util.Arrays;
/**
 * 13. Массив цифр
 *
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 *
 * Например
 *
 * 12345 => {5, 4, 3, 2, 1}
 */
public class NumberToArray {
    public static int[] resolve(int number) {
        int num = number;
        int length = 0;
        while (num > 0) {
            length++;
            num /= 10;
        }
        num = number;
        int[] rsl = new int[length];
        int i = 0;
        while (num > 0) {
            rsl[i] = num % 10;
            i++;
            num /= 10;
        }
        return rsl;
    }
}
