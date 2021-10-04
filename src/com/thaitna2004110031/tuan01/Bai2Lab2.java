package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai2Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a, b, c của phương trình ax^2 + bx + c = 0: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phương trình có vô số nghiệm!");
                } else {
                    System.out.println("Phương trình vô nghiệm!!!");
                }
            } else {
                System.out.println("Phương trình có 1 nghiệm x = " + -c/b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4*a*c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!!!");
            }
            else if (delta == 0) {
                System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", -b/2*a);
            }
            else{
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                System.out.printf("x1 = %.2f", ( -b + Math.sqrt(delta))/(2*a));
                System.out.printf(" x2 = %.2f", +( -b - Math.sqrt(delta))/(2*a));
            }
        }
    }
}
