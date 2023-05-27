package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 6. Изограмма
 *
 * Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.
 *
 * Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре.
 * Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
 *
 * Метод должен вернуть булево значение - если слово является изограммой - то метод вернет true, иначе - false.
 */
public class Isogram {
    public static boolean checkString(String s) {
        Set<Character> rsl = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            rsl.add(s.charAt(i));
        }
        return s.length() == rsl.size();
    }
}
