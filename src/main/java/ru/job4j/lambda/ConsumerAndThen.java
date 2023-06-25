package ru.job4j.lambda;

import java.util.function.Consumer;

/**
 * 1.4.1. Lambda
 * 3.0. Consumer. Вывод строки. Метод andThen()
 *
 * Интерфейс Consumer позволяет, что-то сделать с переданным объектом, при этом ничего не возвращая.
 *
 * Например,
 *
 * Consumer<Integer> con = (num) -> System.out.println(num + 1); // при вызове метода accept(1) выведется 2
 *
 * Consumer также содержит метод andThen(consumer), в который мы можем передать еще один Consumer, который
 * выполниться после того, у которого вызывали этот метод.
 *
 * Например,
 *
 * Consumer<Integer> con2 = (num) -> System.out.println(num * num);
 *
 * con.andThen(con2); // con.accept(2) выведет 3 и 4
 *
 * Ваша задача совместить два Consumer, первый выводит строку через System.out.print, а второй приписывает
 * переход на новую строку через System.out.println
 *
 * Изменения с ноутбука
 *
 * Изменения с компа
 */
public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = s -> System.out.print(s);
        Consumer<String> ln = s -> System.out.println();
        return print.andThen(ln);
    }
}
