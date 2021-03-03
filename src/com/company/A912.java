package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int s = 0;
        int c =0;
        int max = 0;
        int idx= 0;
        for (int i = 0; i <n-1; i++) {
            if (a[i] == a[i + 1]) {
                s++;

                if (s > c && s > max) {
                    max = s;
                    c = s;
                    idx = i;
                }
                if (c == max) {
                    pw.println(0);
                    pw.flush();
                    return;
                }
            }
        }
        pw.println(a[idx]);
        pw.flush();
    }
}
