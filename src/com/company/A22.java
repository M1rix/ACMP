package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long n = sc.nextLong();
        int s = 0;
        do {
            if (n % 2 == 1){
                s++;
                 n /= 2;
            }
            else
                n /= 2;
        }while (n >=1);
        pw.println(s);
        pw.flush();
    }
}
