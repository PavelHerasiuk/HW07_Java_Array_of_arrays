package by.epam.linear_program.main;

import java.util.Random;

public class Main41 {
    public static void main(String[] args) {
        // 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
        int n = 5;
        int[][] mas = new int[n][n];

        init(mas, 50);
        printMas(mas);

        sortColumnsInMasAscending(mas);
        printMas(mas);

        sortColumnsInMasDescending(mas);
        printMas(mas);
    }

    private static void init(int[][] mas, int limit) {
        int i;
        int j;

        Random rand = new Random();
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(limit);
            }
        }
    }

    private static void sortColumnsInMasAscending(int[][] mas) {
        int j;

        for (j = 0; j < mas[0].length; j++) {
            sortColumnAscending(mas, j);
        }
    }

    private static void sortColumnsInMasDescending(int[][] mas) {
        int j;

        for (j = 0; j < mas[0].length; j++) {
            sortColumnDescending(mas, j);
        }
    }

    private static void sortColumnAscending(int[][] mas, int k) {
        int i;
        int j;
        int temp;

        for (i = mas.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (mas[j][k] > mas[j + 1][k]) {
                    temp = mas[j][k];
                    mas[j][k] = mas[j + 1][k];
                    mas[j + 1][k] = temp;
                }
            }
        }
    }

    private static void sortColumnDescending(int[][] mas, int k) {
        int i;
        int j;
        int temp;

        for (i = mas.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (mas[j][k] < mas[j + 1][k]) {
                    temp = mas[j][k];
                    mas[j][k] = mas[j + 1][k];
                    mas[j + 1][k] = temp;
                }
            }
        }
    }

    public static void printMas(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.printf("% 3d ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}