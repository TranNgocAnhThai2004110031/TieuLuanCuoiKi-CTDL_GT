package com.thaitna2004110031.tuan04;

import java.util.Scanner;

public class MayTinhTestDrive { 
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng máy tính: ");
        int n = mang.nextInt();
        MayTinh[] mayTinhList = new MayTinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào thông tin máy tính thứ " + (i+1));
            System.out.print("Nhà sản xuất: ");
            String nhaSanXuat = mang.nextLine();
            System.out.print("Năm sản xuất: ");
            int namSanXuat = mang.nextInt();
            System.out.print("Hệ điều hành: "); 
            String heDieuHanh = mang.nextLine();
            System.out.print("RAM(GB): ");
            int ram = mang.nextInt();
            System.out.print("CPU: ");
            String cpu = mang.nextLine();
            System.out.print("Giá: ");
            double gia = mang.nextDouble();
            System.out.print("Năm bảo hành: ");
            int namBaoHanh = mang.nextInt();
            mang.nextLine();
            mayTinhList[i] = new MayTinh(nhaSanXuat, namSanXuat, heDieuHanh, ram, cpu, gia, namBaoHanh);
        }
        System.out.println("==========In danh sách máy tính sau khi nhập=========");
        for (MayTinh maytinh : mayTinhList) {
            maytinh.inThongTin();
        }
    }
}
