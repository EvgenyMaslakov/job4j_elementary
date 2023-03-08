package ru.job4j.condition;

import java.util.StringJoiner;

/**
 * 78. На какие числа из составляющих входящее число цифр оно делится без остатка
 *
 * Ниже представлен метод divWithoutRemainder(int num), который принимает целое положительное трехзначное число.
 *
 * Задание: Написать код, который определяет и выводит в консоль, на какие числа из составляющих входящее число
 * цифр оно делится без остатка. Если таких чисел несколько, то вывести полученные значения через пробел.
 * Если таких чисел нет - вывести "Таких чисел нет".
 *
 * Примечание: Учесть возможность того, что одной из цифр входящего числа может быть ноль.
 *
 * Например, для числа 456 вывод будет:
 *
 * 4 6
 */
public class Task78 {
    public static void divWithoutRemainder(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int num1 = num / 100;
        int num2 = num % 100 / 10;
        int num3 = num % 10;
        if (num1 != 0 && num % num1 != 0
                && num2 != 0 && num % num2 != 0
                && num3 != 0 && num % num3 != 0) {
            System.out.println("Таких чисел нет");
            return;
        }
        if (num1 != 0 && num % num1 == 0) {
            joiner.add(Integer.toString(num1));
        }
        if (num2 != 0 && num % num2 == 0) {
            joiner.add(Integer.toString(num2));
        }
        if (num3 != 0 && num % num3 == 0) {
            joiner.add(Integer.toString(num3));
        }
        String joined = joiner.toString();
        System.out.println(joined);
    }
}
