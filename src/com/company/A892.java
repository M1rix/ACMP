package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();

        switch (n) {
            case 1:
                pw.println("Winter");
                pw.flush();
                break;
            case 2:
                pw.println("Winter");
                pw.flush();
                break;
            case 3:
                pw.println("Spring");
                pw.flush();
                break;
            case 4:
                pw.println("Spring");
                pw.flush();
                break;
            case 5:
                pw.println("Spring");
                pw.flush();
                break;
            case 6:
                pw.println("Summer");
                pw.flush();
                break;
            case 7:
                pw.println("Summer");
                pw.flush();
                break;
            case 8:
                pw.println("Summer");
                pw.flush();
                break;
            case 9:
                pw.println("Autumn");
                pw.flush();
                break;
            case 10:
                pw.println("Autumn");
                pw.flush();
                break;
            case 11:
                pw.println("Autumn");
                pw.flush();
                break;
            case 12:
                pw.println("Winter");
                pw.flush();
                break;
            default:
                pw.println("Error");
                pw.flush();
                break;
        }
    }
}
