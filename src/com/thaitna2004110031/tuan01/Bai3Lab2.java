package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai3Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số điện sử dụng của tháng: ");
        int soDien = sc.nextInt();
        if (soDien > 0 && soDien <= 50) {
            System.out.printf("Tiền điện phải trả: %d đồng", soDien*1000);
        } else {
            System.out.printf("Tiền điện phải trả: %d đồng", 50*1000 + (soDien-50)*1200);
        }
    }
}
