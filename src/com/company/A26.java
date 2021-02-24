package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();

        double d = Math.sqrt(((x1 - x2) * (x1 - x2)) + (y1 - y2) * (y1 - y2));

        if (d <= r1 + r2 && r1 <= r2 + d && r2 <= r1 + d)
            pw.println("YES");
        else
            pw.println("NO");
        pw.flush();
    }
}
