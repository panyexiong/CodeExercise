package com.panyexiong.code_exercise.niuke;

import java.util.Arrays;
import java.util.Scanner;

//输入整型数组和排序标识，对其元素按照升序或降序进行排序
public class Nk_HJ101 {

    /**
     * 第一行输入数组元素个数
     * 第二行输入待排序的数组，每个数用空格隔开
     * 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Integer[] arr = new Integer[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int flag = scanner.nextInt();
        if (flag == 0) {
            Arrays.sort(arr);
        } else {
            Arrays.sort(arr, (o1, o2) -> o2 - o1);
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
