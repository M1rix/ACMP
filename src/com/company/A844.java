package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long aSide = sc.nextLong();
        long bSide = sc.nextLong();
        long A = aSide * bSide;
        long square =(long) Math.sqrt(A);
        if (A==square*square)
            pw.println((long)square);
        else
            pw.println(0);
        pw.flush();
    }
}
