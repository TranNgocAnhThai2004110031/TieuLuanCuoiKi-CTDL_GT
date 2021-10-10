package com.thaitna2004110031.tuan04;

import java.util.Scanner;
 
public class NhanVienTestDrive {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng nhân viên: ");
        int n = mang.nextInt();
        NhanVien[] nhanvienList = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào thông tin nhân viên thứ " + (i+1));
            System.out.print("Tên nhân viên: ");
            String tenNhanVien = sc.nextLine();
            System.out.print("Lương: ");
            double luong = sc.nextDouble();
            System.out.print("Địa chỉ: "); 
            String diaChi = sc.nextLine();
            System.out.print("Bộ phận làm việc: ");
            String boPhanLamViec = sc.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaysinh = sc.nextLine();
            sc.nextLine();
            nhanvienList[i] = new NhanVien(tenNhanVien, luong, diaChi, boPhanLamViec, ngaysinh);
        }
        System.out.println("==========In danh sách nhân viên sau khi nhập=========");
        for (NhanVien nv : nhanvienList) {
            nv.inThongTin();
        }
    }
}
