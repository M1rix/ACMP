package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int c = sc.nextInt();
        if (m + n % 2 == 0 && i + j % 2 == 0) {
            if (c == 0)
                pw.println("black");
            if (c == 1)
                pw.println("equal");
        }
        if (m + n % 2 == 1 && i + j % 2 == 1) {
            if (c == 0)
                pw.println("white");
            if (c == 1)
                pw.println("black");
        }
        pw.flush();
    }
}