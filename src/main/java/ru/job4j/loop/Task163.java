package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 163. Вывести двузначные числа, сумма делителей которых тоже является четным числом
 * Задание: написать код, который выводит в консоль через пробел все числа от 10 до 20 (оба включая),
 * сумма делителей которых тоже является четным числом.
 *
 * Вывод должен получиться такой:
 *
 * 10 11 12 13 14 15 17 19 20
 */
public class Task163 {
    public static void loop() {
        StringJoiner rsl = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 2 == 0) {
                rsl.add(Integer.toString(i));
            }
        }
        System.out.println(rsl);
    }
}

