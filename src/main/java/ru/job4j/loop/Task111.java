package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 111. Выводить числа, пока сумма этих чисел не превысит заданное число
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 *
 * Задание: Написать код, который выводит в консоль через пробел последующие за этим числом числа,
 * пока сумма этих чисел не превышает квадрата введенного числа.
 *
 * Примечание: для сборки результирующей строки с выводом значений через пробел нужно использовать
 * StringJoiner.
 *
 * Например, для входящего числа 5 вывод должен быть:
 *
 * 6 7 8
 */
public class Task111 {

    public static void loop(int num) {
        StringJoiner rsl = new StringJoiner(" ");
        int sum = 0;
        int n = num + 1;
        while (sum + n < num * num) {
            rsl.add(Integer.toString(n));
            n++;
            sum += n;
        }
   /*     if (rsl.toString().equals("")) {
            System.out.print(rsl);
        } else {
            System.out.println(rsl);
        }*/

        if (rsl.length() == 0) {
            System.out.print(rsl);
        } else {
            System.out.println(rsl);
        }
    }
}
