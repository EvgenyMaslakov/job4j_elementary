package ru.job4j.collection;

import java.util.Arrays;
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
        for (String word : lineMap.keySet()) {
            if (!originMap.containsKey(word)
            || originMap.containsKey(word)
                    && originMap.get(word) - lineMap.get(word) < 0) {
                rsl = false;
            }
        }
        return rsl;
    }


    public static void main(String[] args) {
        String origin = "Мама мыла раму и окно";
        String line = "Мама мыла раму и окно мыла раму и окно пол";
        boolean rsl = true;
        System.out.println("originMap");
        Map<String, Long> originMap = Arrays.stream(origin.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String word : originMap.keySet()) {
            System.out.println(word + " " + originMap.get(word));
        }
        System.out.println();
        System.out.println("lineMap");
        Map<String, Long> lineMap = Arrays.stream(line.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String word : lineMap.keySet()) {
            System.out.println(word + " " + lineMap.get(word));
        }
        System.out.println();
        for (String word : lineMap.keySet()) {
            if (!originMap.containsKey(word)) {
                System.out.println(word + " " + " = Условие 1 не проходит");
                rsl = false;
            } else if (originMap.containsKey(word)
                    && originMap.get(word) - lineMap.get(word) < 0) {
                System.out.println(word + " " + " = Условие 2 не проходит");
                rsl = false;
            } else {
                System.out.println(word + " " + " = Условие проходит");
            }
        }
        System.out.println(rsl);

    }
}
