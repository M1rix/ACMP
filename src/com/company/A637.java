package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] A = new int[n];
        int s= 0;
        for (int i = 0; i < n; i++) {
            int a =sc.nextInt();
            A[i] = a;
        }
        Arrays.sort(A,0,A.length);

        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {


            for (int i = 0; i < n; i++) {
                if (A[i] > 0) {
                    A[i] -= 1;
                    s++;
                } else
                    continue;
            }
        }

        pw.println(s);
        pw.flush();
    }
}
