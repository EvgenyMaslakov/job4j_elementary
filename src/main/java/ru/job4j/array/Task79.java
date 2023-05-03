package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 5. Вывести значения, которые встречаются больше одного раза
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: написать код, который выводит в консоль через пробел только те значения,
 * которые встречаются в массиве больше одного раза.
 *
 * Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:
 *
 * 5 3
 */
public class Task79 {
    public static void array(int[] nums) {
        int cnt = 0;
        int f = 0;
        boolean pvtr;
        int[] vr = new int[nums.length];
        StringJoiner rsl = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            pvtr = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && count != 2) {
                    count++;
                } else if (nums[i] == nums[j] && count == 2) {
                    cnt++;
                    break;
                }
            }
            for (int z = 0; z < vr.length; z++) {
                if (vr[z] == nums[i]) {
                    pvtr = true;
                    break;
                }
            }
            if (count == 2 && !pvtr) {
                rsl.add(Integer.toString(nums[i]));
                vr[f++] = nums[i];
            }

        }
        if (rsl.length() > 0) {
            System.out.println(rsl);
        } else {
            System.out.print(rsl);
        }

    }
}
