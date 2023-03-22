package com.panyexiong.code_exercise.niuke;

import java.util.Scanner;

public class Nk_HJ106 {
    /**
     * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcb(a, b, a));
    }

    private static int gcb(int a, int b, int c) {
        if (a%b != 0) {
            return gcb(a+c, b, c);
        }
        return a;
    }
}
