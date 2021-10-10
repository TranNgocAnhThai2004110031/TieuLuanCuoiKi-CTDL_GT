package com.thaitna2004110031.tuan3;

import java.util.Scanner;

public class Bai4Lab3 {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        int n = mang.nextInt();
        SinhVienBai4Lab3[] danhSachSinhVien = new SinhVienBai4Lab3[n];
        for (int i = 0; i < n /*danhSachSinhVien.length*/; i++) {
            System.out.println("Nhập vào sinh viên thứ " + (i+1) );
            System.out.print("Tên sinh viên: " );
            String tenSinhVien = mang.nextLine();
            System.out.print("Điểm: ");
            double diem = mang.nextDouble();
            danhSachSinhVien[i] = new SinhVienBai4Lab3(tenSinhVien, diem);
        }
        for (SinhVienBai4Lab3 dssv: danhSachSinhVien) {
            dssv.inThongTin();
        }
    }
}
