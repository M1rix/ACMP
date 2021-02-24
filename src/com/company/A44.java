package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String str = sc.next();
        char[] s = str.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            // pw.print(i + ":" + s[i] + " ");
        }
        // pw.println("");
        for (int i = 0; i < s.length - 4; i++) {
            if (s[i] == '>' && s[i + 1] == '>' && s[i + 2] == '-' && s[i + 3] == '-' && s[i + 4] == '>') {
                // pw.println(s[i] + "" + s[i + 1] + "" + s[i + 2] + "" + s[i + 3] + "" + s[i + 4] + ":  " + i + "." + (i + 1) + "." + (i + 2) + "." + (i + 3) + "." + (i + 4));
                count++;
            }
        }
        for (int i = 0; i < s.length - 4; i++) {
            if (s[i] == '<' && s[i + 1] == '-' && s[i + 2] == '-' && s[i + 3] == '<' && s[i + 4] == '<') {
                // println(s[i] + "" + s[i + 1] + "" + s[i + 2] + "" + s[i + 3] + "" + s[i + 4] + ":  " + i + "." + (i + 1) + "." + (i + 2) + "." + (i + 3) + "." + (i + 4));
                count++;
            }
        }
        pw.println(count);
        pw.flush();
    }
}
