package ru.job4j.collection;

import java.sql.SQLOutput;
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
        /**
         * Строку origin перевожу в мапу,
         * где ключ это уникальное слово,
         * а значение это количество слов.
         */
        Map<String, Long> originMap = Arrays.stream(origin.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        /**
         * Строку line перевожу в мапу,
         * где ключ это уникальное слово,
         * а значение это количество слов.
         */
        Map<String, Long> lineMap = Arrays.stream(line.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        /**
         * Сравниваю строку line со строкой origin.
         * Если слово из строки line отсутствует в строке origin
         * или если слово из строки line присутствует в строке origin,
         * но количество слов в строке origin меньше чем в строке line,
         * то строка line не получена из origin.
         *
         */
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
        String line = "мыла пол";
        boolean rsl = true;
        System.out.println("origin");
        Map<String, Long> originMap = Arrays.stream(origin.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String word : originMap.keySet()) {
            System.out.println(word + " " + originMap.get(word));
        }
        System.out.println();
        System.out.println("line");
        Map<String, Long> lineMap = Arrays.stream(line.split("[^A-Za-zА-Яа-я]+"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String word : lineMap.keySet()) {
            System.out.println(word + " " + lineMap.get(word));
        }
        System.out.println();
        for (String word : lineMap.keySet()) {
            if (!originMap.containsKey(word)
                    || originMap.containsKey(word)
            && originMap.get(word) - lineMap.get(word) < 0) {
                System.out.println(word + " " + " = Нет");
                rsl = false;
            } else {
                System.out.println(word + " " + " = Да");
            }
        }
        System.out.println(rsl);

    }
}
