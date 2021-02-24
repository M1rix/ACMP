package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long a = sc.nextLong(); // avenue
        long s = sc.nextLong(); // street
        long w = sc.nextLong(); // width
        long l = sc.nextLong(); // length

        long aw = a*w*l;
        long sw = s*w*l;
        long d = a*s*(w*w);
        pw.println(aw+sw-d);
        pw.flush();
     }
}
