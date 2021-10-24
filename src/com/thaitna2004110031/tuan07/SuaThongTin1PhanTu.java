package com.thaitna2004110031.tuan07;

public class SuaThongTin1PhanTu {
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

    void timVaSuaTaiViTri(int data, int pos){
        if (pos < 0) {
            return;
        }
        if (pos == 0) {
            this.add(data);
            return;
        }
        int i = 0;
        Node cur = this.head;
        while (i < pos - 1 && cur != null) {
            i++;
            cur = cur.getnext();
        }
        if (i != pos - 1) {
            return;
        }
        Node newNode = new Node(data);
        newNode.setnext(cur.getnext().next);
        cur.setnext(newNode);  
    }

    public boolean timVaSua(int data, int key) {
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
        newNode.setnext(cur.getnext().next);
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
