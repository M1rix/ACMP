package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String str = sc.next().toUpperCase();
        char[] let = new char[]{'A','B','C','D','E','F','G','H'};
        char[] num = new char[]{'1','2','3','4','5','6','7','8'};

        String bc = "BLACK";
        String wc = "WHITE";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8 ; j++) {
                if(str.charAt(1)==num[i]){
                    if(str.charAt(0)==num[j]){
                        if(((j+1)+(i+1))%2==0){
                            pw.println(bc);
                        }else
                            pw.println(wc);
                    }
                }
            }

        }
        pw.flush();
    }
}
