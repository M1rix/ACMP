package com.company;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class A775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        BigInteger a =sc.nextBigInteger();
        BigInteger b =sc.nextBigInteger();
        if(b.equals(BigInteger.ZERO)){
            pw.println("NO");
        }else{
            a = a.add(BigInteger.ONE);
            pw.println(a);
        }
        //2 4 6 8
        pw.flush();
    }
}