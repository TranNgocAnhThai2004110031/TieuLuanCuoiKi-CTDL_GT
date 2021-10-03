package com.thaitna2004110031.tuan04;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongmang {
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
        System.out.print("Nhập số nguyên k: ");
        int k = sc.nextInt();
        int i,c;
        for (c = i = 0; i < n; i++) {
            if (mang[i] != k) {
                mang[c] = mang[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
    for (i = 0; i < n; i++) {
        System.out.print(mang[i] + "\t");
    }

    }
}
