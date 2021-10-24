package com.thaitna2004110031.tuan07;

public class Them {
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
    void themVaoDau(int data){
        Node newNode = new Node(data);
        if (head!=null) {
            newNode.setnext(this.head);
            this.head = newNode;
        }
    } 
    public boolean themPhanTuVaoViTri(int data, int key){
        if (this.head.getdata().equals(key)) {
            this.themVaoDau(data);
            return true;
        }
        int i = 1;
        Node cur = this.head;
        Node newNode = new Node(data);
        while (cur!= null && i != key) {
            cur = cur.getnext();
            i++;
        }
        if (i!=key) {
            tail.next = newNode;
            tail  = newNode;  
        } else {
            Node temp = newNode;
            temp.next = cur.getnext();
            cur.next = temp;
        }
        return true;    
    }
    int tim(Node head, int data){
        int position = 0;
        for(Node p = head; p != null; p = p.getnext()){
            if(p.getdata() == data){
              return position;
            }
            ++position;
        }
        return -1;   
    }
    
    public boolean themTruocMotPhanTu(int data, int key) {
        if (this.head.getdata().equals(key)) {
            return true;
        }
        Node cur = this.head;
        while (cur.getnext() != null && !cur.getnext().getdata().equals(key)) {
            cur = cur.getnext();
        }
        if (cur.getnext() == null)
            return false;
        Node newNode = new Node(data);
        newNode.setnext(cur.getnext());
        cur.setnext(newNode);
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
