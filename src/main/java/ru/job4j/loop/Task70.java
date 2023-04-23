package ru.job4j.loop;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        for (int i = 0; i < coords.length; i += 2) {
            int dotX = coords[i];
            int dotY = coords[i + 1];
            if (((dotX - x) * (dotX - x) + (dotY - y) * (dotY - y)) < (r * r)) {
                in++;
            } else if (((dotX - x) * (dotX - x) + (dotY - y) * (dotY - y)) == (r * r)) {
                on++;
            }
        }
        System.out.println("На окружности: " + on + ", внутри: " + in);
    }
}
