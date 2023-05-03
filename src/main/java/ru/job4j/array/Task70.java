package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 8. Вывести значения массива в 2 строках
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким
 * образом: в первой строке - первую половину массива, во второй строке - вторую половину массива.
 * Если массив имеет нечетный размер, то центральную ячейку нужно вывести в первой строке.
 *
 * Примечание: для сборки результирующих строк с выводом значений через пробел нужно использовать StringJoiner.
 *
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 *
 * 5 2 6
 *
 * 0 3
 */
public class Task70 {
    public static void array(int[] arr) {
        StringJoiner rsl1 = new StringJoiner(" ");
        StringJoiner rsl2 = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i < arr.length / 2 + 1
                    || arr.length % 2 == 0 && i < arr.length / 2) {
                rsl1.add(Integer.toString(arr[i]));
            } else {
                rsl2.add(Integer.toString(arr[i]));
            }
        }
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}
