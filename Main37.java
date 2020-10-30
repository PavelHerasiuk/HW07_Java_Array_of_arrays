package by.epam.linear_program.main;

import java.util.Random;

public class Main37 {
    public static void main(String[] args) {
        // 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
        // столбце. Определить, какой столбец содержит максимальную сумму
        int n = 3;
        int m = 4;
        int column;
        int[][] mas = new int[n][m];

        init(mas, 50);
        printMas(mas);

        int[] sums = countSumInEveryColumn(mas);
        column = findColumnWithMaxSum(sums);
        printSums(sums);
        printColumnIndex(column);
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

    private static int[] countSumInEveryColumn(int[][] mas) {
        int j;
        int[] sums = new int[mas[0].length];

        for (j = 0; j < mas[0].length; j++) {
            sums[j] = countSum(mas, j);
        }
        return sums;
    }

    private static int countSum(int[][] mas, int j) {
        int i;
        int sum = 0;

        for (i = 0; i < mas.length; i++) {
            sum = sum + mas[i][j];
        }
        return sum;
    }

    private static int findColumnWithMaxSum(int[] mas) {
        int j = 0;
        int index = j;
        int max = mas[0];

        for (j = 1; j < mas.length; j++) {
            if (mas[j] > max) {
                index = j;
                max = mas[j];
            }
        }
        return index;
    }

    public static void printMas(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.printf("% 4d ", mas[i][j]);
            }
            System.out.println();
        }
    }

    private static void printSums(int[] mas) {
        int i;

        System.out.println(" Сумма элементов в каждом столбце: ");
        for (i = 0; i < mas.length; i++) {
            System.out.printf("% 4d ", mas[i]);
        }
        System.out.println();
    }

    private static void printColumnIndex(int column) {
        System.out.println(" В " + (column + 1) + " столбце максимальная сумма элементов ");
    }
}