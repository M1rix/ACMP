package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 0;
        boolean[][] a = new boolean[n + 2][m + 2];
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < m + 2; j++) {
                a[i][j] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            String c = sc.next();
            char[] S = c.toCharArray();
            for (int j = 1; j <= m; j++) {
                a[i][j] = (S[j-1] == '.');
            }
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m; j++) {
                pw.print(a[i][j]+" ");
            }
            pw.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] && a[i + 1][j] && a[i - 1][j] && a[i][j - 1] && a[i][j + 1])
                    s++;
            }
        }
        pw.println(s);
        pw.flush();
    }
}
