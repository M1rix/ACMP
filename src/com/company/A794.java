package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A794 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int players = sc.nextInt();
        int lvl = sc.nextInt();
        int k = sc.nextInt();
        long min = (long) (lvl) / k + Math.min(lvl, k - 1);
        pw.println(min * players);
        pw.flush();

        for (int i = 1; i <lvl ; i++) {

        }



    }
}
