package ru.job4j.array;

/**
 * 28. Сумма разниц
 * Дан массив чисел, нужно найти сумму разниц пар элементов
 *
 * Например,
 *
 * {3, 2, 1} => (3 - 2) + (2 - 1) = 2
 *
 * {15, 10, 5} => (15 - 10) + (10 - 5) => 10
 */
public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i - 1] - nums[i];
        }
        return sum;
    }
}