package ru.job4j.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 2.1.6. Map
 * 3. Inner Join для списков элементов
 *
 * В этом задании необходимо вычислить элементы, которые одновременно есть в двух списках чисел.
 *
 * Заданы два списка чисел, нужно вернуть третий список, который будет состоять из таких чисел,
 * которые одновременно есть в обоих списках.
 */
public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        List<Integer> rsl = new LinkedList<>();
        Set<Integer> leftSet = new HashSet<>(left);
        Set<Integer> rightSet = new HashSet<>(right);
        for (int el : leftSet) {
            if (rightSet.contains(el)) {
                rsl.add(el);
            }
        }

        return rsl;
    }
}
