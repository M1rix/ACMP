package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int[] v = new int[46];
        v[0] = 1;
        v[1] = 1;
        for (int i = 2; i < 46; i++) {
            v[i] = (v[i - 2] + v[i - 1]);
        }
//        for (int i = 0; i < 46; i++) {
//             pw.print(v[i]+" ");
//        }
//        pw.println("");
        for (int i = 0; i < 46; i++) {
            if (v[i] == N) {
                pw.println(1);
                pw.println(i+1);
                pw.flush();
                return;
            }
        }
        for (int i = 0; i < 46; i++) {
            if (v[i] != N) {
                pw.println(0);
                pw.flush();
                return;
            }
        }
    }
}
