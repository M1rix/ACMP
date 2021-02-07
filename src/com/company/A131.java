package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int v, s, max = 0, k = -1;

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            v = sc.nextInt();
            s = sc.nextInt();
            if (s>0 && v > max) {
                max = v;
                k = i;
            }

        }
        pw.println(k);


        pw.flush();
    }

}





