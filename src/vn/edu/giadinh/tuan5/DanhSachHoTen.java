package vn.edu.giadinh.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
    private ArrayList<String> list = new ArrayList<>();
    //phương thức nhập
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();*/
        do{
            System.out.print("Nhập họ tên: ");
            String st  = scanner.nextLine();

            if(st.isEmpty()){
                break; // thoát ra vòng lập
            }
            list.add(st);
        } while (true); // vòng lặp chạy vô tận 

     
     }   
     //phương thức xuất dữ liệu
    public void xuat() {
        System.out.println("danh sách họ tên: ");
        for(String item : list){
             System.out.println("họ tên : " + item);
        }
    }  
      //phương thức xuất ngẩu nhiên
      public void xuatngaunhien() {
          //trộn danh sách và xuất ngẫu nhiên
          //trộn ngẫu nhiên
          Collections.shuffle(list);

          //xuất ngẫu nhiên

          xuat();
    }
    //sắp xếp theo thứ tự giảm dần
    public void sapxep() {
        //sắp xếp cho phép tăng giảm bằng cách thay đổi vị trí giữa (a) và (b)
        Collections.sort(list, (a ,b)-> a.compareTo(b)); // sử dụng kỹ thuật (lamba expression) cho phép điều chỉnh thông số tăng hoặc giảm 
        //gọi phương thức xuất cho người dùng
        xuat();
        
    }
    //phương thức tìm và xóa 
    public void timvaxoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("họ tên cần tìm và xóa: ");
        String hoten = scanner.nextLine();
        
        //dùng vòng lặp for-each để tìm kím 
        for(String item : list){
            if (item.equals(hoten)){
                list.remove(item);
                break; //tìm thấy, xóa , thoát vòng lập
            }
        }

    }
        
    //phương thức hiện thị menu
    public void hienthimenu() {
        Scanner scanner = new Scanner(System.in);
    do{
        System.out.println("===========================");
        System.out.println("menu chức năng của chương trình ");
        System.out.println("1> nhập danh sách ");
        System.out.println("2> hiển thị danh sách");
        System.out.println("3> Sắp xếp danh sách");
        System.out.println("4> Hiển thị ngẫu nhiên danh sách");
        System.out.println("5> tìm kiếm và xóa họ và tên trong danh sách");
        System.out.println("6> thoát");
        System.out.print("lựa chọn của bạn : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                 nhap();
                 break;
            case 2:
                 xuat();
                 break;
            case 3:
                 sapxep();
                 break;
            case 4:
                 xuatngaunhien();
                 break;
            case 5:
                 timvaxoa();
                 break;
            case 6:
                 System.exit(0);
                 break;
        }
      } while (true);
    }   
    public static void main(String[] args) {
        DanhSachHoTen ds = new DanhSachHoTen();
        ds.hienthimenu();
    }
}