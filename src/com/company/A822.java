package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long x1 =sc.nextInt();
        long y1 =sc.nextInt();

        long x2 =sc.nextInt();
        long y2 =sc.nextInt();

        long x3 =sc.nextInt();
        long y3 =sc.nextInt();

        double s = 0.5* Math.abs((x1*y2+x2*y3+x3*y1)-(x3*y2+y3*x1+y1*x2));

        pw.println(s);
        pw.flush();


    }
}
