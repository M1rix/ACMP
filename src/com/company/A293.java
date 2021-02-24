package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        double[] d = new double[n];
        double[] p = new double[n];
        double max = -1;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            double s = (d[i] * p[i]) / 100 ;
            if (s > max) {
                max = s;
                idx = i+1;
            }
        }
        pw.println(idx);
        pw.flush();
    }
}
