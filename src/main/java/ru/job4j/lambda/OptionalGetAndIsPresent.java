package ru.job4j.lambda;

import java.util.Optional;

/**
 * 1.4.1. Lambda
 * 5.1. Optional. Методы isPresent(), isEmpty(), get()
 *
 * Для того, чтобы проверить, что в Optional есть значение или нет, можно использовать метод isPresent(),
 * isEmpty().
 *
 * Например,
 *
 * Optional.of(1).isPresent();  даст true
 *
 * Optional.empty().isEmpty();  даст true
 *
 * Для получения значения, которое мы поместили с помощью метода of() мы можем
 * использовать метод get()
 *
 * Например,
 *
 * Optional.of(1).get()  Вернет 1
 *
 * Optilnal.empty().get()  Вернет исключение!
 *
 * Запомните, перед вызовом метода get() всегда нужно использовать isPresent().
 * В этом суть Optional,
 * чтобы программист не забывал делать проверки.
 *
 * Ваша задача:
 *
 * 1. Написать метод indexOf(). Он ищет индекс по значению.
 * Если индекс не найден, должно вернуться
 * Optional.empty(). Если найден, то Optional из этого индекса
 *
 * 2. В методе get() нужно вызвать метод indexOf().
 * Если вернулся пустой Optinal, то метод должен
 * вернуть -1, в противном случае сам индекс
 */
public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        return indexOf(data, el).isPresent() ? indexOf(data, el).get() : -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rsl = i;
                break;
            }
        }
        return rsl > -1 ? Optional.of(rsl) : Optional.empty();
    }
}
