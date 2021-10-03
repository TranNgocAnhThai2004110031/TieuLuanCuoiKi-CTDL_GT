package com.thaitna2004110031.tuan01vatuan02;

import java.util.Scanner;

public class Bai4Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập hệ số a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("Căn của Delta: %.3f", Math.sqrt(delta));
    }
}
