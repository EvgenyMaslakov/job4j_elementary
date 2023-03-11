package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 52. Вывести ряд чисел в соответствии с условием
 *
 * Ниже представлен метод loop(int n, int m), который принимает
 * 2 целых положительных числа - n и m.
 *
 * Задание: Написать код, который проверяет, действительно ли n меньше m.
 * Если да, то выводит в консоль через пробел n последовательных чисел, начиная
 * с m, а если нет, то вывести m последовательных чисел, начиная с n.
 *
 * Например, для чисел 5 и 3 вывод будет:
 *
 * 5 6 7
 */
public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner rsl = new StringJoiner(" ");
        if (n <= m) {
            for (int i = m; i < n + m; i++) {
                rsl.add(Integer.toString(i));
            }
        } else {
            for (int i = n; i < n + m; i++) {
                rsl.add(Integer.toString(i));
            }
        }
            System.out.println(rsl);
    }
}
