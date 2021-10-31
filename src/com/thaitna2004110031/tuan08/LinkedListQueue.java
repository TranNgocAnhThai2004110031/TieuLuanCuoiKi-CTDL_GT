package com.thaitna2004110031.tuan08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedListQueue {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Queue<String> queue;
        queue = new LinkedList<>();
        
        queue.add("Book1");
        queue.add("Book2");
        queue.add("Book3");
        queue.add("Book4");
        queue.add("Book5");

        System.out.println("Danh sách book\n" +queue);

        System.out.print("Thêm vào cuối: ");
        String  book = sc.nextLine();
        queue.add(book);
        System.out.println("Danh sách book sau khi thêm\n" + queue);

        String phanTuLayRa = queue.peek();
        System.out.println("Book được lấy ra từ đầu danh sách: " + phanTuLayRa);

        queue.remove();
        System.out.println("Danh sách book sau khi xóa đầu danh sách\n " + queue);
    }
}
