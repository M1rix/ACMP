package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = sc.nextInt();
        int d = 0;
        int m = 0;
        int n = 0;

        for (int i = 1; i <= k; i++) {
            n = sc.nextInt();
            m = sc.nextInt();

            d = 19 * m + (n + 239) * (n + 366) / 2;
            pw.println(d);
            pw.flush();

        }
    }
}
