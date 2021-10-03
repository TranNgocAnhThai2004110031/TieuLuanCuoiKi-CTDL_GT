package com.thaitna2004110031.tuan04;

import java.util.Scanner;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số tài khoản: ");
        int n = mang.nextInt();
        TaiKhoan[] taiKhoanList = new TaiKhoan[n];
        for (int i = 0; i < taiKhoanList.length; i++) {
            System.out.println("Nhập vào thông tin tài khoản thứ " +(i+1) );
            System.out.print("Tên chủ tài khoản: ");
            String tenChutaiKhoan = mang.nextLine();
            System.out.print("Số tài khoản: " );
            int soTaiKhoan = mang.nextInt();
            System.out.print("Số dư tài khoản: ");
            double soDuTaiKhoan = mang.nextDouble();
            mang.nextLine();
            taiKhoanList[i] = new TaiKhoan(tenChutaiKhoan, soTaiKhoan, soDuTaiKhoan);
        }

        System.out.println("==========In danh sách tài khoản sau khi nhập==========");
        for (TaiKhoan tk : taiKhoanList) {
           tk.inThongTin();
        }
    }
}
