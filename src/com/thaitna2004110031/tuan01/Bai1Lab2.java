package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai1Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào hệ số a, b của phương trình ax + b = 0: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình vô số nghiệm!");
            }
            System.out.println("Phương trình vô nghiệm!!!");
        } else {
            System.out.println("Phương trình có nghiệm x = " + -b/a);
        }
    }
}
