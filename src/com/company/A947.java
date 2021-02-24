package com.company;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Locale;

public class A947 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        double x = sc.nextDouble();
        double sum = 0;
        int i;
        for (i = 0; sum < x ; i++) {
            sum+=   1.0 / (i+2);
        }
        pw.println(i +" card(s)");
        pw.flush();
    }
}
