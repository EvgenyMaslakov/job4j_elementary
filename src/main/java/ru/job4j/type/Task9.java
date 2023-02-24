package ru.job4j.type;

import java.util.Scanner;

/*
Даны два действительных числа a и b. Вычислить их сумму, разность,
произведение и частное.

Результат вычислений выведите на консоль в порядке следование.

- сумма

- разность

- произведение

- часное
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
