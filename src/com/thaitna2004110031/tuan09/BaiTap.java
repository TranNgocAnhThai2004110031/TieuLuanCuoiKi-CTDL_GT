package com.thaitna2004110031.tuan09;

import java.util.LinkedList;
import java.util.Scanner;

public class BaiTap {
    Apple head = null;
    Apple tail = null;
    int ma;
    double khoiLuong;
    String mauSac;
    private LinkedList<Apple> list = new LinkedList<>();   
    
    public void add(){
        Apple newNode = new Apple(ma, khoiLuong, mauSac);
        if (head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
       
    }
    public void themTaoVaoKho() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng táo thêm vào kho: ");
        int n = sc.nextInt();
        while(true){ 
            for (int i = 0; i < n ; i++) {
                Scanner nhap = new Scanner(System.in);
                Scanner m = new Scanner(System.in);
                System.out.println("Nhập thông tin táo thứ "+ (i+1));
                System.out.printf("Mã: " ,i+1); 
                int ma = nhap.nextInt(); 
                System.out.print("Khối lượng: ");
                double khoiLuong = nhap.nextDouble();
                System.out.print("Màu sắc: ");
                String mauSac = m.nextLine();
                list.add(new Apple(ma, khoiLuong, mauSac));
            } 
            if(sc.nextLine().isEmpty()){ 
                break; 
            } 
        }
    }

    public void selectionSort() {
        Apple sx = null;
        for (Apple tao : list) {
            double a[] = {tao.getkhoiLuong()};
            for(int i = 0; i < a.length - 1; i++){
                int index = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < a[index]) {
                        index = j;
                    }
                    double smallerNumber = a[index];
                    a[index] = a[i];
                    a[i] = smallerNumber;
                }
            }
            tao = sx;
            
        }        
        System.out.println("\nDanh sách táo được sắp xếp tăng dần: ");
        sx.inThongTin();            
    }

    public void selectionSortGiam() {
        Apple sx = null;
        for (Apple tao : list) {
            double a[] = {tao.getkhoiLuong()};
            for(int i = 0; i < a.length - 1; i++){
                int index = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] > a[index]) {
                        index = j;
                    }
                    double smallerNumber = a[index];
                    a[index] = a[i];
                    a[i] = smallerNumber;
                }
            }
            sx = tao;
        }        
        System.out.println("\nDanh sách táo được sắp xếp giảm dần: ");
        sx.inThongTin();            
    }

    public void bubbleSort() {
        Apple sx = null;
        for (Apple tao : list) {
            double a[] = {tao.getkhoiLuong()};
            int n = a.length;
            double temp = 0;
            for(int i = 0; i < n; i++){
                for (int j = 1; j < n - i; j++) {
                    if (a[j-1] > a[j]) {
                        temp = a[j-1];
                        a[j-1] = a[j];
                        a[j] = temp;
                    }
                }
                sx = tao;
            }
            
        } 
        System.out.println("\nDanh sách táo được sắp xếp tăng dần: ");
        sx.inThongTin();              
    }

    public void bubbleSortGiam() {
        Apple sx = null;
        for (Apple tao : list) {
            double a[] = {tao.getkhoiLuong()};
            int n = a.length;
            double temp = 0;
            for(int i = 0; i < n; i++){
                for (int j = 1; j < n - i; j++) {
                    if (a[j-1] < a[j]) {
                        temp = a[j-1];
                        a[j-1] = a[j];
                        a[j] = temp;
                    }
                }
                sx = tao;
            }
            
        } 
        System.out.println("\nDanh sách táo được sắp xếp giảm dần: ");
        sx.inThongTin();              
    }

    public void intertionsort() {
        Apple sx = null;
        for (Apple tao : list) {
            double a[] = {tao.getkhoiLuong()};
            int n =a.length;
            for (int i = 1; i < n; ++i) {
                double key = a[i];
                int j = i - 1;

                while (j >= 0 && a[j] > key) {
                    a[j+1] = a[j];
                    j = j-1;
                }
                a[j+1] = key;
            }
            sx = tao;
        }        
        System.out.println("\nDanh sách táo được sắp xếp tăng dần: ");
        sx.inThongTin();            
    }

    public void intertionsortGiam() {
        Apple sx = null;
        for (Apple tao : list) {
            double a[] = {tao.getkhoiLuong()};
            int n =a.length;
            for (int i = 1; i < n; ++i) {
                double key = a[i];
                int j = i - 1;

                while (j >= 0 && a[j] < key) {
                    a[j+1] = a[j];
                    j = j-1;
                }
                a[j+1] = key;
            }
            sx = tao;
        }        
        System.out.println("\nDanh sách táo được sắp xếp tăng dần: ");
        sx.inThongTin();            
    }

    public void print(){
        Apple current = head;
        if (head==null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Danh sách táo: ");
        System.out.println("Mã"  +"\t"+"Khối lượng "  +"\t" +"Màu sắc " );
        while(current!=null){            
            current.inThongTin();
            current = current.next;
        }
    }

    public void xuat(){
        System.out.println("=====Danh sách táo=====");
        System.out.println("Mã: "  +"\t"+"Khối lượng: "  +"\t" +"Màu sắc: " );
        for (Apple a : list) {
            a.inThongTin();
        }
    } 

    public void timTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã táo cần tìm: ");
        int ma = sc.nextInt();
        Apple found = null;
        for(Apple svdv : list){
            if(svdv.getma()==ma){
                found = svdv;  
            }
        }
        if (found!=null) {
            System.out.println("=====Danh sách táo cần tìm kiếm là=====");
            found.inThongTin(); 
        } else {
            System.out.println("Màu táo cần tìm không có trong danh sách!!!");
        }
        
    }

    public void timTheoKhoiLuong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập khối táo cần tìm: ");
        double khoiLuong = sc.nextDouble();
        Apple found = null;
        for(Apple svdv : list){
            if(svdv.getkhoiLuong()==khoiLuong){
                found = svdv;  
            }
        }
        if (found!=null) {
            System.out.println("=====Danh sách táo cần tìm kiếm là=====");
            found.inThongTin(); 
        } else {
            System.out.println("Khối lượng táo cần tìm không có trong danh sách!!!");
        }
        
    }

    public void timTheoMau() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu táo cần tìm: ");
        String mauSac = sc.nextLine();
        Apple found = null;
        for(Apple svdv : list){
            if(svdv.getmauSac().equals(mauSac)){
                found = svdv;  
            }
        }
        if (found!=null) {
            System.out.println("=====Danh sách táo cần tìm kiếm là=====");
            found.inThongTin(); 
        } else {
            System.out.println("Màu táo cần tìm không có trong danh sách!!!");
        }
        
    }   

    public void menu(){
        do{
            System.out.println("=======================MENU======================");
            System.out.println("1. Nhập danh sách táo.");
            System.out.println("2. Tìm táo theo mã táo.");
            System.out.println("3. Tìm táo theo khối lượng.");
            System.out.println("4. Tìm táo theo màu sắc.");
            System.out.println("5. Sắp xếp táo tăng dần theo khiểu Selection Sort.");
            System.out.println("6. Sắp xếp táo giảm dần theo khiểu Selection Sort.");
            System.out.println("7. Sắp xếp táo tăng dần theo khiểu Bubble Sort.");
            System.out.println("8. Sắp xếp táo giảm dần theo khiểu Bubble Sort.");
            System.out.println("9. Sắp xếp táo tăng dần theo khiểu Insertion Sort.");
            System.out.println("10. Sắp xếp táo giảm dần theo khiểu Insertion Sort.");
            System.out.println("11. Thoát.");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();

            switch(luaChon){
                case 1:
                     themTaoVaoKho();;
                     break;
                case 2:
                     timTheoMa();
                     break;
                case 3:
                     timTheoKhoiLuong();
                     break;
                case 4:
                     timTheoMau();
                     break;
                case 5:
                     selectionSort();
                     break;
                case 6:
                     selectionSortGiam();
                     break;
                case 7:
                     bubbleSort();
                     break;
                case 8:
                     bubbleSortGiam();
                     break;
                case 9:
                     intertionsort();
                     break;
                case 10:
                     intertionsortGiam();
                     break;
                case 11:
                     System.exit(0);
            default:
                 System.out.println("Nhập không đúng !!!");
                 
            }

        }while(true);
    }
}
