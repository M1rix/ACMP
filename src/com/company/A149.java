package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = n-1; i >=0; i--) {
            pw.println(N[i]);
            pw.flush();
        }
    }
}
