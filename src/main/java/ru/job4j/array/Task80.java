package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 4. Вернуть массив с номерами ячеек чисел, встречающихся один раз
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: метод array должен возвращать массив, который содержит номера ячеек входящего
 * массива, в которых записаны значения, встречающиеся в нем только один раз.
 *
 * Например, для массива значений [5, 5, 4, 3, 3, 1] нужно вернуть массив [2, 5].
 *
 * Каркас: ru.job4j.array.Task80
 */

public class Task80 {
    public static int[] array(int[] nums) {
        int langth = 0;
        int[] vr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && count != 2) {
                    count++;
                } else if (nums[i] == nums[j] && count == 2) {
                    break;
                }
            }
            if (count == 1) {
                vr[langth] = i;
                langth++;
            }
        }
        int[] rsl = new int[langth];
        for (int x = 0; x < rsl.length; x++) {
            rsl[x] = vr[x];
        }
        return rsl;
    }
}
