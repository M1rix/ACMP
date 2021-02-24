package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.next();
        int q = 0;
        String[] c = new String[s.length()];
        char[] l = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                q++;
        }
        if (q == s.length()) {
            for (int i = 0; i < q; i++) {
                pw.print(l[0]);
            }
        }
        if (q == 0) {
            pw.println(l[s.length() - 1]);
        } else {
            var v = s.split("1");
            for (int i = 0; i < v.length; i++) {
                pw.print(l[v[i].length()]);
            }
        }
        pw.flush();
    }
}
