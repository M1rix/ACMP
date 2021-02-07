package com.company;


import java.io.PrintWriter;
import java.util.Scanner;

public class A697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int d = (2 * l * h + 2 * w * h);
        if (d%16==0) {
            pw.print(d/16);
            pw.flush();

        } else {
            pw.println(d/16+1);
            pw.flush();

        }
    }
}
