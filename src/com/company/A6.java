package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = sc.next();
        char[] c = s.toCharArray();
        if (isRight(c)) {
            if (step(c))
                pw.println("YES");
            else
                pw.println("NO");
        }else
            pw.println("ERROR");
        pw.flush();
    }

    static boolean isRight(char[] c) {
        if (c.length != 5)
            return false;
        if (c[2] != '-')
            return false;

        if (c[1] < '1' || c[1] > '8')
            return false;
        if (c[4] < '1' || c[4] > '8')
            return false;

        if (c[0] < 'A' || c[0] > 'H')
            return false;
        if (c[3] < 'A' || c[3] > 'H')
            return false;
        return true;
    }

    static boolean step(char[] c) {
        int x1, y1, x2, y2;
        x1 = c[0] - 'A' + 1;
        x2 = c[3] - 'A' + 1;
        y1 = c[1] - '0';
        y2 = c[4] - '0';
        if (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2)
            return true;
        if (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1)
            return true;
        return false;
    }
}