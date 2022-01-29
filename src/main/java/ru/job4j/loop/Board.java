package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                String cell;
                if (i % 2 == 0) {
                    cell = j % 2 == 0 ? "X" : " ";
                } else {
                    cell = j % 2 == 0 ? " " : "X";
                }
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
