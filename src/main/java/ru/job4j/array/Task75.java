package ru.job4j.array;


import java.util.StringJoiner;

/**
 * 13. Определить количество каждой из цифр в массиве
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел от 1 до 9.
 * Цифры могут содержаться в массиве в разном количестве и порядке, а также могут отсутствовать.
 *
 * Задание: написать код, который определяет следующее:
 *
 * - Сколько раз каждая из цифр встречается в массиве.
 *
 * - Какая цифра (цифры) встречается в массиве чаще всего.
 *
 * - Какая цифра (цифры) вообще не встречается в серии.
 *
 * - Какая цифра (цифры) встречается в массиве реже всего.
 *
 * Чаще - это если цифра присутствует больше раз, чем остальные (3, 3, 3, 2, 2, 1 - здесь чаще 3.
 * А случае 3, 3, 2, 2, 1 - чаще 3 и 2). Реже - это если цифра присутствует меньше раз, чем остальные,
 * но не менее одной (3, 3, 3, 2, 2, 1 - здесь реже 1). Если массив состоит из значений только одной цифры,
 * значит она не чаще, и не реже Например (1, 1). Если массив (1, 1, 2) значит 1 - чаще, 2 - реже.
 *
 * Результат нужно вывести в консоль в 2 строки. Вывод должен иметь вид:
 *
 * "1: х, 2: х, 3: х, 4: х, 5: х, 6: х, 7: х, 8: х, 9: х" - первая строка. х - полученные значения.
 *
 * "Чаще: хуz, отсутствует: хуz, реже: хуz" - вторая строка. х, у, z - полученные значения без пробела
 * в порядке возрастания.
 *
 * Если требуемые для вывода цифры отсутствуют, вывести вместо значения ноль.
 *
 * Например, для массива значений [1, 2, 2, 4, 5, 2, 7, 8, 7] вывод должен быть:
 *
 * 1: 1, 2: 3, 3: 0, 4: 1, 5: 1, 6: 0, 7: 2, 8: 1, 9: 0
 *
 * Чаще: 2, отсутствует: 3 6 9, реже: 1 4 5 8
 */
public class Task75 {
    public static void array(int[] arr) {
        int[] rsl = new int[9];
        StringJoiner oft = new StringJoiner(" ");
        StringJoiner abs = new StringJoiner(" ");
        StringJoiner rar = new StringJoiner(" ");
        int max = 0;
        int min = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= 9; j++) {
                if (arr[i] == j) {
                    rsl[j - 1]++;
                }
            }
        }
        for (int rs : rsl) {
        max = rs > max ? rs : max;
        min = rs < min && rs > 0 ? rs : min;
        }
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i] == 0) {
                abs.add(Integer.toString(i + 1));
            }
            if (rsl[i] == max && rsl.length > 2 && max != min) {
                oft.add(Integer.toString(i + 1));
            }
            if (rsl[i] == min && rsl.length > 2 && max != min) {
                rar.add(Integer.toString(i + 1));
            }
        }
        String oftEnd0 = oft.length() > 0 ? oft.toString() : "0";
        String rarEnd0 = rar.length() > 0 ? rar.toString() : "0";
        System.out.println("1: " + rsl[0] + ", 2: " + rsl[1]
                + ", 3: " + rsl[2] + ", 4: " + rsl[3] + ", 5: " + rsl[4]
                + ", 6: " + rsl[5] + ", 7: " + rsl[6] + ", 8: " + rsl[7]
                + ", 9: " + rsl[8]);
        System.out.println("Чаще: " + oftEnd0 + ", отсутствует: " + abs + ", реже: " + rarEnd0);
    }
}
