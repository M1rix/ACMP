package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = sc.nextInt(); // pages
        int n = sc.nextInt(); // row
        int a = 0;
        int b = 0;

        if (k < n) {
            a = (n + k - 1) / k;
            b = n % k == 0 ? k : n % k;
        } else {
            a = 1;
            b = n;
        }
        pw.println(a);
        pw.println(b);
        pw.flush();

    }
}
