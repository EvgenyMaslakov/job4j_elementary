package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.1.4. List
 * 1. Открытые и закрытые скобки
 * 1. Открытые и закрытые скобки
 * Реализовать метод проверки корректности открытых и закрытых скобок.
 *
 * Например, ()(()((()))) - true, ()) - false
 */
public class Parentheses {
    public static boolean valid(char[] data) {
        boolean rsl = true;
        List<Integer> start = new ArrayList<>();
        List<Integer> finish = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '(') {
                start.add(i);
            } else {
                finish.add(i);
            }
        }
        if (start.size() == finish.size()) {
            for (int i = 0; i < start.size(); i++) {
                if (start.get(i) >= finish.get(i)) {
                    rsl = false;
                    break;
                }
            }
        } else {
            rsl = false;
        }
        return rsl;
    }
}