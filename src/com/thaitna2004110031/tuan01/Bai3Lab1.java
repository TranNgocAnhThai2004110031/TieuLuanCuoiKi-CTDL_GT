package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai3Lab1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào cạnh của khối lập phương: ");
        double canh = sc.nextDouble();
        System.out.println("Thể tích cảu khối lập phương: " + Math.pow(canh, 3));
      } 
}
