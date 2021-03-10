package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int nLengthOfString = sc.nextInt();
        int mLengthOfSubstring = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < nLengthOfString; i++) {
            for (int j = i; j <mLengthOfSubstring ; j++) {
                if (s.contains(s.substring(j,mLengthOfSubstring)))
                    count++;
            }
        }
        pw.println(count);
        pw.flush();
    }
}
