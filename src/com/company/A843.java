package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A843 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long n = sc.nextLong();
        long math = sc.nextLong();
        long physc = sc.nextLong();
        long loss = sc.nextLong();

        long y = n - loss;
        long x = (math + physc) - y;
        math -= x;
        physc -= x;
        pw.println(x + " " + math + " " + physc);
        pw.flush();

    }
}
