package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class A579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos = 0;
        int neg = 0;
        int countOfZero= 0;
        ArrayList<Integer> idxOfPos = new ArrayList<>();
        ArrayList<Integer> idxOfNeg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>0) {
                pos += arr[i];
                idxOfPos.add(i + 1);
            }
            if(arr[i]<0){
                neg += Math.abs(arr[i]);
                idxOfNeg.add(i+1);
            }
            if (arr[i] ==0) countOfZero++;
        }
        if (neg>pos) {
            pw.println(idxOfNeg.size());
            for (Integer integer : idxOfNeg) pw.print(integer + " ");
        }
        if (pos>neg) {
            pw.println(idxOfPos.size());
            for (Integer integer : idxOfPos) pw.print(integer + " ");
        }
        if (countOfZero==arr.length)
            pw.print(0);
        pw.flush();
    }
}