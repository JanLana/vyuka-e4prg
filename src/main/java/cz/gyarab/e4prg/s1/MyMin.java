package cz.gyarab.e4prg.s1;

import java.util.Scanner;

public class MyMin {
    public static int min(int x, int y) {
        return x < y ? x : x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int i = min(x,y);
        System.out.println("Mensi z " + x  + " a " + y + " je " + i);
    }
}
