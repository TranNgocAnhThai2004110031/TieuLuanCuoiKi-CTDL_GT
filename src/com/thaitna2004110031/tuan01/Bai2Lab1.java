package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai2Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
        double chieuRong = sc.nextDouble();
        double chuVi = (chieuDai + chieuRong)*2;
        double dienTich = chieuDai*chieuRong;
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + Math.min(chieuDai, chieuRong));
    }
    
}
