package ru.job4j.loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner rsl = new StringJoiner("+");
        int start = n <= m ? n : m;
        int finish = n >= m ? n : m;
        int count = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                rsl.add(Integer.toString(i));
                count++;
            }
        }
        if (count > 0) {
            System.out.println(rsl);
        } else {
            System.out.print("");
        }
    }
}

