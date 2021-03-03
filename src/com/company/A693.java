package com.company;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        char[] ca = str1.toCharArray();
        char[] cb = str2.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        if(str1.length() != str2.length()){
            pw.println("No");
            pw.flush();
            return;
        }
        boolean result = false;
        for (int i = 0; i < ca.length; i++) {
            result = false;
            if (ca[i] != cb[i]) {
                pw.println("No");
                pw.flush();
                return;
            }
            result = true;
        }
        if(result)
            pw.println("Yes");
        pw.flush();
    }
}
