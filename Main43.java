package by.epam.linear_program.main;

import java.util.Random;

public class Main43 {
    public static void main(String[] args) {
     // 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        int n = 5;
        int[][] mas = new int[n][n];

        init(mas, 50);
        printMas(mas);

        changeOddElements(mas);
        printMas(mas);
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

    private static int findMax(int[][] mas) {
        int i;
        int j;
        int max = mas[0][0];

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
        }
        return max;
    }

    private static void changeOddElements(int[][] mas) {
        int i;
        int j;
        int max;

        max = findMax(mas);
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                if (mas[i][j] % 2 != 0) {
                    mas[i][j] = max;
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