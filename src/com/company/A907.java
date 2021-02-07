package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A907 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int r = sc.nextInt();

        if (r * 2 <= h && r * 2 <= w) {
            pw.println("YES");
            pw.flush();
        }else{
            pw.println("NO");
            pw.flush();
        }
    }
}
