package vn.edu.giadinh.tuan5;

import java.util.ArrayList;
import java.util.List;

import vn.edu.giadinh.tuan2.SinhVien;
import vn.edu.giadinh.tuan4.Dog;

public class CTMinhHoaArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Cường");
        a.add(true);
        a.add(1);
        a.add(2.5);
        a.add(new Dog(20, "Đen trắng","Lu Lu"));

        Dog dog = (Dog)a.get(4);
        System.out.println("Dog name: " + dog.name + 
        "\nColor: " + dog.color);

        //List bienTCArrayList = new ArrayList();
        //bienTCArrayList.add(new SinhVien())

        System.out.println(a.get(0));
        Integer x = (Integer)a.get(2);
        System.out.println(a);
        System.out.println(x);
        List<String> b = new ArrayList<>();
        b.add("Cương");
        b.add("Tuấn");
        b.add("Phương");
        b.add("Hạnh");
        String s = b.get(2);
        
        for (String d : b) {
            System.out.println(d);
        }
        System.out.println(s);

        ArrayList<Dog> c = new ArrayList<>();
        //SinhVien sinhVien = new SinhVien();
        c.add(new Dog(20, "Đen trắng","Lu Lu"));
        Dog eDog = (Dog)c.get(1);
        System.out.println("Dog name: " + eDog.name + 
        "\nColor: " + eDog.color);

    }
}
