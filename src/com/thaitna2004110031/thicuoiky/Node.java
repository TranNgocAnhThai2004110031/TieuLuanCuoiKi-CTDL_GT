package com.thaitna2004110031.thicuoiky;

public class Node {
    KhoHang data;
    Node next;

    public Node(){
        data =  null;
        next = null;
    }

    public Node(KhoHang khoHang){
        data = khoHang;
        next = null;
    }

    public Node(KhoHang khoHang, Node node){
        data = khoHang;
        next = node;
    }
    
}
