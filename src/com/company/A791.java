package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();

        if (a == 1) {
            pw.println(2 + " " + 9);
            pw.flush();
            return;
        }
        if (a == 8) {
            pw.println(7 + " " + 16);
            pw.flush();
            return;
        }
        if (a == 57) {
            pw.println(49 + " " + 58);
            pw.flush();
            return;
        }
        if (a == 64) {
            pw.println(56 + " " + 63);
            pw.flush();
            return;
        }
        if (a > 1 && a < 8) { // top row
            pw.println((a - 1) + " " + (a + 1) + " " + (a + 8));
            pw.flush();
            return;
        }
        if ((a - 1) % 8 == 0) { // left column
            pw.println((a - 8) + " " + (a + 1) + " " + (a + 8));
            pw.flush();
            return;
        }
        if (a % 8 == 0) { // right column
            pw.println((a - 8) + " " + (a - 1) + " " + (a + 8));
            pw.flush();
            return;
        }
        if (a > 57 && a < 64) { // bottom row
            pw.println((a - 8) + " " + (a - 1) + " " + (a + 1));
            pw.flush();
            return;
        }else {
            pw.println((a - 8) + " " + (a - 1) + " " + (a + 1) + " " + (a + 8));
            pw.flush();
            return;
        }
    }
}
