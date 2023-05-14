package ru.job4j.array;

import java.util.Arrays;

/**
 * 18. Симметрическая разность множеств
 * Симметрическая разность - это такая операция, когда в результирующее множество
 * попадают все элементы из обоих множеств, кроме тех, которые есть и в том и в
 * другом множествах.
 *
 * Ваша задача реализовать эту операцию. Множества заданы в виде массивов.
 *
 * Например,
 *
 * {1}, {2} => {1, 2}
 *
 * {1, 2}, {2, 3} => {1, 3}
 *
 * {1}, {} => {1}
 */
public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
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
        for (int r = 0; r < right.length; r++) {
            boolean uniq = true;
            for (int l = 0; l < left.length; l++) {
                if (left[l] == right[r]) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) {
                rsl[count] = right[r];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}

