package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 132. Выводить числа, пока количество четных чисел на нечетных местах остается меньше 3
 * Ниже представлен метод loop(int[] nums), который принимает массив целых чисел.
 *
 * Задание: Написать код, который выводит числа в консоль через пробел, пока количество четных
 * чисел на нечетных местах в выведенной серии остается меньше 3 (третье четное число на нечетном
 * месте не выводится).
 *
 * Например, для входящих значений [2, 1, 3, 4, 6, 8, 0] вывод должен быть:
 *
 * 2 1 3 4 6 8
 */
public class Task132 {
    public static void loop(int[] nums) {
        StringJoiner rsl = new StringJoiner(" ");
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 == 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            rsl.add(Integer.toString(nums[i]));
        }
        System.out.println(rsl);
    }
}
