package com.company;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class A894 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        double Sk = sc.nextDouble();
        double r1 = sc.nextDouble();

        double fullS =r1*r1*3.1415926535897932384626433832795;
        double s = Math.sqrt((fullS - Sk)/3.1415926535897932384626433832795);
        pw.printf("%.3f", s);
        pw.flush();

    }
}
