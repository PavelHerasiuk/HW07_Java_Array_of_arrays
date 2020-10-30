package by.epam.linear_program.main;

public class Main32 {
    public static void main(String[] args) {
        /* 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - * четное):
         *  1    2     3  ... n
         *  n    n-1  n-2 ... 1
         *  1    2     3  ... n
         *  n    n-1  n-2 ... 1
         *  ...................
         *  n    n-1  n-2 ... 1
         */
        int n = 8;
        int[][] mas = new int[n][n];

        init(mas);
        printMas(mas);
    }

    public static void init(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length; i++) {
            if (i == 0 || i % 2 == 0) {
                for (j = 0; j < mas[i].length; j++) {
                    mas[i][j] = j + 1;
                }
            } else {
                for (j = 0; j < mas[i].length; j++) {
                    mas[i][j] = mas[i].length - j;
                }
            }
        }
    }

    public static void printMas(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.printf("% 2d", mas[i][j]);
            }
            System.out.println();
        }
    }
}