package com.company;

import java.io.*;
import java.util.*;

public class A92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int s = sc.nextInt();
        pw.println(s/6);
        pw.flush();
        pw.println(s/3*2);
        pw.flush();
        pw.println(s/6);
        pw.flush();

    }
}
