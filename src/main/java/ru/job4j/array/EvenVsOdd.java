package ru.job4j.array;

/**
 * 31. Четные vs Нечетные
 * Вам даны очки игроков. Игроки разделись таким образом, что под четными индексами
 * находятся очки первой команды, под нечетными второй. Ваша задача определить, кто выиграл.
 * Выигрывает та команда, которая набрала наибольшее число очков. Если выиграла первая
 * команда, то нужно вернуть 1, если вторая, то 2, если ничья то 0.
 */
public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int rsl = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1 += players[i];
            } else if (i % 2 == 1) {
                sum2 += players[i];
            }
        }
        if (sum1 > sum2) {
            rsl = 1;
        } else if (sum1 < sum2) {
            rsl = 2;
        }
        return rsl;
    }
}
