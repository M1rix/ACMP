package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.length() == 6 && isLetter(s.charAt(0)) && isDigit(s.charAt(1)) && isDigit(s.charAt(2)) && isDigit(s.charAt(3)) && isLetter(s.charAt(4)) && isDigit(s.charAt(5)))
                pw.println("Yes");
            else
                pw.println("No");
        }
        pw.flush();
    }
    static boolean isDigit(char a ){
        return a>='0' && a<='9';
    }
    static boolean isLetter(char a ){
        char[] b =new char[]{'A','B','C','E','H','K','M','O','P','T','X','Y'};
        boolean c =  false;
        for (int i = 0; i < b.length; i++) {
            if(b[i] == a)
                c = true;
            else
                c = false;
        }
        return c;
    }
}
