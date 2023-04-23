package ru.job4j.loop;

/**
 * 135. Построить число с обратным порядком цифр
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 *
 * Задание: Написать код, который выводит в консоль число с обратным порядком цифр входящего числа.
 *
 * Например, для числа 3752 вывод должен быть:
 *
 * 2573
 */
public class Task135 {
    public static void loop(int num) {
        int rev = 0;
        int count = 0;
        int x = num;
        while (x > 0) {
            x /= 10;
            count++;
        }
        while (num > 0) {
            rev = rev + num % 10 * (int) Math.pow(10, count - 1);
            num /= 10;
            count--;
        }
        System.out.println(rev);
    }
}
