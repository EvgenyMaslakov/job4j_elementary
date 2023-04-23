package ru.job4j.loop;

public class Task76 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                sum += i;
            }
        }
        System.out.println((sum % 2) == 0 ? "Да" : "Нет");
    }
}