package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        if ((b1 >= k && a1 <= w) || (b2 >= k && a2 <= w) || (b3 >= k && a3 <= w) ||
                (b1 + b2 >= k && a1 + a2 <= w) || (b1 + b3 >= k && a1 + a3 <= w) ||
                (b2 + b3 >= k && a2 + a3 <= w) || (b1 + b2 + b3 >= k && a1 + a2 + a3 <= w))
            pw.println("YES");
        else
            pw.println("NO");
        pw.flush();
    }
}
