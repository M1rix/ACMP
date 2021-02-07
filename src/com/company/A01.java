package com.company;

import java.io.*;
import java.util.*;

public class A01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();

        pw.println(a + b);


        pw.flush();
    }
}

