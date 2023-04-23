package ru.job4j.loop;

/**
 * 145. Последовательно изменить число согласно условию
 * Ниже представлен метод loop(int num1, double num2), который принимает целое положительное
 * число num1 и вещественное число num2.
 *
 * Задание: Написать код, который заменяет значение num1 на квадратный (положительный) корень
 * из этого числа до тех пор, пока значение num1 остается больше единицы на величину,
 * превышающую значение num2 (то есть кв. корень из num1 > 1 + num2). Вывести в консоль
 * все промежуточные значения и количество операций по извлечению квадратного корня из num1
 * в виде "Промежуточные: x1 x2 ... xN, Количество: y".
 *
 * Вычислить квадратный корень можно с помощью Math.sqrt().
 *
 * Сравнения проводить со значениями, предварительно сокращенными до одного знака после
 * точки с помощью String.format("%.1f", current).
 *
 * Например, для входящих значений 9 и 1.6 вывод будет:
 *
 * Промежуточные: 3.0, Количество: 1
 *
 * Примечание: Если у вас выводится разделителем запятая вместо точки, используйте
 * String.format(Locale.ENGLISH, "%.1f", current);
 */

import java.util.Locale;
import java.util.StringJoiner;

public class Task145 {
    public static void loop(int num1, double num2) {
        StringJoiner rsl = new StringJoiner(" ");
        double current = num1;
        int count = 0;
     /*   while (Math.sqrt(current) > 1 + num2) {
            current = Math.sqrt(current);
            count++;
            rsl.add(String.format(Locale.ENGLISH, "%.1f", current));
        }*/
        while (Double.parseDouble(String.format(Locale.ENGLISH, "%.1f", Math.sqrt(current))) > 1 + num2) {
            current = Double.parseDouble(String.format(Locale.ENGLISH, "%.1f", Math.sqrt(current)));
            count++;
            rsl.add(String.format(Locale.ENGLISH, "%.1f", current));
        }
        System.out.println("Промежуточные: " + rsl + ", Количество: " + count);
    }
}