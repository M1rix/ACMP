package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A440 {
    static int N = 5;
    static int[] x = new int[]{0, 25, 50, 75, 100};
    static int y = 0;
    static boolean[] b = new boolean[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int X = 0;
        int Y = 0;
        int s = 0;
        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();
            hit(X, Y);
        }
        for (int i = 0; i < N; i++) {
            if (b[i])
                s += 1;
        }
        pw.println(s);
        pw.flush();
    }

    static void hit(int xs, int ys) {
        for (int i = 0; i < 5; i++) {
            if (((x[i] - xs) * (x[i] - xs) + (y - ys) * (y - ys)) <= 100) {
                b[i] = true;
            }
        }
    }
}