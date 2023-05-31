package ru.job4j.map;

import java.util.*;

/**
 * 7. Найти символ который используется в строке наибольшее количество раз
 *
 * Метод принимает строку, которая может содержать несколько пробелов, однако в ней отсутствуют знаки
 * препинания.
 *
 * Необходимо реализовать метод, который вернет символ в строке, который употребляется наибольшее количество
 * раз. Если окажется что таких символов несколько - необходимо вернуть первый из символов.
 * Чтобы обеспечить сортировку символов - собирайте исходную строку в TreeMap(), в которой ключ - это символ,
 * значение - количество. Перед тем как собирать строку ее нужно привести к нижнему регистру, удалить пробелы.
 *
 * Для того, чтобы собрать строку в отображение используйте методы computeIfPresent() и putIfAbsent()
 * - первый обновит значение частотности употребления символа, второй - вставит пару ключ(символ) значение(1)
 * - если такого символа в отображении еще нет.
 */
public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        char rsl = ' ';
        int valueMax = 0;
        String strNew = str.toLowerCase();
        String strNew2 = strNew.replaceAll("\\s", "");
        for (int i = 0; i < strNew2.length(); i++) {
            map.computeIfPresent(strNew2.charAt(i), (key, value) -> value + 1);
            map.computeIfAbsent(strNew2.charAt(i), key -> 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) > valueMax) {
                valueMax = map.get(key);
                rsl = key;
            }
        }
        return rsl;
    }
}