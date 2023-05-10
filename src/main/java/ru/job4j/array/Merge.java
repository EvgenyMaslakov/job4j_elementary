package ru.job4j.array;

/**
 * 2. Объединить два отсортированных массива
 *
 *  Даны два отсортированных по возрастанию массива.
 *  Как без сортировки их объединить в третий массив?
 */
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countLeft = 0;
        int countRight = 0;
        int i = 0;
        while (countLeft < left.length && countRight < right.length) {
            if (left[countLeft] <= right[countRight]) {
                rsl[i] = left[countLeft++];
                i++;
            } else {
                rsl[i] = right[countRight++];
                i++;
            }
        }
        while (countLeft < left.length) {
            rsl[i] = left[countLeft++];
            i++;
        }
        while (countRight < right.length) {
            rsl[i] = right[countRight++];
            i++;
        }
        return rsl;
    }
}
