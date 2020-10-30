package by.epam.linear_program.main;

import java.util.Random;

public class Main42 {
    public static void main(String[] args) {
     // 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
     //     причем в каждом столбце число единиц равно номеру столбца.
        int n = 5;
        int[][] mas = new int[n][n];

        init(mas);
        printMas(mas);
    }

    public static void init(int[][] mas) {
        int j;

        for (j = 0; j < mas[0].length; j++) {
            initColumn(mas, j);
        }
    }

    private static void initColumn(int[][] mas, int j) {
        int i = 0;
        int k;
        int q1 = 0;

        Random rand = new Random();
        while (q1 < j && j - q1 < mas.length - i) {
            mas[i][j] = rand.nextInt(2);
            if (mas[i][j] == 1) {
                q1++;
            }
            i++;
        }
        if (q1 == j) {
            for (k = i; k < mas.length; k++) {
                mas[k][j] = 0;
            }
        } else {
            for (k = i; k < mas.length; k++) {
                mas[k][j] = 1;
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