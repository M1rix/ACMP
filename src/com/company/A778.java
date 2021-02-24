package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int[] days = new int[31];
        int s = 0;

        for (int i = 0; i < 31; i++) {
            days[i]=sc.nextInt();
            s+= days[i];
        }
        pw.println(s/(days.length-4));
        pw.flush();
    }
}
