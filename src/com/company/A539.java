package com.company;

import java.io.*;
import java.util.*;

public class A539 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        if (n > 1) {
            if (n % 2 == 0) {
                pw.println(n / 2);
                pw.flush();
            }
            if (n % 2 != 0) {
                pw.println(n);
                pw.flush();
            }
        }else{
            pw.println(0);
            pw.flush();
        }
    }
}