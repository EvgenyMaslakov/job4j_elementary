package ru.job4j.array;

import java.util.StringJoiner;
/**
 * 11. Вывести симметричные ячейки массива
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 *
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким образом:
 * в каждой строке выводятся значения из двух ячеек, симметрично расположенных по отношению к середине массива.
 * Если массив имеет нечетный размер, то центральную ячейку нужно вывести в отдельной строке.
 *
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 *
 * 5 3
 *
 * 2 0
 *
 * 6
 */
public class Task73 {
    public static void array(int[] arr) {
        int start = 0;
        int finish = arr.length - 1;
        /**
         * length - длина промежуточного массива
         */
        int length = arr.length % 2 == 1 ? arr.length / 2 + 1 : arr.length / 2;
        StringJoiner[] rsl = new StringJoiner[length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = new StringJoiner(" ");
        }
        for (int i = 0; i < length; i++) {
            rsl[i].add(Integer.toString(arr[i]));
        }
        int count = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            rsl[i].add(Integer.toString(arr[count]));
            count--;
        }
        for (StringJoiner r : rsl) {
            System.out.println(r);
        }
    }
}