package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A756 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();


        pw.println((n-1)*(m-1));
        pw.flush();
    }
}
