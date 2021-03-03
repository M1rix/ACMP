package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt(); // jumps
        int frogX = sc.nextInt(); // frog's X-cord
        int frogY = sc.nextInt(); // frog's Y-cord
        int l = sc.nextInt(); // length of tongue
        boolean chk = false;
        for (int i = 1; i <= n; i++) {
            int grigX = sc.nextInt();
            int grigY = sc.nextInt();
            double result = Math.sqrt(Math.pow((grigX - frogX), 2) + Math.pow((grigY - frogY), 2));  //(xb - xa)2 + (yb - ya)2
            if (result <= l) {
                pw.println(i);
                pw.flush();
                return;
            } else {
                if (i == n)
                    pw.println("Yes");
            }
        }
        pw.flush();
    }
}
