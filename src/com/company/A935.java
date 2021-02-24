package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if ((isBlack(x1, y1) && isBlack(x2, y2)) || (isWhite(x1, y1) && isWhite(x2, y2)))
            pw.println("YES");
        else
            pw.println("NO");

            pw.flush();
    }

    static boolean isBlack(int a, int b) {
        boolean foo = false;
        for (int i = 0; i < 8; i++) {
            if ((a + b) % 2 == 0) {
                foo = true;
            } else
                foo = false;
        }
        return foo;
    }

    static boolean isWhite(int a, int b) {
        boolean foo = true;
        for (int i = 0; i < 8; i++) {
            if ((a + b) % 2 == 0) {
                foo = false;
            } else
                foo = true;
        }
        return foo;
    }
}