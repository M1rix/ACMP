package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

// time limit exception
public class A294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a = 0;
        int b = 0;
        int bolt = sc.nextInt();
        int lBolt = sc.nextInt();
        int pBolt = sc.nextInt();
        int S = 0;
        int gaika = sc.nextInt();
        int lGaika = sc.nextInt();
        int pGaika = sc.nextInt();

        int oBolt = 0;
        int oGaika = 0;

        int diff = 0;
        if (bolt > gaika) {
            a = bolt / 100 * lBolt;
            b = gaika / 100 * lGaika;
            oBolt = bolt - a;
            oGaika = gaika - b;
            if (oBolt > oGaika)
                diff = (oBolt - oGaika) * pBolt;
            if (oBolt < oGaika)
                diff = (oGaika - oBolt) * pGaika;
            S += (a * pBolt + b * pGaika) + diff;

        }

        if (gaika > bolt) {
            a = bolt / 100 * lBolt;
            b = gaika / 100 * lGaika;
            oBolt = bolt - a;
            oGaika = gaika - b;
            if (oBolt > oGaika)
                diff = (oBolt - oGaika) * pBolt;
            if (oBolt < oGaika)
                diff = (oGaika - oBolt) * pGaika;
            S += (a * pBolt + b * pGaika) + diff;

        }
        if (bolt == gaika) {
            a = bolt / 100 * lBolt;
            b = gaika / 100 * lGaika;
            S += (a * pBolt + b * pGaika);
        }
        pw.println(S);
        pw.flush();

    }
}
