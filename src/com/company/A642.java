package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        long s = sc.nextLong();
        int[] a = new int[n];
        long c = 0;
        long count=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();

        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            c += a[i];
            if (c <=s) {

                count++;
            }
        }
        pw.println(count);
        pw.flush();
    }
}
