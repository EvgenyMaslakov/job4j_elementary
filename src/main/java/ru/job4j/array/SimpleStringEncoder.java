package ru.job4j.array;

/**
 * 1.1.7. Контрольные вопросы и тестовое задание.
 * 3. Тестовое задание. Блок "Базовый синтаксис"
 */
public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result += symbol;
                result += counter > 1 ? counter : "";
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += symbol;
        result += counter > 1 ? counter : "";
        return result;
    }
}
