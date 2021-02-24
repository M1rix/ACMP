package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] a = new char[n][m];
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            char[] c = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                a[i][j] = c[j];
            }
        }
        int[] N = new int[m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                N[j] = sc.nextInt();
                b[i][j] = N[j];
            }
        }

        boolean[][] cond = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cond[i][j] = condition(a[i][j], b[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pw.print(cond[i][j] + " ");
            }
            pw.println("");
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j <m ; j++) {
                if(cond[i][j] == false){
                    pw.println("NO");
                    pw.flush();
                    return;
                }
            }
        }
        pw.println("YES");
        pw.flush();
    }

    private static boolean condition(char b, int a) {
        boolean foo = false;
        switch (a) {
            case 0:
                if (b == '.')
                    foo = true;
                else
                    foo = false;
            case 1:
                if (b == 'B')
                    foo = true;
                else
                    foo = false;
            case 2:
                if (b == 'G')
                    foo = true;
                else
                    foo = false;
            case 3:
                if (b == 'B')
                    foo = true;
                else
                    foo = false;
            case 4:
                if (b == 'R')
                    foo = true;
                else
                    foo = false;
            case 5:
                if (b == 'R')
                    foo = true;
                else
                    foo = false;
            case 6:
                if (b == 'R' || b == 'G')
                    foo = true;
                else
                    foo = false;
            case 7:
                if (b == '.' || b == 'R' || b =='G' || b == 'B')
                    foo = true;
                else
                    foo = false;
        }
        return foo;
    }
}
