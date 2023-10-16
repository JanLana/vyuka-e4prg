package cz.gyarab.e4prg.s2;

import java.util.Scanner;

public class MyMin {
    public static int min(int x, int y) {
        return x < y ? x : x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int a = min(x, y);
        int b = min(a, z);

        System.out.println(b);

    }
}