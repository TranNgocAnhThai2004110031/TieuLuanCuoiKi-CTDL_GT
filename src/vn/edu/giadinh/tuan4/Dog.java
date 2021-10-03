package vn.edu.giadinh.tuan4;

public class Dog {
    int size;
    String color;
    String name;
    public Dog(){}

    public Dog(int s){
        size = s;
    }

    public Dog(int s, String c, String n){
        size = s;
        color = c;
        name = n;
    }

    void inThongTin(){
        System.out.println("Size: " + size + "   " + "Màu: " + color + "   " + "Tên: " + name);
    }
}
