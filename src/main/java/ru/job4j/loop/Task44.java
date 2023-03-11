package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 44. Вывести трехзначные числа при некоторых условиях
 *
 * Для целого положительного трехзначного числа определим следующие условия:
 *
 * - Корень 2й степени из произведения данного числа на число, составленное из
 * тех же цифр в обратном порядке - должен являться целым числом. (Например,
 * квадратный корень из 144 * 441 = 252)
 *
 * - Данное число не равно числу, составленному из тех же цифр в обратном порядке.
 *
 * - Данное число не содержит 2 рядом стоящих нулей.
 *
 * Например, числом, соответствующим этим условиям, является число 144.
 *
 * Задание: Написать код, который выводит в консоль через пробел все целые
 * трехзначные числа, которые удовлетворяют условиям выше.
 *
 * Вывод должен выглядеть так:
 *
 * 144 169 288 441 528 768 825 867 882 961
 *
 * Примечания:
 *
 * - Для вычисления квадратного корня можно использовать Math.sqrt().
 *
 * - При проверке получившегося корня можно привести его к виду 1.0 * Math.round(с),
 * где с - значение квадратного корня.
 */
public class Task44 {
    public static void loop() {
        StringJoiner rsl = new StringJoiner(" ");
        for (int i = 100; i <= 999; i++) {
            int i1 = i / 100;
            int i2 = i % 100 / 10;
            int i3 = i % 10;
            int obr = i3 * 100 + i2 * 10 + i1;
            double sq = Math.sqrt(i * obr);
            if (i != obr && i / 10 != 0 && i % 100 != 0 && sq == Math.round(sq)) {
                rsl.add(Integer.toString(i));
            }
        }
        System.out.println(rsl);
    }
}
