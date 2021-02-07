package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int bus = 437;
        boolean crash = false;
        for (int i = 0; i < n; i++) {
            int bridge = sc.nextInt();
            if (bridge <= bus) {
                pw.println("Crash " + (i + 1));
                crash = true;
                break;
            }
        }
        if(!crash)
            pw.println("No crash");


        pw.flush();
    }
}
