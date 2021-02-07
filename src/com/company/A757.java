package com.company;

import java.io.PrintWriter;
import java.util.Scanner;
// runtime error at the 7-th time
public class A757 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long a = (sc.nextLong());
        long b = (sc.nextLong());
        long c = (sc.nextLong());

        if (a >= 2 && b >= 6 && c >= 1) {
            long ma = a / 2;
            long mb = b / 6;
            pw.println(Math.min(c, Math.min(ma, mb)));
        }
        else
            pw.println(0);

        pw.flush();
    }
}
