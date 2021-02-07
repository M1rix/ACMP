package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A854 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int tRoom = sc.nextInt();
        int tCond = sc.nextInt();
        String state = sc.next().toLowerCase();

        switch (state) {
            case "freeze":
                if (tRoom > tCond) {
                    pw.println(tCond);
                } else
                    pw.println(tRoom);

                break;

            case "heat":
                if (tRoom < tCond) {
                    pw.println(tCond);
                } else {
                    pw.println(tRoom);
                }
                break;

            case "auto":
                pw.println(tCond);
                break;

            case "fan":
                pw.println(tRoom);
                break;
        }
        pw.flush();
    }
}
