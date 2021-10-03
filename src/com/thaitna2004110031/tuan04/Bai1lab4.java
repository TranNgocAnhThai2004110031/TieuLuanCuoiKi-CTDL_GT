package com.thaitna2004110031.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Nhập số lượng phần tử: ");
       // int n = sc.nextInt();
        ArrayList<Double> list = new ArrayList<Double>();
        //for (int i = 0; i < n; i++) {
            //list.add(i);
        //}

        while(true){ 

            Double x = sc.nextDouble(); 
            list.add(x); 
            System.out.print("Nhập thêm (Y/N)? "); 
            if(sc.nextLine().equals(list)){ 
               break; 
            } 
        } 
        System.out.println("Các phần tử có trong list là: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
