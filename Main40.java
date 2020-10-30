package by.epam.linear_program.main;

import java.util.Random;

public class Main40 {
    public static void main(String[] args) {
        // 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        int n = 5;
        int[][] mas = new int[n][n];

        init(mas, 50);
        printMas(mas);

        sortLinesInMasAscending(mas);
        printMas(mas);

        sortLinesInMasDescending(mas);
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

    private static void sortLinesInMasAscending(int[][] mas) {
        int i;

        for (i = 0; i < mas.length; i++) {
            sortLineAscending(mas[i]);
        }
    }

    private static void sortLinesInMasDescending(int[][] mas) {
        int i;

        for (i = 0; i < mas.length; i++) {
            sortLineDescending(mas[i]);
        }
    }

    private static void sortLineAscending(int[] mas) {
        int i;
        int j;
        int temp;

        for (i = mas.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
    }

    private static void sortLineDescending(int[] mas) {
        int i;
        int j;
        int temp;

        for (i = mas.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {

                if (mas[j] < mas[j + 1]) {
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
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