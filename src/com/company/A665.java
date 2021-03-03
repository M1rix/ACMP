package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String w = sc.next();
        String[] time = w.split(":");

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        nextTime(h,m);
        while(!pal_time(h,m)) nextTime(h, m);
        pw.format("%02d:%02d\n",h,m);
        pw.flush();
    }
    
    static void nextTime(int h,int m){
        h+=++m  /60;
        m%=60;
        h%=24;
    }

    static boolean pal_time(int h, int m){
        return (h%10==m/10 && h/10 ==m%10);
    }
}
