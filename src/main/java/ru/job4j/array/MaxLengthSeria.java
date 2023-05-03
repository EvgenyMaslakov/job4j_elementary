package ru.job4j.array;

/**
 * 23. Максимальная длина неубывающей последовательности
 * Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она
 * называется неубывающей. Длина последовательности это количество элементов, которые в нее входят.
 * В массиве таких последовательностей может быть несколько, вам нужно найти длину максимальной из них.
 */
public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int countMax = 1;
        boolean finish = false;
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            int next = array[i + 1];
            if (current <= next) {
                count++;
            } else {
                finish = true;
            }
            if (finish || i == array.length - 2) {
                countMax = count;
                count = 1;
                finish = false;
            }
        }
        return countMax;
    }
}
