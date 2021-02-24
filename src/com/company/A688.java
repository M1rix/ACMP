package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();
        String result = "";
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            int c = (int)Math.sqrt(Math.abs(x[i] - sx) + Math.abs(y[i] - sy));
            pw.println(c);
            int d = (int)Math.sqrt(Math.abs(x[i] - dx) + Math.abs(y[i] - dy));
            pw.println(d);
            if (c>d){
                pw.println(i+1);
                pw.flush();
                return;
            }


        }
        pw.println("NO");
        pw.flush();

    }
}
