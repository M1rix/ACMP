package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A780 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a = sc.nextInt();
        pw.println((int)(-1 + Math.sqrt(1 + 8 * a)) / 2);
        pw.flush();
    }
}
