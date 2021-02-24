package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] a = new int[n];
        int s = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                s++;
                if(s>max)
                    max=s;
            }
            else
                s = 0;

        }
        pw.println(max);
        pw.flush();
    }
}
