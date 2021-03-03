package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.next();
        char[] c = s.toCharArray();
        pw.print(1);
        for (int i = c.length-1; c[i] == '0';i--) {
            pw.print(0);
        }
        pw.flush();
    }
}
