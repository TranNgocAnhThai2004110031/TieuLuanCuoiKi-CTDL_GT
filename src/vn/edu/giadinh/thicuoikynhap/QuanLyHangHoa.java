package vn.edu.giadinh.thicuoikynhap;

import java.sql.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class QuanLyHangHoa {
    Node head = null;
    Node tail = null;
    KhoHang khoHang;
    
    public QuanLyHangHoa(){

    }
    boolean isEmpty(){
        boolean empty =true;
        if (head == null) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    public void add(String loai, int maHang, String tenHangHoa, double giaNhap, int soLuongTonKho){ // 
        
        KhoHang khoHang = new KhoHang(loai, maHang, tenHangHoa, giaNhap, soLuongTonKho);
        Node newNode = new Node(khoHang);
        
        if (head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;            
        }
    }
    
    public void addFirst(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhap();
        if (isEmpty()==true) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;            
        }
    }
    //thêm cuối

    public void addLast(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhap();
        if (isEmpty()==true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;            
        }
    }

    Node search(int ma) {
        Node node = null;
        
        if (isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
        } else {
            Node current;
            current = head;
            while (current !=null ) {
                if (current.data.maHang == ma) {
                    node = current;
                    return node;
                }
                current = current.next;
            }
            
        }
        return null;
    }

    
    //Hàm thêm sau mã hàng hóa
    public void addAfterNode() {
        KhoHang khoHang = new KhoHang();
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập mã hàng hóa cần thêm sau: ");
        int ma = sc.nextInt();
        Node preNode = search(ma);
        Node current = head;

        while (current.next != null) {
            current = current.next;
            if (current == preNode) {
                Node newNode = new Node(khoHang);
                newNode.data.nhap();
                current = current.next;
                preNode.next = newNode;
                newNode.next = current;
                return;
            }
        } 
        
    }

    // Hàm thêm trước mã hàng hóa
    public void addBeforeNode() {
        KhoHang khoHang = new KhoHang();
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập mã hàng hóa cần thêm trước: ");
        int ma = sc.nextInt();
        Node preNode = search(ma);
        Node current = this.head;
        if (head.data.maHang == ma) {
            addFirst();
        }
        while (current.next != null && !current.next.data.equals(ma)) {            
            if (current.next == preNode) {
                Node newNode = new Node(khoHang);
                newNode.data.nhap();
                current.next = newNode;
                newNode.next = preNode;
                return;

            }
            current = current.next;
            
        }
    }

    public void removeFirst() { //Hàm xoá đầu
        if(head == null){
            System.out.println("Danh sách rỗng!");
            return;
        }
        head = head.next;
    }

    void removeLast(){
        if (isEmpty()) {
            
        }
        Node temp;
        temp = head;
        while (temp !=null) {
           if (temp.next == tail) {
               tail = temp;
               tail.next = null;
           } 
           temp = temp.next;
        }
    }
    // Hàm xóa theo mã
    public void removeTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng hóa cần xóa: ");
        int ma = sc.nextInt();

        Node preNode = search(ma);

        if (head.data.maHang==ma) {
            removeFirst();
        } else if (tail == preNode) {
            removeLast();
        }else{
            Node current;
            current = head;

            while (current.next != null) {
                if (current.next == preNode) {
                    current.next = current.next.next;           
                }
                current = current.next;
            }
        }
    }

    public void set() {
        KhoHang khoHang = new KhoHang();
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập mã hàng hóa cần sửa thông tin: ");
        int ma = sc.nextInt();

        Node preNode = search(ma);
        Node current = head; 

        while (current.next != null) {
            if (current.next == preNode) {
                Node newNode = new Node(khoHang);
                current.next = newNode;                
                newNode.data.nhap();
                newNode.next = preNode.next;
            }
            current = current.next;
        }
        
    }


    Node searchLoai(String loaiCanTim) {
        Node node = null;
        
        if (isEmpty()) {
            System.out.println("Danh sách rỗng!!!");
        } else {
            Node current;
            current = head;
            while (current !=null ) {
                if (current.data.loai == loaiCanTim) {
                    node = current;
                    return node;
                }
                current = current.next;
            }
            
        }
        return null;
    }

    void timTheoLoai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loại hàng hóa cần tìm: ");
        String loaiCanTim = sc.nextLine();
        Node preNode = searchLoai(loaiCanTim);
        Node current = head;
        while(current != null){
            // if(current.data.loai.equals(loaiCanTim)){
            //     System.out.println("Loại hàng hóa cần tìm cần tìm: ");
            //     current.data.inThongTin();               
            // }
            if(current==preNode){
                System.out.println("Loại hàng hóa cần tìm cần tìm: ");
                current.data.inThongTin();               
            }
            current = current.next;
        }
        // System.out.println("Không có loại hàng hóa cần tìm.");
    }

    void timTheoGia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá hàng hóa cần tìm: ");
        double giaCanTim = sc.nextDouble();
        Node current = head;
        while(current != null){
            if(current.data.giaNhap == giaCanTim){
                System.out.println("Giá hàng hóa cần tìm cần tìm: ");
                current.data.inThongTin();                
            }
            current = current.next;
        }
        
        // System.out.println("Không có giá hàng hóa cần tìm.");
    }

    void timTheoGiaKhoan(){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Nhập giá hàng hóa cần tìm");
        System.out.print("Giá từ: ");
        double giaBe = sc.nextDouble();
        System.out.print("Đến giá: ");
        double giaLon = sc.nextDouble();
        Node current = head;
        System.out.println("Giá hàng hóa cần tìm: ");
        while(current != null){
            if(giaBe <= current.data.giaNhap && current.data.giaNhap <= giaLon){                
                current.data.inThongTin();
            }
            current = current.next;
        }
        System.out.println("Không có giá hàng hóa cần tìm.");
    }

    void bubbleSortTheoGiaTangDan() {
        Node current = head;
        Node index = null;
        String tam1;
        int tam2;
        String tam3;
        double tam4;
        int tam5;
        Date tam6;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.giaNhap > index.data.giaNhap) {
                        // loại
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // mã
                        tam2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = tam2;
                        // tên
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // giá nhập
                        tam4 = current.data.giaNhap;
                        current.data.giaNhap = index.data.giaNhap;
                        index.data.giaNhap = tam4;
                        // số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // ngày nhập kho
                        // tam6 = current.data.ngayNhapKho;
                        // current.data.ngayNhapKho = index.data.ngayNhapKho;
                        // index.data.ngayNhapKho = tam6;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void bubbleSortTheoGiaGiamDan() {
        Node current = head;
        Node index = null;
        String tam1;
        int tam2;
        String tam3;
        double tam4;
        int tam5;
        Date tam6;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.giaNhap < index.data.giaNhap) {
                        // loại
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // mã
                        tam2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = tam2;
                        // tên
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // giá nhập
                        tam4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = tam4;
                        // số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // ngày nhập kho
                        // tam6 = current.data.ngayNhapKho;
                        // current.data.ngayNhapKho = index.data.ngayNhapKho;
                        // index.data.ngayNhapKho = tam6;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void bubbleSortTheoNgayTangDan() {
        Node current = head;
        Node index = null;
        String tam1;
        int tam2;
        String tam3;
        double tam4;
        int tam5;
        Date tam6;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    // if (current.data.ngayNhapKho.compareTo(index.data.ngayNhapKho)==1 ) {
                        // loại
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // mã
                        tam2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = tam2;
                        // tên
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // giá nhập
                        tam4 = current.data.giaNhap;
                        current.data.giaNhap = index.data.giaNhap;
                        index.data.giaNhap = tam4;
                        // số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // ngày nhập kho
                        // tam6 = current.data.ngayNhapKho;
                        // current.data.ngayNhapKho = index.data.ngayNhapKho;
                        // index.data.ngayNhapKho = tam6;

                    // }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void bubbleSortTheoNgayGiamDan() {
        Node current = head;
        Node index = null;
        String tam1;
        int tam2;
        String tam3;
        double tam4;
        int tam5;
        Date tam6;
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    // if (current.data.ngayNhapKho.compareTo(index.data.ngayNhapKho)==-1) {
                        // loại
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // mã
                        tam2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = tam2;
                        // tên
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // giá nhập
                        tam4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = tam4;
                        // số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // ngày nhap kho
                    //     tam6 = current.data.ngayNhapKho;
                    //     current.data.ngayNhapKho = index.data.ngayNhapKho;
                    //     index.data.ngayNhapKho = tam6;

                    // }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void thongKe(){
        Node current = head;
        int sum1 = 0;
        double sum2 = 0;
        int sum3 = 0, sum4 = 0, sum5 = 0;
        String loai1 = "Thực phẩm";
        String loai2 = "Sành sứ";
        String loai3 = "Điện máy";
        
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                sum1 += current.data.soLuongTonKho;
                sum2 += current.data.giaNhap; 
                if (current.data.loai==loai1) {
                    sum3 += current.data.soLuongTonKho;
                }
                if (current.data.loai==loai2) {
                    sum4 += current.data.soLuongTonKho;
                }
                if (current.data.loai==loai3) {
                    sum5 += current.data.soLuongTonKho;
                }
                current = current.next;                    
            }
        }
        System.out.println("=============== THỐNG KÊ HÀNG HÓA ===============");
        System.out.println("\nTổng số lượng hàng hóa: " +sum1);
        System.out.println("\nTổng giá trị hàng hóa nhập kho: " +sum2); 
        System.out.println("\nTổng số lượng thực phẩm: " +sum3);
        System.out.println("\nTổng số lượng sành sứ: " +sum4);
        System.out.println("\nTổng số lượng điện máy: " +sum5);           
    }

    
void print(){
    Node current;
    current = head;
    if (head==null) {
        System.out.println("Danh sách rỗng!!!");
        return;
    }

    System.out.println("============================================================ DANH SÁCH HÀNG HÓA ============================================================");
    while(current!=null){
        current.data.inThongTin();
        current = current.next;
    }
} 

// Menu chương trình
void menu(){
    Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        int key = 0;
        
        do{
            System.out.println("+ + + + + + + + MENU  + + + + + + + +");
            System.out.println("+                                   +");
            System.out.println("+   >> 1: Thêm hàng hóa.            +");
            System.out.println("+   >> 2: Xóa hàng hóa.             +");
            System.out.println("+   >> 3: Sửa thông tin hàng hóa.   +");
            System.out.println("+   >> 4: Tìm kiếm hàng hóa.        +");
            System.out.println("+   >> 5: Sắp xếp hàng hóa.         +");
            System.out.println("+   >> 6: Thống kê hàng hóa.        +");
            System.out.println("+   >> 7: In danh sách hàng hóa.    +");
            System.out.println("+   >> 0: Thoát chương trình.       +");
            System.out.println("+                                   +");
            System.out.println("+ + + + + + + + + + + + + + + + + + +");

            System.out.print("- Nhập vào sựa lựa chọn: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    do {
                        System.out.println("+ + + + + + + + + + + + MENU THÊM HÀNG HÓA  + + + + + + + + + + + +");
                        System.out.println("+                                                                 +");
                        System.out.println("+   >> 1: Thêm hàng hóa vào đầu danh sách.                        +");
                        System.out.println("+   >> 2: Thêm hàng hóa vào cuối danh sách.                       +");
                        System.out.println("+   >> 3: Thêm hàng hóa vào trước mã hàng hóa có danh sách.       +");
                        System.out.println("+   >> 4: Thêm hàng hóa vào sau mã hàng hóa có danh sách.         +");
                        System.out.println("+   >> 5: In danh sách hàng hóa sau khi thêm.                     +");
                        System.out.println("+   >> 0: Thoát Menu thêm hàng hóa.                               +");
                        System.out.println("+                                                                 +");
                        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");

                        System.out.print("- Nhập vào sựa lựa chọn: ");
                        key = sc.nextInt();

                        switch (key) {
                            case 1:
                                addFirst();                            
                                break;  

                            case 2:
                                addLast();
                                break;

                            case 3:
                                addBeforeNode();
                                break;

                            case 4:
                                addAfterNode(); 
                                break;
                            case 5:
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI THÊM ==========");
                                print();
                            default:    
                                break;                
                            
                        }
                        
                    } while (key != 0);

                    break;
                case 2:
                    do {
                        System.out.println("+ + + + + + + + MENU XÓA HÀNG HÓA + + + + + + + +");
                        System.out.println("+                                               +");
                        System.out.println("+   >> 1: Xóa hàng hóa vào đầu danh sách.       +");
                        System.out.println("+   >> 2: Xóa hàng hóa vào cuối danh sách.      +");
                        System.out.println("+   >> 3: Xóa hàng hóa theo mã hàng hóa.        +");
                        System.out.println("+   >> 4: In danh sách hàng hóa sau khi xóa.    +");
                        System.out.println("+   >> 0: Thoát Menu xóa hàng hóa.              +");
                        System.out.println("+                                               +");
                        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + +");
                        
                        System.out.print("- Nhập vào sựa lựa chọn: ");
                        key = sc.nextInt();
                        switch (key) {
                            case 1:
                                removeFirst();
                                break;
                            case 2:
                                removeLast();
                                break;
                            case 3:
                                removeTheoMa();
                                break;
                            case 4:
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI XÓA ==========");
                                print();
                            default:
                                break;                    
                        }
                    
                    } while (key != 0);

                    break;
                case 3:
                        set();
                        System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI SỬA ==========");
                        print();
                        break;

                case 4:
                    do {
                        System.out.println("+ + + + + + + +  MENU TÌM KIẾM HÀNG HÓA + + + + + + + +");
                        System.out.println("+                                                     +");
                        System.out.println("+   >> 1: Tìm kiếm hàng hóa theo loại.                +");
                        System.out.println("+   >> 2: Tìm kiếm hàng hóa theo một giá nhất định.   +");
                        System.out.println("+   >> 3: Tìm kiếm hàng hóa theo khoản giá.           +");
                        System.out.println("+   >> 4: Tìm kiếm hàng hóa theo ngày nhập kho.       +");
                        System.out.println("+   >> 0: Thoát Menu tìm kiếm hàng hóa.               +");
                        System.out.println("+                                                     +");
                        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + +");

                        System.out.print("- Nhập vào sựa lựa chọn: ");
                        key = sc.nextInt();

                        switch (key) {
                            case 1:
                                timTheoLoai();
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");     
                                break;

                            case 2:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");
                                timTheoGia();
                                break; 

                            case 3:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");
                                timTheoGiaKhoan();
                                break;
                                
                            default:
                                break;                    
                        }
                    
                    } while (key !=0 );
                    break;

                case 5:
                    do {
                        System.out.println("+ + + + + + + + +  MENU SẮP XẾP HÀNG HÓA  + + + + + + + + +");
                        System.out.println("+                                                         +");
                        System.out.println("+   >> 1: Sắp xếp hàng hóa tăng dần theo giá.             +");
                        System.out.println("+   >> 2: Sắp xếp hàng hóa giảm dần theo giá.             +");
                        System.out.println("+   >> 3: Sắp xếp hàng hóa tăng dần theo ngày nhập kho.   +");
                        System.out.println("+   >> 4: Sắp xếp hàng hóa giảm dần theo ngày nhập kho.   +");
                        System.out.println("+   >> 0: Thoát Menu sắp xếp hàng hóa.                    +");
                        System.out.println("+                                                         +");
                        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
                    
                        System.out.print("- Nhập vào sựa lựa chọn: ");
                        key = sc.nextInt();
                        
                        switch (key) {
                            case 1:
                                bubbleSortTheoGiaTangDan();
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI SẮP XẾP ==========");
                                print();
                                break;
                            case 2:
                                bubbleSortTheoGiaGiamDan();
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI SẮP XẾP ==========");
                                print();
                                break;
                            default:
                                break;   
                                            
                        }
                    
                    } while (key != 0);
                    break;

                case 6:
                    thongKe();               
                    break;

                case 7:
                    print();
                    break;
            }

        } while(luaChon != 0);

    }
}

