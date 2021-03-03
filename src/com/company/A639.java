package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class A639 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        ArrayList<Double> keys = new ArrayList<Double>();
        ArrayList<String> values = new ArrayList<String>();

        int rooms = sc.nextInt();
        int count = 0;
        for (int i = 0; i < rooms; i++) {
            int ppls = sc.nextInt();
            count += ppls;
            for (int j = 0; j < ppls; j++) {
                double k = sc.nextDouble();
                String v = sc.next();
                keys.add(k);
                values.add(v);
            }
        }
        for (int i = 0; i < keys.size(); i++) {
            for (int j = i; j < keys.size() - 1; j++) {
                double dTemp = 0;
                String sTemp = "";

                if (keys.get(i) < keys.get(j + 1)) {
                    dTemp = keys.get(i);
                    keys.set(i, keys.get(j + 1));
                    keys.set(j + 1, dTemp);

                    sTemp = values.get(i);
                    values.set(i, values.get(j + 1));
                    values.set(j + 1, sTemp);
                }
            }
        }
        pw.println(count);
        for (int i = 0; i < keys.size(); i++) {
            pw.format("%.2f %s\n", keys.get(i), values.get(i));
        }
        pw.flush();
    }
}
