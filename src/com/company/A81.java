package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int min = 30000;
        int max = 0;

        boolean crash = false;
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            if (weight > max)
                max = weight;
            if (weight < min)
                min = weight;
        }
        pw.println(min + " " + max);
        pw.flush();
    }
}
