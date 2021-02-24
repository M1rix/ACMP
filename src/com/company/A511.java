package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = sc.nextInt();
        if(k>0) {
            int minutes = ((k - 1) * 10) / 2;
            int hours = minutes / 60;
            int minute = minutes % 60;

            if (minutes > 720) {
                pw.println("NO");
                pw.flush();
                return;
            } else {
                pw.println(hours + " " + minute);
                pw.flush();
            }
        }
    }
}
