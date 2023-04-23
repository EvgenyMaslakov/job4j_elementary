package ru.job4j.loop;

/**
 * 138. Найти наибольшее двузначное число, делящееся на сумму своих цифр
 * Задание: Написать код, который определяет и выводит в консоль наибольшее
 * двузначное число, делящееся на сумму своих цифр.
 */
public class Task138 {
    public static void loop() {
        int rsl = 100;
        int sum = 0;
        int ost = -1;
        while (ost != 0) {
            rsl--;
            sum = rsl / 10 + rsl % 10;
            ost = (rsl * 100) / sum % 100;
        }
        System.out.println(rsl);
    }
}
