package ru.job4j.loop;

import java.util.Scanner;

/**
 * 169. Вывод песочных часов из "звёздочек"
 * Задание: Напишите класс, который выводит на экран «песочные часы», составленные из символа "*".
 * (Примеры вывода смотреть в тестах).
 *
 * Примечание: вывод запрограммировать только для нечетных значений, то есть ширина основания часов
 * может быть только 3, 5, 7 и т.д.
 */
public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        int starCount = columnCount;
        int spaceCount = 0;
        for (int str = 0; str < columnCount / 2 + 1; str++) {
            for (int smb = 0; smb < starCount + spaceCount; smb++) {
                if (smb < spaceCount) {
                    System.out.print(space);
                } else if (smb >= spaceCount && smb <= starCount + spaceCount) {
                    System.out.print(star);
                }
            }
            System.out.println();
            if (starCount == 1) {
                break;
            }
            starCount -= 2;
            spaceCount++;
        }
        starCount += 2;
        spaceCount--;
        for (int str = columnCount / 2 + 1; str < columnCount; str++) {
            for (int smb = 0; smb < starCount + spaceCount; smb++) {
                if (smb < spaceCount) {
                    System.out.print(space);
                } else if (smb >= spaceCount && smb <= starCount + spaceCount) {
                    System.out.print(star);
                }
            }
            System.out.println();
            if (starCount == columnCount) {
                break;
            }
            starCount += 2;
            spaceCount--;
        }
    }
}