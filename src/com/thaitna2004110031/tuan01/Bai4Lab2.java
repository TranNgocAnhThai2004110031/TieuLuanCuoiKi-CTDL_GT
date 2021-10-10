package com.thaitna2004110031.tuan01;

import java.util.Scanner;

public class Bai4Lab2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Bai1Lab2 bai1;
        Bai2Lab2 bai2;
        Bai3Lab2 bai3;
        for (;;) {
            System.out.println("===============Menu==============");
            System.out.println(" 1.  Giải phương trình bậc I");
            System.out.println(" 2.  Giải phương trình bậc II");
            System.out.println(" 3.  Tính tiền điện của tháng");
            System.out.println(" 0.  Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            int luaChon = sc.nextInt();
            switch(luaChon){
            
                case 0: 
                      break;
                case 1: 
                     //bai1(); 
                     break;
                case 2: 
                     //bai2(); 
                     break;
                case 3: 
                     //bai1(); 
                     break;
                default: 
                     System.out.println("Sai cú pháp!!!"); 
                     break;
            }
       /* if (luaChon==1) {
            bai1();
        } 
        else if(luaChon==2){
            bai2();
        }
        else if (luaChon==3) {
            bai3();
        } else {
            System.exit(0);
        }*/
        }
    }
}
