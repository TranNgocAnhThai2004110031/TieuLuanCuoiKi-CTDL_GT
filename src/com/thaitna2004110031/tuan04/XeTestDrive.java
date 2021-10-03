package com.thaitna2004110031.tuan04;

import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        Scanner mang = new Scanner(System.in);
        System.out.print("Nhập vào số lượng xe: ");
        int n = mang.nextInt();
        Xe[] xeList = new Xe[n];
        for (int i = 0; i < xeList.length; i++) {
            System.out.println("Nhập vào thông tin xe thứ " +(i+1) );
            System.out.print("Tên chủ xe: ");
            String tenChuXe = mang.nextLine();
            System.out.print("Hãng sản xuất: " );
            String hangSanXuat = mang.nextLine();
            System.out.print("Dòng: ");
            String dong = mang.nextLine();
            System.out.print("Giấy phép: ");
            String giayPhep = mang.nextLine();
            System.out.print("Dung tích xăng: ");
            double dungTichXang = mang.nextDouble();
            mang.nextLine();
            xeList[i] = new Xe(tenChuXe, hangSanXuat, dong, giayPhep, dungTichXang);
        }

        System.out.println("==========In danh sách xe sau khi nhập==========");
        for (Xe xe : xeList) {
           xe.inThongTin();
        }
    }
}
