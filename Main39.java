package by.epam.linear_program.main;

import java.util.Random;

public class Main39 {
    public static void main(String[] args) {
        // 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
        // саму матрицу и номера строк, в которых число 5 встречается три и более раз.
        int[][] mas = new int[10][20];

        init(mas, 16);
        printMas(mas);

        printLinesNumber(findLinesNumber(mas));
    }

    public static void init(int[][] mas, int limit) {
        int i;
        int j;

        Random rand = new Random();
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(limit);
            }
        }
    }

    private static int[] findLinesNumber(int[][] mas) {
        int i;
        int k = 0;
        int[] indexes = new int[mas.length];

        for (i = 0; i < mas.length; i++) {
            if (countFive(mas, i) >= 3) {
                indexes[k] = i;
                k++;
            }
        }
        return indexes;
    }

    private static int countFive(int[][] mas, int i) {
        int j;
        int count = 0;

        for (j = 0; j < mas[i].length; j++) {
            if (mas[i][j] == 5) {
                count++;
            }
        }
        return count;
    }

    public static void printMas(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
    }

    private static void printLinesNumber(int[] mas) {
        int i = 0;

        System.out.println("Номера строк, в которых число \"5\" встречается 3 и более раз:");
        while (mas[i] > 0) {
            System.out.printf("%3d", mas[i]);
            i++;
        }
        System.out.println();
    }
}