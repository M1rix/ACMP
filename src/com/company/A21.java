package com.company;
// PRESENTATION ERROR!!!!
import java.io.*;
import java.util.*;

public class A21 {
    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(c,Math.max(a,b));
        int min = Math.min(c,Math.min(a,b));
        pw.println(max-min);
        pw.close();

    }
}
