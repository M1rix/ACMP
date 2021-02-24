package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1)
                    s++;
            }
        }
        pw.println(s/2);
        pw.flush();
    }
}
