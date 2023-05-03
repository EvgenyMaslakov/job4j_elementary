package ru.job4j.array;


import java.util.StringJoiner;

/**
 * 3. Вывести значения, которые встречаются ровно один раз
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: написать код, который выводит в консоль через пробел только те значения,
 * которые встречаются в массиве ровно один раз.
 *
 * Примечание: для сборки результирующей строки с выводом значений через пробел нужно
 * использовать StringJoiner в этой и последующих задачах.
 *
 * Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:
 *
 * 4 1
 */
public class Task78 {
    public static void array(int[] nums) {
        StringJoiner rsl = new StringJoiner(" ");
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
                rsl.add(Integer.toString(nums[i]));
            }
        }
        System.out.println(rsl);
    }
}