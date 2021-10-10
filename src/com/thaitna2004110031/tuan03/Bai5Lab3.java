package com.thaitna2004110031.tuan03;

import java.util.Scanner;

public class Bai5Lab3 {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        int n = mang.nextInt();
        SinhVien[] danhSachSinhVien = new SinhVien[n];
        System.out.println("Nhập danh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào sinh viên thứ" +(i+1) );
            System.out.print("Mã số sinh viên: ");
            int Mssv = mang.nextInt();
            System.out.print("Tên sinh viên: " );
            String hoVaTen = mang.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = mang.nextInt();
            System.out.print("Quê quán: ");
            String queQuan = mang.nextLine();
            danhSachSinhVien[i] = new SinhVien(Mssv, hoVaTen, tuoi, queQuan);
        }

        System.out.println("=====Danh sách sinh viên sau khi nhập=====");
        for (SinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
        }
    }
}
