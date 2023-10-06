package ru.job4j.lambda;

import java.util.Optional;

/**
 * 1.4.1. Lambda
 * 5.4. Optional. Методы orElse(), orElseGet()
 *
 * Часто приходиться делать действия вида: если выполнено условие, то вернуть одно, иначе вернуть другое.
 * По отношению к Optional это могут быть проверки если значение существует вернуть одно, иначе другое.
 * Методы orElse(), orElseGet() позволяют опустить эти проверки.
 * Если значение существует, то вернется значение, иначе то, что мы указали передали в методы
 *
 * Например,
 *
 * Optional.empty().orElse(-1);  вернет -1, потому что значения нет
 *
 * Optional.of(1).orElse(-1);  вернет 1, потому что значение есть
 *
 * orElseGet() отличается тем, что принимает Supplier, в который мы можем поместить более сложную логику
 * формирования выходного значения
 *
 * Ваша задача отрефакторить код с использованием метода orElse()
 */
public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElse(-1);
    }
}
