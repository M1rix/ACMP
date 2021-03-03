package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A967 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        Long[] b = new Long[n];

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            b[i] = s(a, k1) * s(a, k2);
            pw.print(b[i] + " ");
        }

        for (long item : b) pw.print(item + " ");
        pw.println("");

        Arrays.sort(b);

        for (long item : b) pw.print(item + " ");
        pw.println("");

        for (long item : b) pw.print(item + " ");

        pw.flush();
    }

    public static long s(long x, int k) {
        long summ = 0;
        while (x != 1) {
            summ += x % k;
            x /= k;
        }
        return summ;
    }
}
