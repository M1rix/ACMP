package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        int p = 3;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                sum += p;
                p++;
            } else {
                p = Math.max(p - 3, 3);
            }
        }
        pw.println(sum);
        pw.flush();
    }
}
