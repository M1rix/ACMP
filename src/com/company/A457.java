package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A457 {
    static int step(int num) {
        int[] a = new int[4];
        for (int i = 3; i >= 0; i--) {
            a[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(a);

        int num1 = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
        int num2 = a[0] + a[1] * 10 + a[2] * 100 + a[3] * 1000;
        return num2 - num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n1 = sc.nextInt();
        int n2 = step(n1);
        int c = 0;
        while (n1 != n2) {
            c++;
            n1 = n2;
            n2 = step(n1);
        }
        pw.println(n1);
        pw.println(c);
        pw.flush();
    }
}
