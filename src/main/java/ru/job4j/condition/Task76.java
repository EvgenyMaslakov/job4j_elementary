package ru.job4j.condition;

/**
 * 75. Количество одинаковых цифр в трехзначном числе
 * Ниже представлен метод sameNumAmount(int num), который принимает целое положительное трехзначное число.
 *
 * Задание: Написать код, который определяет и выводит в консоль количество одинаковых цифр в этом числе.
 *
 * Например, для числа 331 вывод будет:
 *
 * 2
 */
public class Task76 {
    public static void sameNumAmount(int num) {
        int rsl = -1;
        int num1 = num / 100;
        int num2 = num % 100 / 10;
        int num3 = num % 10;
        if (num1 != num2 && num1 != num3) {
            rsl = 0;
        }
        if (num1 == num2 && num1 == num3) {
            rsl = 3;
        }
        if (num1 == num2 && num1 != num3 || num1 == num3 && num1 != num2 || num2 == num3 && num1 != num2) {
            rsl = 2;
        }
        System.out.println(rsl);
    }
}
