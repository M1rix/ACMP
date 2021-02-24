package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n =sc.nextInt();
        int m = sc.nextInt();
        int nm = n/m;
        int nmc = n%m;
        for (int i = 0; i < m - nmc; i++) {
            pw.print(nm+" ");
        }
        for (int i = 0; i < nmc; i++) {
            pw.print((nm+1)+" ");
        }
        pw.flush();
    }
}
