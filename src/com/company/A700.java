package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();   // days
        long v = sc.nextLong(); // size
        int k = sc.nextInt();   // eat per day
        long s = 0; //all size
        int K = 0;
        s = v;
        for (int i = 1; i < n; i++) {
            v -= k;
            if (v > 0) {
                s += v;
            } else {
                break;
            }
        }
        if (v <= 0)
            pw.print("NO ");
        else
            pw.print("YES ");
        pw.print(s);
        pw.flush();
    }
}
