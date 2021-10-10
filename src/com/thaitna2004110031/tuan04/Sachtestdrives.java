package com.thaitna2004110031.tuan04;

import java.util.Scanner;

public class Sachtestdrives {
    public static void main(String[] args) { 
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sách: ");
        int n = mang.nextInt();
        Sach[] sachList = new Sach[n];
        for (int i = 0; i < sachList.length; i++) {
            System.out.println("Nhập vào thông tin sách thứ " + (i+1));
            System.out.print("Giá: ");
            double gia = mang.nextDouble();
            System.out.print("Nhà sản xuấ: ");
            String nhaSanXuat = mang.nextLine();
            System.out.print("Năm sản xuất: "); 
            int namSanXuat = mang.nextInt();
            System.out.print("Số lượng: ");
            int soLuong = mang.nextInt();
            System.out.print("Giá bán: ");
            double giaBan =mang.nextDouble();
            System.out.print("Loại: ");
            String loai = mang.nextLine();
            mang.nextLine();
            sachList[i] = new Sach(gia, nhaSanXuat, namSanXuat, soLuong, giaBan, loai);
        }
        System.out.println("==========In danh sách sách sau khi nhập=========");
        for (Sach sach : sachList) {
            sach.inThongTin();
        }
    }
}
