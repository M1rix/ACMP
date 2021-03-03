package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class A98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        long s1 = 0;
        long s2 = 0;
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        while (arr.size() != 0) {
            int as = arr.size();
            if (arr.get(0) >= arr.get(as - 1)) {
                s1 += arr.get(0);
                arr.remove(0);
            } else {
                s1 += arr.get(as - 1);
                arr.remove(as - 1);
            }
            if (arr.isEmpty()) {
                break;
            }
            as = arr.size();
            if (arr.get(0) >= arr.get(as - 1)) {
                s2 += arr.get(0);
                arr.remove(0);
            } else {
                s2 += arr.get(as - 1);
                arr.remove(as - 1);
            }
        }
        pw.println(s1 + ":" + s2);
        pw.flush();
    }
}