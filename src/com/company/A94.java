package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int sword = sc.nextInt();
        int head = sc.nextInt();
        int regen = sc.nextInt();
        int att = 0;

        if (sword>=head) {
            pw.println(1);
            pw.flush();
            return;
        }
        if (sword <= regen)
            pw.println("NO");
        else {
            pw.println(((head-sword-1)/(sword-regen))+2);
        }
        pw.flush();
    }
}
