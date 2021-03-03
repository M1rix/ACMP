package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = sc.nextInt();
        int n = (int) Math.sqrt(k);
        int h = (int) Math.sqrt(k);
        int w = k / h;

        for (int i = 1; i < n; i++) {

        }
        int a = Math.abs(h - w);
        int b = k - (h * w);

        pw.println(h + " " + w);
        pw.flush();
    }
}
