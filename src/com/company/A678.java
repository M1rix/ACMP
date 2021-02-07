package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A678 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String str = sc.next().toUpperCase();

        char[] c = new char[]{'A','B','C'};
        int[] n = new int[]{1,2,3};
        int x = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='A'){
                x = n[0];
                n[0] = n[1];
                n[1] = x;
            }
            if(str.charAt(i)=='B'){
                x = n[2];
                n[2] = n[1];
                n[1] = x;
            }
            if(str.charAt(i)=='C'){
                x = n[0];
                n[0] = n[2];
                n[2] = x;
            }
        }
        for(int i = 0;i<3;i++){
            if(n[i] == 1){
                pw.println(i+1);
            }
        }
        pw.flush();
    }
}
