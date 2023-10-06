package ru.job4j.condition;

/**
 *
 * 1.1.2. Типы данных
 * 9.3. Математические операторы и составные операторы присваивания
 * Задача будет переписать его с использованием составных операторов присваивания.
 */
public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie. ";
        int year = 2022;
        idea += year;
        System.out.println(idea);
    }
}
