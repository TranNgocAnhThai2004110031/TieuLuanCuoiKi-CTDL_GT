package com.thaitna2004110031.tuan04;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        int n = mang.nextInt();
        SinhVien[] sinhVienList = new SinhVien[n];
        for (int i = 0; i < sinhVienList.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào sinh viên thứ " +(i+1) );
            System.out.print("Mã số sinh viên: ");
            int Mssv = sc.nextInt();
            System.out.print("Họ và tên: " );
            String hoVaTen = sc.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = sc.nextInt(); 
            System.out.print("Quê quán: ");
            String queQuan = sc.nextLine();
            mang.nextLine();
            sinhVienList[i] = new SinhVien(Mssv, hoVaTen, tuoi, queQuan);
        }

        System.out.println("==========In danh sách sinh viên sau khi nhập==========");
        for (SinhVien sinhvien : sinhVienList) {
           sinhvien.inThongTin();
        }
    }
    
}