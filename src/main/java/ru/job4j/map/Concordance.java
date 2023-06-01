package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Character;

/**
 * 1.3.3. Map. HashMap. LinkedHashMap
 *
 * 12. Индексы символов
 *
 * Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные.
 * При реализации необходимо игнорировать пробелы во входной строке.
 *
 * Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки,
 * а значением - список индексов, под которыми этот символ (если таких символов несколько) входит в
 * исходную строку.
 *
 * Важно: строчные и прописные символы считаются разными символами.
 */
public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            int index = i;
            if (k == ' ') {
                continue;
            }
            List<Integer> list = new ArrayList<>();
            rsl.putIfAbsent(k, list);
            rsl.computeIfPresent(k, (key, value) -> {
                value.add(index);
                return value;
            });
        }
        return rsl;
    }
}
