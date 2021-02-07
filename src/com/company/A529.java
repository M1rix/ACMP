package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A529 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        pw.print(d);
        pw.flush();

    }
}
