package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai1lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ và tên: "); 
        String hoVaTen = sc.nextLine();
        System.out.print("Điểm TB: "); 
        double diemTB = sc.nextDouble(); 
        System.out.printf("%s %.2f điểm", hoVaTen, diemTB); 
    }
}
