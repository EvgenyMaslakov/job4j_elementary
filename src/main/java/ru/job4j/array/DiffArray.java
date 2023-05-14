package ru.job4j.array;

import java.util.Arrays;

/**
 * 14. Разность множеств
 *
 * Разность множеств это операция при которой в результирующее множество попадают элементы
 * из первого множества, но только если их нет во втором множестве.
 *
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов
 *
 * Например,
 *
 * {1}, {2} => {1}
 *
 * {1}, {1} => {}
 *
 * {1, 2}, {2} => {1}
 *
 * {1}, {} => {1}
 */
public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int count = 0;
        for (int l = 0; l < left.length; l++) {
            boolean uniq = true;
            for (int r = 0; r < right.length; r++) {
                if (left[l] == right[r]) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) {
                rsl[count] = left[l];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
