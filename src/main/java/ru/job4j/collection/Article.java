package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 2.1.6. Map
 * 1. Генератор текста
 *
 * Задан большой текст.
 * Из него вырезают слова и предложения. Из них составляют новый текст.
 *
 * Нужно проверить, что новый текст был получен из оригинального.
 */
public class Article {

    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        Map<String, Long> originMap = Arrays.stream(origin.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> lineMap = Arrays.stream(line.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String lineKey : lineMap.keySet()) {
            for (String originKey : originMap.keySet()) {
                if (lineKey.equalsIgnoreCase(originKey)) {
                    rsl = false;
                    break;
                }
            }
        }
        for (String word : lineMap.keySet()) {
            if (!originMap.containsKey(word) && lineMap.containsKey(word)
            || originMap.get(word) - lineMap.get(word) <= 0) {
                    rsl = false;
            }
        }

        return rsl;
       /* for (String word : lineMap.keySet()) {
            if (originMap.containsKey(word) && lineMap.containsKey(word)) {
                if (originMap.get(word) - lineMap.get(word) >= 0) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;*/

    }


    public static void main(String[] args) {
        String origin = "Мама мама мАмА мыла, раму! раму и окно мама";
        Arrays.stream(origin.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }
}
