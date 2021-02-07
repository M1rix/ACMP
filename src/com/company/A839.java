package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.next();
        char[] ch = s.toCharArray();
        boolean b = false;

        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '0') {
                pw.println("NO");

                b = false;
                break;
            } else
                b = true;
        }
        if (b)
            pw.println("YES");
        pw.flush();
    }
}

