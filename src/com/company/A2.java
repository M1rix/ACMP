package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int s=0;

        s=(1+n)*n/2;
        pw.println(s);
        pw.flush();
    }
}
