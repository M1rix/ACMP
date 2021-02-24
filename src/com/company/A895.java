package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class A895 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        char[][] a = new char[3][3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.next().toCharArray();
        }
        boolean state = false;
        boolean draw = false;
        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        //row
        if (
                a[0][0] == 'X' &&
                        a[0][1] == 'X' &&
                        a[0][2] == 'X'
        ){
            pw.println("Win");
            pw.flush();
            return;
        }
        if (
                a[1][0] == 'X' &&
                        a[1][1] == 'X' &&
                        a[1][2] == 'X'
        ){
            pw.println("Win");
            pw.flush();
            return;
        }
        if (
                a[2][0] == 'X' &&
                        a[2][1] == 'X' &&
                        a[2][2] == 'X'
        ){
            pw.println("Win");
            pw.flush();
            return;
        }
        //column
        if (
                a[0][0] == 'X' &&
                        a[1][0] == 'X' &&
                        a[2][0] == 'X'
        ) {
            pw.println("Win");
            pw.flush();
            return;
        }
        if (
                a[0][1] == 'X' &&
                        a[1][1] == 'X' &&
                        a[2][1] == 'X'
        ){
            pw.println("Win");
            pw.flush();
            return;
        }
        if (
                a[0][2] == 'X' &&
                        a[1][2] == 'X' &&
                        a[2][2] == 'X'
        ){
            pw.println("Win");
            pw.flush();
            return;
        }
        //diagonal
        if (
                a[0][0] == 'X' &&
                        a[1][1] == 'X' &&
                        a[2][2] == 'X'
        ){
            pw.println("Win");
            pw.flush();
            return;
        }
        if (
                a[0][2] == 'X' &&
                        a[1][1] == 'X' &&
                        a[2][0] == 'X'
        ) {
            pw.println("Win");
            pw.flush();
            return;
        }
        //OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

        //row
        if (
                a[0][0] == 'O' &&
                        a[0][1] == 'O' &&
                        a[0][2] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        if (
                a[1][0] == 'O' &&
                        a[1][1] == 'O' &&
                        a[1][2] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        if (
                a[2][0] == 'O' &&
                        a[2][1] == 'O' &&
                        a[2][2] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        //column
        if (
                a[0][0] == 'O' &&
                        a[1][0] == 'O' &&
                        a[2][0] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        if (
                a[0][1] == 'O' &&
                        a[1][1] == 'O' &&
                        a[2][1] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        if (
                a[0][2] == 'O' &&
                        a[1][2] == 'O' &&
                        a[2][2] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        //diagonal
        if (
                a[0][0] == 'O' &&
                        a[1][1] == 'O' &&
                        a[2][2] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        if (
                a[0][2] == 'O' &&
                        a[1][1] == 'O' &&
                        a[2][0] == 'O'
        ){
            pw.println("Lose");
            pw.flush();
            return;
        }
        else {
            pw.println("Draw");
            pw.flush();
            return;
        }
    }
}
