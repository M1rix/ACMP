package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String a = sc.next().toLowerCase();
        char aa = a.charAt(0);
        char[] letters = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
       
        for (int i = 0; i < 26; i++) {
            if (letters[i] == aa) {

                if (i == 25) {
                    pw.println(letters[0]);
                    pw.flush();
                } else {
                    pw.println(letters[i + 1]);
                    pw.flush();
                }

            }
        }
    }
}
