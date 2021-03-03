package com.company;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class A760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int inspectors = sc.nextInt();
        double speed = sc.nextInt();
        double path = sc.nextInt();
        double d = (path/speed)*60;
        for (int i = 0; i < inspectors; i++) {
            double len = sc.nextInt();
            double time = sc.nextInt();
            d+=time;
        }
        pw.format(Locale.US,"%.2f",d);
        pw.flush();
    }
}
