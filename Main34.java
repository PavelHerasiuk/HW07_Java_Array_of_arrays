package by.epam.linear_program.main;

public class Main34 {
    public static void main(String[] args) {
        /* 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
         * 1 1 1 1 1 1 1 1
         * 0 1 1 1 1 1 1 0
         * 0 0 1 1 1 1 0 0
         * 0 0 0 1 1 0 0 0
         * 0 0 1 1 1 1 0 0
         * 0 1 1 1 1 1 1 0
         * 1 1 1 1 1 1 1 1
         */
        int n = 8;
        int[][] mas = new int[n][n];

        init(mas);
        printMas(mas);
    }

    public static void init(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length / 2; i++) {
            for (j = 0; j < mas[i].length / 2; j++) {
                if (j < i) {
                    mas[i][j] = 0;
                    mas[i][mas.length - 1 - j] = 0;
                    mas[mas.length - 1 - i][j] = 0;
                    mas[mas.length - 1 - i][mas.length - 1 - j] = 0;
                } else {
                    mas[i][j] = 1;
                    mas[i][mas.length - 1 - j] = 1;
                    mas[mas.length - 1 - i][j] = 1;
                    mas[mas.length - 1 - i][mas.length - 1 - j] = 1;
                }
            }
        }
    }

    public static void printMas(int[][] mas) {
        int i;
        int j;

        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.printf("% 2d ", mas[i][j]);
            }
            System.out.println();
        }
    }
}