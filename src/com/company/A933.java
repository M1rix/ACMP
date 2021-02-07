package com.company;
//error at the 6-th test

import java.io.PrintWriter;
import java.util.Scanner;

public class A933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt(); // minute per month
        int b = sc.nextInt(); // price per month
        int l = sc.nextInt(); // limit price per month
        int t = sc.nextInt(); // duration


        if (a > t) {
            pw.println(t*b);
        } else {
            pw.println(a*b + (t-a)*l);
        }
        pw.flush();

    }
}
