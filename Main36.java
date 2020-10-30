package by.epam.linear_program.main;

import java.util.Random;
import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        // 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы
        // одного столбца поставить на соответствующие им позиции другого, а его элементы второго
        // переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

        int n;
        int m;

        m = enterNum("Введите количество строк в массиве ");
        n = enterNum("Введите количество столбцов в массиве ");

        int[][] mas = new int[m][n];

        randomNum(mas);
        printMas(mas);

        System.out.println();

        int a;
        int b;

        a = enterNum("Введите номер первого столбца ");
        b = enterNum("Введите номер второго столбца ");

        replaceColumn(mas, a, b);
        printMas(mas);
    }

    private static void replaceColumn(int[][] mas, int a, int b) {
        for (int i = 0; i < mas.length; i++) {
            int temp = mas[i][a - 1];
            mas[i][a - 1] = mas[i][b - 1];
            mas[i][b - 1] = temp;
        }
    }

    private static int enterNum(String mesage) {
        int value;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(mesage);

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(mesage);
        }
        value = sc.nextInt();
        return value;
    }

    private static void randomNum(int[][] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(10);
            }
        }
    }

    public static void printMas(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("% 2d ", i);
            }
            System.out.println();
        }
    }
}