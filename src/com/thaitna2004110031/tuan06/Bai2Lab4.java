package com.thaitna2004110031.tuan06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
 
public class Bai2Lab4{
    private ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Bai2Lab4 ds = new Bai2Lab4();
        ds.hienthimenu();
    }
    //phương thức nhập dữ liệu
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng họ và tên: ");
        int n = sc.nextInt();
        while(true){ 
            for (int i = 0; i < n ; i++) {
                Scanner d = new Scanner(System.in);
                System.out.printf("Nhập họ và tên thứ %d: " ,i+1); 
                String x = d.nextLine(); 
                list.add(x);
            } 
            if(sc.nextLine().isEmpty()){ 
                break; 
            } 
        }
     }   
    //phương thức xuất dữ liệu
    public void xuat() {
        System.out.println("==========Danh sách họ và tên==========");
        for (String b : list) {
            System.out.println("Họ và tên: " + b);
        }
    }  
    //phương thức xuất ngẩu nhiên
    public void xuatNgauNhien() {
          Collections.shuffle(list);
          xuat();
    }
    //sắp xếp theo thứ tự giảm dần
    public void sapXep() {
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }
    //phương thức tìm và xóa 
    public void timVaXoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên cần tìm và xóa: ");
        String hoVaTen = sc.nextLine();
         
        for(String item : list){
            if (item.equals(hoVaTen)){
                list.remove(item);
                break;
            }
        }
        System.out.println(hoVaTen + " Đã được xóa khỏi danh sách.");
        xuat();
    }
        
    //phương thức hiện thị menu
    public void hienthimenu() {
        Scanner sc = new Scanner(System.in);
    do{
        System.out.println("=========================Menu=========================");
        System.out.println("1. Nhập danh sách họ và tên.");
        System.out.println("2. Hiển thị danh sách họ và tên vừa nhập.");
        System.out.println("3. Hiển thị danh sách họ và tên ngẫu nhiên.");
        System.out.println("4. Sắp xếp danh sách sinh viên.");
        System.out.println("5. Tìm và xóa họ và tên trong danh sách.");
        System.out.println("0. Thoát.");
        System.out.print("Lựa chọn của bạn: ");
        int luaChon = sc.nextInt();

        switch(luaChon){
            case 0:
                 System.exit(0);
                 break;
            case 1:
                 nhap();
                 break;
            case 2:
                 xuat();
                 break;
            case 3:
                 xuatNgauNhien();
                 break;
            case 4:
                 sapXep();
                 break;
            case 5:
                 timVaXoa();
                 break;
        }
      } while (true);
    }   
    
}

