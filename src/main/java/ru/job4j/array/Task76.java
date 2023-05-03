package ru.job4j.array;

public class Task76 {
    public static void array(int[] arr) {
        int[] rsl = new int[5];
        for (int grade : arr) {
            if (grade == 5) {
                rsl[0]++;
            } else if (grade == 4) {
                rsl[1]++;
            } else if (grade == 3) {
                rsl[2]++;
            } else if (grade == 2) {
                rsl[3]++;
            } else if (grade == 1) {
                rsl[4]++;
            }
        }
        System.out.println("5: " + rsl[0] + ", 4: " + rsl[1] + ", 3: " + rsl[2] + ", 2: " + rsl[3] + ", 1: " + rsl[4]);
    }
}