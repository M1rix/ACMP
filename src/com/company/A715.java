package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 0;
        char[][] a = new char[n][m];
        char[][] b = new char[n][m];

        for (int i = 0; i < n; i++) {
                a[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j] == 'W')
                    a[i][j] = 'B';
                else
                    a[i][j] = 'W';
            }
        }
        for (int i = 0; i < n; i++) {
                b[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(b[i][j] !=a[i][j])
                    s++;
            }
        }
        pw.println(s);
        pw.flush();


    }
}
