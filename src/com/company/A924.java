package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        char[][] a = new char[4][4];
        for (int i = 0; i < 4; i++) {
            char[] c = sc.next().toCharArray();
            for (int j = 0; j < 4; j++) {
                a[i][j] = c[j];
            }
        }
        char w = 'W';
        char b = 'B';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == a[i][j + 1] &&
                        a[i][j] == a[i + 1][j] &&
                        a[i][j] == a[i + 1][j + 1]) {
                    pw.println("NO");
                    pw.flush();
                    return;
                } else {
                    pw.println("YES");
                    pw.flush();
                    return;
                }
            }
        }
    }
}
//        if(
//                (a[0][0] == w &&
//                        a[1][0] == w &&
//                        a[0][1] == w &&
//                        a[1][1] == w)
//                        ||
//                        (a[0][0] == b &&
//                                a[1][0] == b &&
//                                a[0][1] == b &&
//                                a[1][1] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[0][1] == w &&
//                        a[1][1] == w &&
//                        a[0][2] == w &&
//                        a[1][2] == w)
//                        ||
//                        (a[0][1] == b &&
//                                a[1][1] == b &&
//                                a[0][2] == b &&
//                                a[1][2] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[0][2] == w &&
//                        a[1][2] == w &&
//                        a[0][3] == w &&
//                        a[1][3] == w)
//                        ||
//                        (a[0][2] == b &&
//                                a[1][2] == b &&
//                                a[0][3] == b &&
//                                a[1][3] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[1][0] == w &&
//                        a[1][1] == w &&
//                        a[2][0] == w &&
//                        a[2][1] == w)
//                        ||
//                        (a[1][0] == b &&
//                                a[1][1] == b &&
//                                a[2][0] == b &&
//                                a[2][1] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[1][1] == w &&
//                        a[1][2] == w &&
//                        a[2][1] == w &&
//                        a[2][2] == w)
//                        ||
//                        (a[1][1] == b &&
//                                a[1][2] == b &&
//                                a[2][1] == b &&
//                                a[2][2] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[1][2] == w &&
//                        a[1][3] == w &&
//                        a[2][2] == w &&
//                        a[2][3] == w)
//                        ||
//                        (a[1][2] == b &&
//                                a[1][3] == b &&
//                                a[2][2] == b &&
//                                a[2][3] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[2][0] == w &&
//                        a[2][1] == w &&
//                        a[3][0] == w &&
//                        a[3][1] == w)
//                        ||
//                        (a[2][0] == b &&
//                                a[2][1] == b &&
//                                a[3][0] == b &&
//                                a[3][1] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[2][1] == w &&
//                        a[2][2] == w &&
//                        a[3][1] == w &&
//                        a[3][2] == w)
//                        ||
//                        (a[2][1] == b &&
//                                a[2][2] == b &&
//                                a[3][1] == b &&
//                                a[3][2] == b)
//        ) {
//            pw.println("NO");
//            pw.flush();
//            return;
//        }
//        if(
//                (a[2][2] == w &&
//                        a[2][3] == w &&
//                        a[3][2] == w &&
//                        a[3][3] == w)
//                        ||
//                        (a[2][2] == b &&
//                                a[2][3] == b &&
//                                a[3][2] == b &&
//                                a[3][3] == b)
//        ) {

