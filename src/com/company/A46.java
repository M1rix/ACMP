package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String e = "2,7182818284590452353602875";
        pw.print("size of this str: "+e.length());
        int n = sc.nextInt();
        char[] c = e.substring(0, n).toCharArray();
        if (c[c.length] == '5' || c[c.length] == '6' || c[c.length] == '7' || c[c.length] == '8' || c[c.length] == '9') {
            if (c[n + 1] == '0')
                c[c.length-1] = '1';
            if (c[c.length-1] == '1')
                c[c.length-1] = '2';
            if (c[c.length-1] == '2')
                c[c.length-1] = '3';
            if (c[c.length-1] == '3')
                c[c.length-1] = '4';
            if (c[c.length-1] == '4')
                c[c.length-1] = '5';
            if (c[c.length-1] == '5')
                c[c.length-1] = '6';
            if (c[c.length-1] == '6')
                c[c.length-1] = '7';
            if (c[c.length-1] == '7')
                c[c.length-1] = '8';
            if (c[c.length-1] == '8')
                c[c.length-1] = '9';
        }
        for (int i = 0; i < n ; i++) {
            pw.print(c[i]);
        }


        pw.flush();
    }
}
