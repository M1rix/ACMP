package com.company;

import java.io.*;
import java.util.*;

public class A04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int num = sc.nextInt();

        pw.println(num*100+90+(9-num));
        pw.flush();
    }
}


