package ru.job4j.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner rsl = new StringJoiner(" ");
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int n = 0;
            int sum = 0;
            while (num > 0) {
                n = num % 10;
                num /= 10;
                sum += n;
            }
            rsl.add(Integer.toString(sum));
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println("Суммы: " + rsl + ", индекс: " + maxIndex);
    }
}