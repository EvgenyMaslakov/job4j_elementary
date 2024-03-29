package ru.job4j.lambda;

import java.util.Optional;

/**
 * 1.4.1. Lambda
 * 5.2. Optional. Метод ifPresent()
 *
 * Иногда нужно при нахождении Optional выполнить какое-то действие.
 * Для этого существует метод ifPresent(), он принимает Consumer,
 * который будет выполнен,
 * если значение Optional не пустое.
 *
 * Например,
 *
 * Optional.of(1).ifPresent(System.out::println);  выведется 1
 *
 * Optional.empty().ifPresent(System.out::println);  ничего не выведется,
 * потому что значения нет
 *
 * Ваша задача:
 *
 * 1. Написать метод max(). Он находит максимальный элемент массива.
 * Если массив пуст, то возвращает
 * пустой Optional, в противном случае Optinal из максимального значения
 *
 * 2. Метод ifPresent() вызывает метод max(). Если значение существует,
 * то выводит максимальное значение
 * например, "Max: 3". Для вывода нужно использовать System.out.println()
 */
public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(max -> System.out.println("Max: " + max));
    }

    private static Optional<Integer> max(int[] data) {
        int max = -1;
        for (int el : data) {
            if (el > max) {
                max = el;
            }
        }
        return data.length == 0 ? Optional.empty() : Optional.of(max);
    }
}
