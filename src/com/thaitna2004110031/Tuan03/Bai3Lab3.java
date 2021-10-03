package com.thaitna2004110031.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3Lab3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        double [] a = new double [n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", + (i+1));
            a[i] = sc.nextDouble();
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(a));

        System.out.println("=====Duyệt mảng=====");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
