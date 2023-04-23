package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 126. Вывести четные и нечетные цифры числа по месту
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 *
 * Задание: Написать код, который выводит в консоль через пробел в первой строке все
 * четные по месту (то есть находящиеся на четной позиции) цифры этого числа, а во
 * второй строке - все нечетные по месту цифры этого числа.
 *
 * Например, для числа 261705 вывод должен быть:
 *
 * 6 7 5
 *
 * 2 1 0
 */
public class Task126 {
    public static void loop(int num) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner notEven = new StringJoiner(" ");
        /**
         * n - цифра в числе
         */
        int n = 0;
        /**
         * count - количество цифр в числе
         *
         */
        int count = 0;
        int x = num;
        while (x > 0) {
            count++;
            x /= 10;
        }
        int coef1 = (int) Math.pow(10, count - 1);
        int coef2 = 10;
        int i = 0;
        while (count > 0) {
            n = num / coef1 % coef2;
            if (i % 2 == 1) {
                even.add(Integer.toString(n));
            } else {
                notEven.add(Integer.toString(n));
            }
            i++;
            num %= coef1;
            count--;
            coef1 /= 10;
            coef2 *= 10;
        }
        if (even.length() != 0) {
            System.out.println(even);
        }
        if (notEven.length() != 0) {
            System.out.println(notEven);
        }
    }
}
