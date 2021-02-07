package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int Amax = Math.max(a1, Math.max(a2, a3));
        int Amin = Math.min(a1, Math.min(a2, a3));

        int Bmax = Math.max(b1, Math.max(b2, b3));
        int Bmin = Math.min(b1, Math.min(b2, b3));

        pw.println((Amax * Bmax) + (Amin * Bmin) + (((a1 + a2 + a3) - (Amax + Amin)) * ((b1 + b2 + b3) - (Bmax + Bmin))));
        pw.flush();
    }
}
