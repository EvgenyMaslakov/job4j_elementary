package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Панграмма
 *
 * Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 *
 * Метод принимает строку(на английском языке). Необходимо реализовать его так, чтобы метод определил
 * является ли входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами,
 * пробелы необходимо игнорировать.
 *
 * Напомню, что в английском алфавите 26 букв.
 */
public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> c = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                c.add(s.charAt(i));
            }
        }
        c.size();
        return c.size() == 26;
    }
}
