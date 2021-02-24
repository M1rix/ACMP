package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A925 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int search = sc.nextInt();

        int n = sc.nextInt(); // actors
        int a = sc.nextInt(); // tall
        int b = sc.nextInt(); // eye
        int c = sc.nextInt(); // blond
        int max = 0;
        int min = 0;

        if (search == 1) {// min
            min = Math.min(a,Math.min(b,c));
            if(min == a)
                min = min - Math.abs(b-c);
            if(min == b)
                min = min - Math.abs(a-c);
            if(min == c)
                min = min - Math.abs(a-b);
            pw.println(min);
        }

        if (search == 2) {// max
            pw.println(Math.min(a,Math.min(b,c)));
        }
        pw.flush();
    }
}
