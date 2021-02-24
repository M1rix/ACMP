package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < n; j++) {
                a[i][j]  = s[j];
                if(a[i][j] == 'C')
                    c++;
            }
        }
        c/=2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(c>0)
                    pw.print(1);
                else
                    pw.print(2);
                if(a[i][j] == 'C') c--;
            }
            pw.print("\n");
        }
        pw.flush();
    }
}
