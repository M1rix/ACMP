package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();
        int d = a2 - a1;

        pw.println(a1 + (d*(n-1)));
        pw.flush();
    }
}
