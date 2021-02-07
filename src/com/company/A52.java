package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int num = sc.nextInt();

        int a1 = num / 100000;
        int a2 = num / 10000 - (a1 * 10);
        int a3 = num / 1000 - (a1 * 100 + (a2 * 10));
        int a4 = num / 100 - (a1 * 1000 + a2 * 100 + a3 * 10);
        int a5 = num % 100 / 10;
        int a6 = num % 10;

        if (a1 + a2 + a3 == a4 + a5 + a6) {
            pw.print("YES");
        } else {
            pw.println("NO");
        }
        pw.flush();
    }
}
