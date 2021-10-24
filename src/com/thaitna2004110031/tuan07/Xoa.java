package com.thaitna2004110031.tuan07;

public class Xoa {
    Node head = null;
    Node tail = null;
    void add(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            tail =newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
    }
    
    void xoaDau(){
        this.head = this.head.getnext();
    }
    void xoaCuoi(){
        if (this.head == null)
           return;
        if (this.head.getnext() == null)
            System.out.println("dsr");
        Node preLast = this.head;
        while (preLast.getnext().getnext() != null) {
            preLast = preLast.getnext();
        }
        preLast.setnext(null);
          
    }

    public boolean xoaPhanTuChoTruoc(int key) {
        if (this.head.getdata().equals(key)) {
            this.xoaDau();
            return true;
        }
        Node cur = this.head;
        while (cur.getnext() != null && !cur.getnext().getdata().equals(key)) {
            cur = cur.getnext();
        }
        if (cur.getnext() == null)
            return false;
        cur.setnext(cur.getnext().getnext());
        return true;
    }
    
    void print(){
        Node current = head;
        if (head==null) {
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Các nút trong danh sách: ");
        while(current!=null){
            System.out.print(current.data +"\t");
            current = current.next;
        }
    }
}
