package com.thaitna2004110031.tuan3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3Lab3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = sc.nextInt(); 
        int [] mang = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", + (i+1));
            mang[i] = sc.nextInt();
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(mang));

        Arrays.sort(mang);
        System.out.println("Mảng được sắp xếp là: " + Arrays.toString(mang));

        int min = mang[0];
        for (int i = 0; i < n; i++){
            min = Math.min(min, mang[i]);
        } 
        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là: " + min);
        
        int tong = 0, dem =0;
        for (int i = 0; i < n; i++) {
            if (mang[i]%3==0) {
                tong = (tong + mang[i]);
                dem++;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3: " + tong/dem);
    }
}

