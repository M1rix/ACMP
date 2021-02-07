package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();

        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j >= k1 - 1 && j <= k2 - 1) {
                    pw.print(f[j]);
                    pw.print(" ");
                }
            }
            pw.println("");

        }
        pw.flush();
    }
}
