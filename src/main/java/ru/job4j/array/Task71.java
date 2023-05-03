package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 9. Вывести значения из четных и нечетных ячеек массива в разных строках
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким образом:
 * в первой строке - значения из четных ячеек массива, а во второй строке - из нечетных.
 *
 * Примечание: для сборки результирующих строк с выводом значений через пробел нужно использовать StringJoiner.
 *
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 *
 * 5 6 3
 *
 * 2 0
 */

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner rsl1 = new StringJoiner(" ");
        StringJoiner rsl2 = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                rsl1.add(Integer.toString(arr[i]));
            } else {
                rsl2.add(Integer.toString(arr[i]));
            }
        }
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}
