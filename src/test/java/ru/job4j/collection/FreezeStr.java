package ru.job4j.collection;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 2.1.6. Map
 * 2. Проверить две строчки на идентичность.
 * 2.
 * Даны две строки. Нужно проверить, что вторая строка получилась методом
 * перестановок символов в первой строке.
 */

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rsl = true;
        Map<String, Long> leftMap = Arrays.stream(left.split(""))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> rightMap = Arrays.stream(right.split(""))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String letter : rightMap.keySet()) {
            if (leftMap.size() != rightMap.size()
                    || !leftMap.containsKey(letter)
                    || leftMap.get(letter) - rightMap.get(letter) != 0) {
                rsl = false;
            }
        }
        return rsl;
    }
}