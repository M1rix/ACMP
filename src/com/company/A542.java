package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long a = sc.nextLong();
        pw.println(reverseBits(a));
        pw.flush();

    }
    public static long reverseBits(long x)
    {
        long b = 0;
        while (x != 0)
        {
            b <<= 1;
            b |= ( x & 1);
            x >>= 1;
        }
        return b;
    }
}
