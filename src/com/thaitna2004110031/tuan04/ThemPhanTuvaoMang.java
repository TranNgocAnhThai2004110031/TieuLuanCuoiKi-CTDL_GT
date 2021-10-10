package com.thaitna2004110031.tuan04;

import java.util.Arrays;

import java.util.Scanner; 

public class ThemPhanTuvaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int [] mang = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", + (i+1));
            mang[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(mang));
        System.out.print("Thêm phần tử vào mảng: ");
        int t = sc.nextInt();
        System.out.printf("\nChèn phần tử %d vào mảng.", t);
        //mang = ;

        System.out.println("\nMảng sau khi chèn: " + Arrays.toString(mang));
        
        
    }
}
