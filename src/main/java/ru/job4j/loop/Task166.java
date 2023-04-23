package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 166. Вывести трехзначные числа согласно условию
 * Задание: написать код, который выводит в консоль через пробел все положительные
 * трехзначные числа до 300 (включая), для которых соблюдаются 2 условия: само число
 * заканчивается на 0 и сумма нечетных делителей этого числа тоже заканчивается на 0.
 *
 * Вывод должен получиться такой:
 *
 * 190 270 290
 */
public class Task166 {
    public static void loop() {
        StringJoiner rsl = new StringJoiner(" ");
        for (int i = 100; i <= 300; i += 10) {
            int sum = 0;
            for (int j = 1; j <= i; j += 2) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 10 == 0) {
                rsl.add(Integer.toString(i));
            }
        }
        System.out.println(rsl);
    }
}
