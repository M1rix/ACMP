package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int year = sc.nextInt();


        int[] daysN = new int[]{30, 28, 30, 30, 30, 30, 30, 30, 30};
        int[] daysV = new int[]{30, 29, 30, 30, 30, 30, 30, 30, 30};
        int day = 255;
        int month = 0;


        String yy = "000" + Integer.toString(year);
        String y = yy.substring(yy.length() - 4, yy.length());

        if ( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
            for (int i = 0; i < 9; i++) {
                day -= daysV[i];
                if (day < 1) {
                    month = i + 1;
                    day = Math.abs(day)-2;
                    pw.println(day + "/" + "0" + month + "/" + y);
                }
            }
        } else {
            for (int i = 0; i < 9; i++) {
                day -= daysN[i];
                if (day < 1) {
                    month = i + 1;
                    day = Math.abs(day);
                    pw.println(day + "/" +"0" + month + "/" + y);
                }
            }
        }
        pw.flush();

    }
}
