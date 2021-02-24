package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.abs(b - a) + a;
        int max = a + b - 1;
        if (a != 0 && b != 0) {
            if (a >= b) {
                pw.println(a + " " + max);
            } else {
                pw.println(min + " " + max);
            }
        } else {

            if (a == 0 && b > 0) {
                pw.println("Impossible");
            }
            if (b == 0) {
                pw.println(a + " " + a);
            }
        }
        pw.flush();
    }
}
