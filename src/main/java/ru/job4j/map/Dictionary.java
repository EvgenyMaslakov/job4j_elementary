package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.3.3. Map. HashMap. LinkedHashMap
 *
 * 11. Реализовать словарь.
 *
 * В данном задании необходимо реализовать словарь. Метод принимает массив строк.
 *
 * Необходимо перебрать массив и добавить строки в карту таким образом, чтобы ключом был первый символ строки,
 * а значением - список строк, которые начинаются на первый символ строки.
 */
public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String str : strings) {
            List<String> list = new ArrayList<>();
            String s = "" + str.charAt(0);
            rsl.putIfAbsent(s, list);
            rsl.computeIfPresent(s, (key, value) -> {
                value.add(str);
                return value;
            });
        }
        return rsl;
    }
}
