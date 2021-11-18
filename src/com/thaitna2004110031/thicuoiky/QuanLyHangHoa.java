package com.thaitna2004110031.thicuoiky;

import java.util.Date;
import java.util.Scanner;

public class QuanLyHangHoa {
    Node head = null;
    Node tail = null;
    KhoHang khoHang;
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

    // public void nhapTaoVaoKho() {
    //     //KhoHang khoHang = new KhoHang();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Nhập số lượng hàng hóa trong kho: ");
    //     int n = sc.nextInt();
    //     while(true){ 
    //         for (int i = 0; i < n ; i++) {
    //             Node newApple = new Node(khoHang);
    //             newApple.data.nhap();
    //             if (head == null) {
    //                 head = newApple;
    //                 tail = newApple;
    //             } else {
    //                 newApple.next = head;
    //                 head = newApple;
    //                 if (i==n-1) {
    //                     tail.next=null;
    //                 }
    //             }
    //         } 
    //         if(sc.nextLine().isEmpty()){ 
    //             break; 
    //         } 
    //     }
    // }
    public void add(String loai, int maHang, String tenHangHoa, double giaNhap, int soLuongTonKho, Date ngayNhapKho){
        KhoHang khoHang = new KhoHang(loai, maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho);
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
    //thêm đầu
    //KhoHang khoHang
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
    public Node timTheoMa(int ma) {
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
        Node node = null;
        Node preNode;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng hóa cần thêm trước: ");
        int ma = sc.nextInt();
        timTheoMa(ma);
        if (head.data.maHang == ma) {
            themDau();
        }
        Node current;
        current = head;
        while (current.next != null) {
            preNode = current;
            if (current.data.maHang == ma) {
                Node newNode = new Node(khoHang);
                // Node t = timTheoMa(newNode.data.maHang);
                // newNode.data.nhap();
                preNode.next = newNode;
                newNode.next = current;
            }
            current = current.next;
        }
        
    } 
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
        if(find(NewBook.data.maHang) == null )
            return;
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

    void print(){
        Node current;
        current = head;
        if (head==null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("====================Kho hàng====================");
        System.out.println("Loại:" +"\t\t" +"Mã hàng hóa:"  +"\t" +"Tên hàng hóa:" +"\t" +"Giá nhập khẩu" +"\t" +"Số lượng hóa tồn kho:" +"\t" +"Ngày nhập kho:" );
        while(current!=null){
            current.data.inThongTin();
            current = current.next;
        }
    }
    


}
