package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int summ = sc.nextInt();
        int prod = sc.nextInt();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                if (i + j == summ && i * j == prod) {
                    if (i <= j) {
                        pw.println(i + " " + j);
                        pw.flush();
                        return;
                    }
                }
            }
        }
    }
}
