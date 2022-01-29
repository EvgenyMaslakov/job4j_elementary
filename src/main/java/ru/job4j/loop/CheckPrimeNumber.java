package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = false;
        int i = 2;
        while (i <= number - 1) {
            if ((number % i) > 0) {
                i++;
                prime = true;
            } else {
                break;
            }
        }
        return prime;
    }
}
