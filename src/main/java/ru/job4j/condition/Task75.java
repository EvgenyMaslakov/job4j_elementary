package ru.job4j.condition;

/**
 * 76. Количество повторений "внутреннего" числа
 * Ниже представлен метод innerNum(int num2, int num4),
 * который принимает 2 целых числа - num2 - двузначное, num4 - четырехзначное.
 *
 * Задание: Написать код, который определяет и выводит в консоль количество раз,
 * когда двузначное число фигурирует как "внутреннее" по отношению к четырехзначному.
 * То есть какая-то пара смежных цифр в четырехзначном числе образует входящее двузначное число от 0 до 3 раз.
 *
 * Например, для чисел 33 и 3331 вывод будет:
 *
 * 2
 */
public class Task75 {
    public static void innerNum(int num2, int num4) {
        int par1 = num4 / 100;
        int par2 = num4 % 1000 / 10;
        int par3 = num4 % 100;
        int rsl = -1;
        if (par1 != num2 && par2 != num2 && par3 != num2) {
            rsl = 0;
        } else if (par1 == num2 && par2 != num2 && par3 != num2
                || par1 != num2 && par2 == num2 && par3 != num2
                || par1 != num2 && par2 != num2 && par3 == num2) {
            rsl = 1;
        } else if (par1 == num2 && par2 == num2 && par3 != num2
                || par1 == num2 && par2 != num2 && par3 == num2
                || par1 != num2 && par2 == num2 && par3 == num2) {
            rsl = 2;
        } else if (par1 == num2 && par2 == num2 && par3 == num2) {
            rsl = 3;
        }
        System.out.println(rsl);
    }
}
