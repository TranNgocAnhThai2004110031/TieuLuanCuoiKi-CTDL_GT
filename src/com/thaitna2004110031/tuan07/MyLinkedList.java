package com.thaitna2004110031.tuan07;

public class MyLinkedList {
    Node head = null;//danh sách rỗng
    Node tail = null;
    public MyLinkedList(){}

    void add(int data){
        //tạo 1 node mới
        Node newNode = new Node(data);
        if (head==null) {//thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail =newNode;
        }else{//danh sách rỗng //thêm vào đuôi danh sách
            tail.next = newNode;
            tail  = newNode ;
        }
    }
    void remve(){

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

    void find(){

    }
}
