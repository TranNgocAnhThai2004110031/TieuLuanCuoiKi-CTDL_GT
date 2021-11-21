package com.thaitna2004110031.thicuoiky;

import java.util.Date;
import java.util.Scanner;

public class QuanLyHangHoa {
    Node head = null;
    Node tail = null;
    KhoHang khoHang;
    Scanner sc = new Scanner(System.in);
    public QuanLyHangHoa(){

    }
    boolean isEmpty(){
        boolean empty =true;
        if (head == null) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    public void add(String loai, int maHang, String tenHangHoa, double giaNhap, int soLuongTonKho){ //, Date ngayNhapKho
        KhoHang khoHang = new KhoHang(loai, maHang, tenHangHoa, giaNhap, soLuongTonKho);
        Node newNode = new Node(khoHang); 
        if (head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
        return;
    }
    
    public void themDau(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhap();
        if (isEmpty()==true) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head  = newNode;            
        }
    }
    //thêm cuối

    public void themCuoi(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhap();
        if (isEmpty()==true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
    }
    //tìm theo mã
    Node timTheoMa(int ma) {
        Node node = null;
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {
            Node current;
            current = head;
            while (current!=null) {
                if (current.data.maHang == ma) {
                    node = current;
                }
                current = current.next;
            }
        }
        return node;
    }
    //thêm vào trướcmã
    public void themTruocMa() {
        // Node node = null;
        KhoHang khoHang = new KhoHang();
        Node preNode = null;
        Node current = head;
        System.out.print("Nhập mã hàng hóa cần thêm trước: ");
        int maHang = sc.nextInt();
                        
        if (isEmpty()==false) {
            if (head.data.maHang == maHang) {
                themDau();
                return;
            }
            while (current != null) {
                preNode = current;
                if (current.data.maHang == maHang) {//node == current
                   Node newNode = new Node(khoHang);
                   newNode.data.nhap();
                   preNode.next = newNode;
                   newNode.next = current;
                   return;
                }
                current = current.next;
                return;
            }
        }else{
            System.out.println("Danh sách rỗng!!!");
        }
        
    } 
    public void addPreNode2(){

        // Node node = null;
         KhoHang khoHang = new KhoHang();
         Node preNode;
         Scanner sc= new Scanner(System.in);
         System.out.print("nhap id: ");
         int id = sc.nextInt();
         if (isEmpty()==false) {
             
             Node current;
             current = head;
 
             if(head.data.maHang == id){
                 themDau();
                 return;
             }
             
             while(current != null){
                 preNode = current;
                 //ddang tim
                 if(current.data.maHang == id){
                    Node newNode = new Node(khoHang);//nust moi
                    newNode.data.nhap();
                    preNode.next = newNode;
                    newNode.next = current;
                    return;
                 }
                 current = current.next;

             }
            //  return;
 
         } else {
             System.out.println("List is empty!");            
         }
     }
    public void addPreNode(){

        // Node node = null;

        KhoHang khoHang = new KhoHang();
        Node preNode;
        System.out.print("Nhập mã hàng hóa cần thêm trước: ");
        int ma = sc.nextInt(); 
         if (isEmpty()) {
             System.out.println("List is empty!");
         } else {
 
             Node current;
             current = head;
 
             if(head.data.maHang == ma){
                themDau();
             }
             
             while(current.next != null){
 
                 preNode = current;
                 //ddang tim
                 if(current.data.maHang == ma){
                     //node = current;
 
                     Node newNode = new Node(khoHang);
                     newNode.data.nhap();
                     preNode.next = newNode;
                     newNode.next = current;
                 }
                 current = current.next;
             }
 
         }
     }
    // void Xoa(int Id) {
    //     if (true == tim(Id)) {
    //         if (current == head) {
    //             xoaHead();
    //         } else if (current == tail) {
    //             xoaTail();
    //         } else {
    //             xoaGiua();
    //         }
    //     } else {
    //         System.out.println("Không tìm thấy");
    //     }
    // }
    Node find(int key) { // Hàm tìm kiếm một phần tử có trong linkedlist không 
        Node current = head;
        if(head.data.maHang == key){
            return head;
        }
        while (current != null) {
            if (key == current.next.data.maHang)
                return current;
            current = current.next;
        }
        return null;
    }

    public void addPreivous(){
        KhoHang book = new KhoHang();
        Node NewBook = new Node(book);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng hóa cần thêm trước: ");
        int key = sc.nextInt();
        if(find(key) == null){
            return;
        }
        Node temp = find(NewBook.data.maHang);
            
        NewBook.data.nhap();
        NewBook.next = temp.next;
        temp.next = NewBook;
    }
    public void xoaDau() { //Hàm xoá đầu
        if(head == null){
            System.out.println("Danh sách rỗng!");
            return;
        }
        head = head.next;
    }

    void xoaCuoi(){
        if (isEmpty()) {
            
        }
        Node temp;
        temp = head;
        while (temp !=null) {
           if (temp.next == tail) {
               tail = temp;
               tail.next = null;
           } 
           temp = temp.next;
        }
    }

    public void xoaTheoMa() {
        Node node = null;
        Node preNode;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng hóa cần xóa trước: ");
        int ma = sc.nextInt();
        if (head.data.maHang==ma) {
            xoaDau();
        }
        Node current;
        current = head;
        while (current.next != null) {
            preNode = current;
            if (current.data.maHang == ma) {
                
                preNode.next = current.next.next;
                
            }
            current = current.next;
        }
    }
    void loai(String loaiCanTim){
        
    }
    void timTheoLoai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loại hàng hóa cần tìm: ");
        String loaiCanTim = sc.nextLine();
        Node current = head;
        while(current != null){
            if(current.data.loai.equals(loaiCanTim)){
                System.out.println("Loại hàng hóa cần tìm cần tìm: ");
                current.data.inThongTin();               
            }
            current = current.next;
        }
        System.out.println("Không có loại hàng hóa cần tìm.");
    }

    void timTheoGia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá hàng hóa cần tìm: ");
        double giaCanTim = sc.nextDouble();
        Node current = head;
        while(current != null){
            if(current.data.giaNhap == giaCanTim){
                System.out.println("Giá hàng hóa cần tìm cần tìm: ");
                current.data.inThongTin();                
            }
            current = current.next;
        }
        System.out.println("Không có giá hàng hóa cần tìm.");
    }

    void timTheoGiaKhoan(){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Nhập giá hàng hóa cần tìm");
        System.out.print("Giá từ: ");
        double giaBe = sc.nextDouble();
        System.out.print("Đến giá: ");
        double giaLon = sc.nextDouble();
        Node current = head;
        System.out.println("Giá hàng hóa cần tìm: ");
        while(current != null){
            if(giaBe <= current.data.giaNhap && current.data.giaNhap <= giaLon){                
                current.data.inThongTin();
            }
            current = current.next;
        }
        System.out.println("Không có giá hàng hóa cần tìm.");
    }
    public boolean tim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng hóa cần sửa: ");
        int ma = sc.nextInt();
        if (head.data.maHang==ma) {
            return true;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        if (cur.next == null)
            return false;
        Node newNode = new Node(khoHang);
        newNode = cur;
        newNode = newNode.next;
        return true;
    }

    public void sua() {
        tim();
        if (tim()==true) {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            Node newNode = new Node(khoHang);
            newNode = cur;
            newNode = newNode.next;
            } else {
                System.out.println("Không tìm thấy mã hàng hóa!!!");
            }
        }
        void bubbleSortTheoGiaTangDan() {
            Node current = head;
            Node index = null;
            String tam1;
            int tam2;
            String tam3;
            double tam4;
            int tam5;
            Date tam6;
            if (head == null) {
                System.out.println("- Danh sách rỗng.");
            } else {
                while (current != null) {
                    index = current.next;
                    while (index != null) {
                        if (current.data.giaNhap > index.data.giaNhap) {
                            // loại
                            tam1 = current.data.loai;
                            current.data.loai = index.data.loai;
                            index.data.loai = tam1;
                            // mã
                            tam2 = current.data.maHang;
                            current.data.maHang = index.data.maHang;
                            index.data.maHang = tam2;
                            // tên
                            tam3 = current.data.tenHangHoa;
                            current.data.tenHangHoa = index.data.tenHangHoa;
                            index.data.tenHangHoa = tam3;
                            // giá nhập
                            tam4 = current.data.giaNhap;
                            current.data.giaNhap = index.data.giaNhap;
                            index.data.giaNhap = tam4;
                            // số lượng tồn kho
                            tam5 = current.data.soLuongTonKho;
                            current.data.soLuongTonKho = index.data.soLuongTonKho;
                            index.data.soLuongTonKho = tam5;
    
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }

        void bubbleSortTheoGiaGiamDan() {
            Node current = head;
            Node index = null;
            String tam1;
            int tam2;
            String tam3;
            double tam4;
            int tam5;
            Date tam6;
            if (head == null) {
                System.out.println("- Danh sách rỗng.");
            } else {
                while (current != null) {
                    index = current.next;
                    while (index != null) {
                        if (current.data.giaNhap < index.data.giaNhap) {
                            // loại
                            tam1 = current.data.loai;
                            current.data.loai = index.data.loai;
                            index.data.loai = tam1;
                            // mã
                            tam2 = current.data.maHang;
                            current.data.maHang = index.data.maHang;
                            index.data.maHang = tam2;
                            // tên
                            tam3 = current.data.tenHangHoa;
                            current.data.tenHangHoa = index.data.tenHangHoa;
                            index.data.tenHangHoa = tam3;
                            // giá nhập
                            tam4 = index.data.giaNhap;
                            index.data.giaNhap = current.data.giaNhap;
                            current.data.giaNhap = tam4;
                            // số lượng tồn kho
                            tam5 = current.data.soLuongTonKho;
                            current.data.soLuongTonKho = index.data.soLuongTonKho;
                            index.data.soLuongTonKho = tam5;
    
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }

        void thongKe(){
            Node current = head;
            int sum1 = 0;
            double sum2 = 0;
            
            if (head == null) {
                System.out.println("- Danh sách rỗng.");
            } else {
                while (current != null) {
                    sum1 += current.data.soLuongTonKho;
                    sum2 += current.data.giaNhap; 
                    current = current.next;                    
                }
            }
            System.out.print("\nTổng số lượng hàng hóa: " +sum1);
            System.out.print("\nTổng giá trị hàng hóa nhập khoa: " +sum2);            
        }

        void thongKeTheoLoaithongKe(){
            Node current = head;
            int sum1 = 0, sum3 = 0, sum2 = 0;
            String loai1 = "Thực phẩm";
            String loai2 = "Sành sứ";
            String loai3 = "Điện máy";
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Nhập loại ");
            if (head == null) {
                System.out.println("- Danh sách rỗng.");
            } else {
                while (current != null) {
                    if (current.data.loai==loai1) {
                        sum1 += current.data.soLuongTonKho;
                        current = current.next;
                    }
                    if (current.data.loai==loai2) {
                        sum2 += current.data.soLuongTonKho;
                        current = current.next;
                    }
                    if (current.data.loai==loai3) {
                        sum3 += current.data.soLuongTonKho;
                        current = current.next;
                    }
                    
                    // current = current.next;
                }
            }
            System.out.print("\nTổng số lượng thực phẩm: " +sum1);
            System.out.print("\nTổng số lượng sành sứ: " +sum2);
            System.out.print("\nTổng số lượng điện máy: " +sum3);
            
        }
    void print(){
        Node current;
        current = head;
        if (head==null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("====================Kho hàng====================");
        // System.out.println(  +"\t"  +"\t"  +"\t"  +"\t" +"Ngày nhập kho:" );
        while(current!=null){
            current.data.inThongTin();
            current = current.next;
        }
    }
    


}
