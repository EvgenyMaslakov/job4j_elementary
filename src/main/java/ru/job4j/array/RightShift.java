package ru.job4j.array;

/**
 * 19. Циклический сдвиг вправо
 * Ваша задача выполнить циклический сдвиг вправо с шагом count
 *
 * Например,
 *
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 *
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */
public class RightShift {

    public static void shift(int[] nums, int count) {
        int[] rsl = new int[nums.length];
        int cnt = 0;
        for (int i = nums.length - count; i < nums.length; i++) {
            rsl[cnt] = nums[i];
            cnt++;
        }
        for (int i = 0; i < nums.length - count; i++) {
            rsl[cnt] = nums[i];
            cnt++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rsl[i];
        }
        return;
    }
}
