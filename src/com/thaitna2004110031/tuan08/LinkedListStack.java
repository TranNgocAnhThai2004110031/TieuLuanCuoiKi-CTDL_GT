package com.thaitna2004110031.tuan08;

import java.util.Scanner;
import java.util.Stack;
import com.thaitna2004110031.tuan08.Student;

public class LinkedListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack;
        stack = new Stack<>();
        stack.push("Nguyễn Văn A");
        stack.push("Nguyễn Văn B");
        stack.push("Nguyễn Văn C");
        stack.push("Nguyễn Văn D");
        System.out.println("Danh sách sinh viên: \n" + stack);

        System.out.print("Thêm vào cuối: ");
        String  student = sc.nextLine();
        stack.push(student);
        System.out.println("Danh sách sinh viên sau khi thêm: \n" + stack);

        String sinhVienCuoiDanhSach = stack.peek();
        System.out.println("Sinh viên cuối danh sách là: " +sinhVienCuoiDanhSach);

        stack.pop();
        System.out.println("Danh sách sinh viên sau khi xóa sinh viên ở cuối: \n" + stack);
    }
}
