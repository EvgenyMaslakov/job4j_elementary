package ru.job4j.calculator;

/**
 * 1.1.2. Типы данных
 * 4.3. Вызов метода без указания класса
 */
public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }
}
