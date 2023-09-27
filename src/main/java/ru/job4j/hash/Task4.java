package ru.job4j.hash;

import java.util.*;

/**
 * 2.1.6. Map
 * 4. Outer full join для массивов чисел.
 *
 * В это задании необходимо вычислить уникальный элементы,
 * которые есть в двух массивах чисел.
 *
 * Заданы два массива чисел, нужно вернуть третий массив,
 * который будет состоять только из уникальных элементов,
 * которые есть в двух массивах.
 */
public class Task4 {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        List<Integer> rsl = new LinkedList<>();
        for (int el : left) {
            if (!right.contains(el)) {
                rsl.add(el);
            }
        }
        for (int el : right) {
            if (!left.contains(el)) {
                rsl.add(el);
            }
        }
        Collections.sort(rsl);
        return rsl;
    }
}
