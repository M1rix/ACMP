package com.company;


import java.io.PrintWriter;
import java.util.Scanner;

public class A755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x + y - z >= 0) {
            pw.println((x + y) - z);
            pw.flush();

        } else {
            pw.println("Impossible");
            pw.flush();
        }
    }

}




