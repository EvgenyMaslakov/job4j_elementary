package ru.job4j.array;

/**
 * 8. indexOf с числом вхождений
 *
 * У String есть метод indexOf(). Он ищет первое вхождение символа.
 * Ваша задача написать метод, который возвращает индекс по количество вхождений.
 * Если ничего не найдено нужно вернуть -1
 *
 * Если если число вхождений указано равное 1, то метод работает как обычный indexOf()
 *
 * Пример
 *
 * Для строки "abc", с номером вхождения 1, при поиске символа 'c', должно вернуться 2
 *
 * Для строки "abcdec", с номером вхождения 2, при поиске символа 'c', должно вернуться 5
 *
 * Для строки "abc", с номером вхождения 1, при поиске символа 'z', должно вернуться -1
 */
public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int count = 1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c && count == number) {
                rsl = i;
                break;
            } else if (string[i] == c && count != number) {
                count++;
            }
        }
        return rsl;
    }
}