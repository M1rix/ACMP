package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        n/=24;
        pw.println(n*13 +" "+n*4+" "+n*7);
        pw.flush();
    }
}
