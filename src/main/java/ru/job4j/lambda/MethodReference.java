package ru.job4j.lambda;

import java.util.function.Consumer;

/**
 * 1.4.1. Lambda
 * 4.0. Method reference. Обращение через класс и объект
 *
 * Method reference (ссылка на метод) - это языковая конструкция, которая представляет собой упрощенную
 * запись лямбда выражений.
 *
 * Когда можно применить ссылки на методы? Основное условие - это совпадение сигнатур методов в функциональном
 * интерфейсе и вызываемом методе. Сигнатура метода - это имя метода и его входные параметры.
 *
 * Например, есть интерфейс Consumer. Сигнатура метода accept() с возвращаемым значением выглядит так
 * void accept(T).
 * Т.е. метод должен что-то принимать и ничего не возвращать. С ним можно например применять метод
 * System.out.println()
 *
 * Consumer<String> lambda = (value) -> System.out.println(value); // запись через лямбда
 *
 * Consumer<String> mRerefence = System.out::println; // запись через ссылки на метод
 *
 * Еще пример
 *
 * Function<Integer, Integer> abs = Math::abs; // можно применить потому что сигнатура метода abs(): int (int)
 *
 * Когда мы используем ссылки на методы, мы обращаемся к методам. Как вы знаете методы бывают статические и
 * не статические. К статическим методам можно получить доступ через имя класса, как например, в последнем
 * примере. К не статическим методам можно получить доступ через объект класса, например,
 * this::нестатическийМетод, или объект::нестатическийМетод.
 *
 * Ваша задача написать два consumer первый обращается к нестатическому методу, а второй к статическому
 */
public class MethodReference {

    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

}
