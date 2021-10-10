package vn.edu.giadinh.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSanPham {
     //khai báo đối tượng Arraylisst
     private ArrayList<SanPham> list = new ArrayList<>();
     
     //phương thức nhập 
     public void nhap() {
         System.out.println("nhập sản phẩm: ");
         Scanner scanner = new Scanner(System.in);
         //dùng biến i kiểm tra và hiển thị
         int i = 1;
         //dùng vòng lặp do while
         do{
             System.out.printf("nhập tên sản phẩm thứ %d : " , i);
             String st = scanner.nextLine();//nhập chuỗi từ bàn phím 

             if(st == null || st.equals(""))//tập rỗng
              {
                  break;
             }
             System.out.println("giá sản phẩm : ");
             double gia = scanner.nextDouble();

             //danh sách 2 tham số (tên, giá )
             list.add(new SanPham(st, gia));
             //sử dụng kỹ thuật loại bỏ kí tự 
             scanner.nextLine(); //loại bỏ kí tự enter trong bộ đệm 
             i++;
         } while (true);
     }
     //phương thức hiển thị 
     public void hienthi() {
         //dung vòng lập for-each để hiện thị sản phẩm trong danh sách
         System.out.println("danh sách sản phẩm");
         System.out.println("ten\t\t|gia\t\t");
         for(SanPham sanPham : list){
                System.out.printf("%20s | %.2f \n", sanPham.getten(), sanPham.getgia()); //in ra thành danh sách (tên , giá)

        }
         
    }
         //phương thức sắp xếp
         public void sapxep() {
             System.out.println("danh sách sau khi sắp xếp");
             //theo tiêu chí giá sản phẩm
             Collections.sort(list, (a ,b) ->(int) (a.getgia() - b.getgia()));
             //hiển thị danh sách sắp xếp 
             hienthi(); 
     }
     //phương thức tìm kiếm , xóa phần tử trong danh sách
     public void timkiem() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("nhập tên sản phẩm cần tìm và xóa");
         String ten = scanner.nextLine();
         SanPham found = null;//tạo biens found
         //dùng vòng lặp for-each để tìm kiếm sản phẩm trong danh sách
         for(SanPham sanPham : list){
             if(sanPham.getten().equals(ten)){
                 found = sanPham; //không tìm thấy sản phẩm
                }//lưu vào trong biến found
               
         }
         if(found != null){
             list.remove(found);
             System.out.println("sản phẩm đã được xóa");
         }else{
             System.out.println("sản phẩm không có trong danh sách");
         }
         
     }
     //phương thức tính giá trung bình 
         public void tinhtrungbinh(){
            //khai báo avg
            double avg = 0, sum = 0;

            //dùng vòng lặp for-each để duyệt qua các phần tử giá của danh sách
            for(SanPham sanPham : list){
                sum += sanPham.getgia();

            }
            avg = sum / list.size(); //phương thức size trả về số lượng các phần tử có trong danh sách list
            System.out.println("giá trung bình của sản phẩm: "+ avg);

         }
         //phương thức tạo menu
         public void menu(){
             System.out.println("==============MENU===============");
        do{
            System.out.println("============================");
             System.out.println("1> nhập danh sách sản phẩm");
             System.out.println("2> xuất danh sách sản phẩm");
             System.out.println("3> sắp xếp danh sách");
             System.out.println("4> tìm kiếm và xóa sản phẩm trong danh sách ");
             System.out.println("5> tính giá trunng bình của sản phẩm");
             System.out.println("6> thoát");
             System.out.println("lựa chọn của bạn: ");
             Scanner scanner = new Scanner(System.in);
             int choice = scanner.nextInt();

             switch(choice){
                case 1:
                     nhap();
                      break;
                case 2:
                     hienthi();
                     break;
                case 3:
                     sapxep();
                     break;
                case 4:
                     timkiem();
                     break;
                case 5: 
                     tinhtrungbinh();
                     break;
                case 6:
                     System.exit(0);
                     break;
           default:
                 System.out.println("nhập không đúng ! mời nhập lại : ");
                        
        } 
            }while(true); //vòng lặp
             
    }
}