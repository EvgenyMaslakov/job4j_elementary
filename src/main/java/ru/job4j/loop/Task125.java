package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 125. Вывести четные и нечетные цифры числа по значению
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 *
 * Задание: Написать код, который выводит в консоль через пробел в первой строке все
 * четные по значению цифры этого числа, а во второй строке - все нечетные по значению
 * цифры этого числа. Если четных или нечетных цифр в числе нет, вывод сделать одной строкой.
 *
 * Например, для числа 548506 вывод должен быть:
 *
 * 4 8 0 6
 *
 * 5 5
 */

public class Task125 {
    public static void loop(int num) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner notEven = new StringJoiner(" ");
        int n = 0;
        int count = 0;
        int x = num;
        while (x > 0) {
            count++;
            x /= 10;
        }
        int coef1 = (int) Math.pow(10, count - 1);
        int coef2 = 10;
        while (count > 0) {
            n = num / coef1 % coef2;
            if (n % 2 == 0) {
                even.add(Integer.toString(n));
            } else {
                notEven.add(Integer.toString(n));
            }
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