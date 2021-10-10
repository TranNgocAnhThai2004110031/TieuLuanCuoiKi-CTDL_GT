package com.thaitna2004110031.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Lab4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        ArrayList<Double> a = new ArrayList<>();
        while(true){ 
            for (int i = 0; i < n ; i++) {
                Scanner d = new Scanner(System.in);
                System.out.printf("Nhập số thực thứ %d: " ,i+1); 
                Double x = sc.nextDouble(); 
                a.add(x);
            } 
            if(sc.nextLine().isEmpty()){ 
                break; 
            } 
        } 
        /*for (int i = 0; i < n ; i++) {
            System.out.printf("Nhập số thực thứ %d: " ,i+1); 
            Double x = sc.nextDouble(); 
            a.add(x); 
        }*/
        System.out.println("==========Các số thực sau khi nhập==========");
        double tong = 0;
        for (double b : a) {
            System.out.println(b);
            tong += b;
        }
        System.out.println("Tổng các số thực: " + tong);
    }
}
