package ru.job4j.array;

import java.util.Arrays;

/**
 * 16. Split
 *
 * В классе String есть метод split(), этот метод делит строки на части по разделителю.
 *
 * Ваша задача написать его аналог
 *
 * Например (запись идет через строки для удобства)
 *
 * "1 2", ' ' => {"1", "2"}
 *
 * "12", ' ' => {"12"}
 */
public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][str.length];
        int commonCount = 1;
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                result[commonCount - 1][count] = str[i];
                count++;
            } else {
                result[commonCount - 1] = Arrays.copyOf(result[commonCount - 1], count);
                count = 0;
                commonCount++;
            }
        }
        result[commonCount - 1] = Arrays.copyOf(result[commonCount - 1], count);
        return Arrays.copyOf(result, commonCount);
    }
}
