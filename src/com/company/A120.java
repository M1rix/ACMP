package com.company;

import java.util.*;

public class A120 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] Matrix = createMatrix(sc, n + 1, m + 1);

//        System.out.println("");
//        System.out.println(" start matrix");
//        System.out.println("");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                System.out.print(Matrix[i][j] + " ");
//            }
//            System.out.println("");
//        }


        int[][] resultMatrix = solveSums(Matrix, n, m);

//        System.out.println("");
//        System.out.println(" solved matrix");
//        System.out.println("");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(resultMatrix[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
//        System.out.print("solve  ");
        System.out.println(resultMatrix[n - 1][m - 1]);
    }

    public static int[][] solveSums(int[][] a, int n, int m) {

        int[][] s = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i + 1][j + 1] += Math.min(a[i + 1][j], a[i][j + 1]);
                s[i][j] = a[i + 1][j + 1];
            }
        }
        return s;
    }

    public static int[][] createMatrix(Scanner sc, int n, int m) {

        int[][] A = new int[n][m];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0)
                    A[i][j] = Integer.MAX_VALUE;
                if (j == 0)
                    A[i][j] = Integer.MAX_VALUE;
            }
        }
        A[0][1] = 0;
        A[1][0] = 0;
        return A;
    }
}

