package com.thaitna2004110031.kiemtragiuaky;

public class LinkedList {
    int ma;
    double khoiLuong;
    String mauSac;
    Apple head = null;
    Apple tail = null;
    void add(int ma, double khoiLuong, String maSac){
        Apple newNode = new Apple(ma, khoiLuong, mauSac);
        if (head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
    }
    public void themVaoDau(int ma, double khoiLuong, String maSac){
        Apple newNode = new Apple(ma, khoiLuong, mauSac);
        if (head!=null) {
            newNode.setnext(this.head);
            this.head = newNode;
        }
    } 
    public void themVaoCuoi(int ma, double khoiLuong, String maSac){
        Apple newNode = new Apple(ma, khoiLuong, mauSac);
        tail.next = newNode;
        tail  = newNode;
    }
    public void xoaTraiTaoCuoi(){
        if (this.head == null)
           return;
        if (this.head.getnext() == null)
            System.out.println("Danh sách rỗng");
        Apple preLast = this.head;
        while (preLast.getnext().getnext() != null) {
            preLast = preLast.getnext();
        }
        preLast.setnext(null);
    }
    public boolean themTruocMotPhanTu(int ma, double khoiLuong, String maSac, int key) {
        if (this.head.equals(key)) {
            return true;
        }
        Apple cur = this.head;
        while (cur.getnext() != null && !cur.getnext().equals(key)) {
            cur = cur.getnext();
        }
        if (cur.getnext() == null)
            return false;
        Apple newNode = new Apple(ma, khoiLuong, maSac);
        newNode.setnext(cur.getnext());
        cur.setnext(newNode);
        return true;
    }
    void print(){
        Apple current = head;
        if (head==null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Danh sách táo: ");
        while(current!=null){
            
            current.inThongTin();
            current = current.next;
        }
    }
}
