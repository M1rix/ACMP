package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a, 0, 3);
        Arrays.sort(b, 0, 3);
//        for (int i = 0; i < 3; i++) {
//            pw.print(a[i] + " ");
//        }
//        for (int i = 0; i < 3; i++) {
//            pw.print(b[i] + " ");
//        }
        int c = 0;
        int d = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) c++;
            if (a[i] < b[i]) d++;
        }
        if (c == 0 && d == 0) {
            pw.println("Boxes are equal");
            pw.flush();
            return;
        }
        if (c > d && d == 0) {
            pw.println("The first box is larger than the second one");
            pw.flush();
            return;
        }
        if (d > c && c == 0) {
            pw.println("The first box is smaller than the second one");
            pw.flush();
            return;
        } else {
            pw.println("Boxes are incomparable");
            pw.flush();
            return;
        }
    }
}
