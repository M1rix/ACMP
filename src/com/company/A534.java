package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] c = new int[n];
        int[] res = new int[100];
        int[] count = new int[100];
        for (int i = 0; i < 100; i++) {
            res[i] = i + 1;
        }

        for (int i = 0; i < n; i++)
            c[i] = sc.nextInt();

        int k = sc.nextInt();
        int[] p = new int[k];
        for (int i = 0; i < k; i++)
            p[i] = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (p[j] == res[i])
                    count[i]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (count[i] > c[i])
                pw.println("yes");
            else
                pw.println("no");
        }
        pw.flush();
    }
}
