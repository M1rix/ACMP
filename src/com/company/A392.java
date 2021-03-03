package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        int k = 0;
        int min = 10000000;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i]<min) {
                min = a[i];
                k = i;
            }
        }
        for (int i = k; i < n; i++) {
            pw.print(a[i] + " ");
        }
        for (int i = 0; i <k; i++) {
            pw.print(a[i] + " ");
        }

        pw.flush();
    }
}
