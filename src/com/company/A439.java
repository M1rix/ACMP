package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        double N = sc.nextInt();
        double P = sc.nextInt();
        double d1= (100-P)/100/N;
        double d2=P/100;

        pw.println((String.valueOf(1/(d1+d2))+"0000000000000").substring(0,11));
        pw.flush();
    }
}
