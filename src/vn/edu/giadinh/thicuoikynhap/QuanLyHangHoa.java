package vn.edu.giadinh.thicuoikynhap;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class QuanLyHangHoa {
    Node head = null;
    Node tail = null;
    KhoHang khoHang;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    int n = 30;
    
    public QuanLyHangHoa(){

    }

    // Hàm kiểm tra danh sách có rỗng hay không
    /* Nếu trả về empty = true thì danh sách rỗng
        và nếu trả về empty = false danh sách có dữ liệu
    */
    boolean isEmpty(){
        boolean empty =true;
        /* Kiểm tra node head có = null hay không 
                nếu head == null thì trả về empty = true
                nếu head != null thì trả về empty = false*/
        if (head == null) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    // Hàm mồi
    void add(String loai, int id, String tenHangHoa, double giaNhap, int soLuongTonKho,String ngay){
        Date ngayNhapKho;
        // Chuyển chuỗi ký tự thành kiểu dữ liệu Date
        try {
            ngayNhapKho = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        KhoHang khoHang = new KhoHang(loai, id, tenHangHoa, giaNhap, soLuongTonKho, ngay);
        Node newNode  = new Node(khoHang);
        /* Nếu danh sách rỗng thì gán Node mới vào Node đầu và Node cuối của danh sách liên kết
            và nếu danh sách khác tập rỗng thì thêm Node mới vào cuối danh sách*/
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
        return;
    }
    // Hàm thêm vào đầu danh sách
    void addFirst(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhapThongTin();
        /* Nếu danh sách rỗng thì gán Node mới vào Node đầu và node cuối của danh sách liên kết
            và nếu danh sách khác tập rỗng thì thêm Node mới vào trước Node head*/
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;            
        }
    }
    // Hàm thêm vào cuối danh sách
    void addLast(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhapThongTin();
        /* Nếu danh sách rỗng thì gán Node mới vào Node đầu và Node cuối của danh sách liên kết
            và nếu danh sách khác tập rỗng thì thêm node mới vào cuối danh sách liên kết*/
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;            
        }
    }

    Node search(int idCanTim) {
        Node node = null;
        // Kiểm tra danh sách liên kiết có rỗng hay không nếu danh sách rỗng thì in ra danh dách rỗng.
         
        if (isEmpty() == true) {
            System.out.println("Danh sách rỗng!!!");
        } else {
            Node current;
            current = head;
            while (current !=null ) {
                /* Nếu dữ liệu id của Node current bằng với id cần tìm 
                    thì gán Node current vào Node node và trả về giá trị Node node và kết thúc vòng lặp.*/
                if (current.data.id == idCanTim) {
                    node = current;
                    return node;
                }
                current = current.next;
            }
            
        }
        return null;
    }

    //Hàm thêm sau id hàng hóa
    void addBehindNode() {
        KhoHang khoHang = new KhoHang();
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập ID hàng hóa cần thêm sau: ");
        int iD = sc.nextInt();
        Node preNode = search(iD);
        Node current = head;

        if(preNode == null){
            System.out.println("- ID hàng hóa cần thêm không có trong danh sách!");
            return;
        }
        while (current != null) {
            current = current.next;
            /** Nêu giá trị của Node current bằng với giá trị của Node preNode
             *  thì Node current sẽ duyệt thêm 1 lần và Node preNode sẽ trỏ đến Node newNode
             *  sau dó Node newNode sẽ trỏ đến Node current vừa mới được duyệt*/
            if (current == preNode) {
                Node newNode = new Node(khoHang);
                newNode.data.nhapThongTin();
                current = current.next;
                preNode.next = newNode;
                newNode.next = current;
                return;
            }
        }         
    }

    // Hàm thêm trước id hàng hóa
    void addFrontNode() {
        KhoHang khoHang = new KhoHang();
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập ID hàng hóa cần thêm trước: ");
        int iD = sc.nextInt();
        Node preNode = search(iD);
        Node current = this.head;

        if(preNode == null){
            System.out.println("- ID hàng hóa cần thêm không có trong danh sách!");
            return;
        }
        // Nếu id của Node head bằng id cần tìm thì sẽ thêm Node mới vào đầu danh sách
        if (head.data.id == iD) {
            addFirst();
        }
        while (current != null) { // && !current.next.data.equals(iD) 
            /** Nêu giá trị của Node current trỏ đến bằng với giá trị của Node preNode
             *  thì Node current sẽ trỏ đến Node newNode 
             *  sau dó Node newNode sẽ trỏ đến Node preNode*/           
            if (current.next == preNode) {
                Node newNode = new Node(khoHang);
                newNode.data.nhapThongTin();
                current.next = newNode;
                newNode.next = preNode;
                return;
            }
            current = current.next;            
        }
    }
    // Hàm thêm vào vị trí
    void addAtk() {
        Scanner sc = new Scanner(System.in);
        KhoHang khoHang = new KhoHang();

        System.out.print("Nhập vị trí cần thêm: ");
        int k = sc.nextInt();
        /** Nếu danh sách rỗng hoặc vị trí k <= 1 thì Node mới sẽ được thêm vào đầu danh sách liên kết.
         *  Nếu vị trí k >= n thì Node mới sẽ được thêm vào cuối danh sách liên kết.*/
        if (isEmpty() == true || k <= 1) {
            addFirst();
        } else if (k>=n) {
            addLast();
        } else {
            Node preNode = new Node();
            Node q = new Node();
            Node current = head;
            Node newNode = new Node(khoHang);
            newNode.data.nhapThongTin();
            int dem = 0;
            /** Sử dụng vòng lặp để duyệt từng phần tử trong danh sách liên kết 
             *  với mỗi lần lặp sẽ tăng biến dem thêm 1 đơn vị và gán giá trị Node current vào Node preNode
             *  nếu giá trị biến dem bắng giá trị biến k + 1 thì thoát khỏi vòng lặp.*/
            while (current != null) {
                dem++;
                preNode = current;
                if (dem == k+1) {
                    break;
                }
                current=current.next;
            }
            q = head;
            /** Sử dụng vòng lặp để duyệt từng phần tử trong danh sách liên kết.
             *  Sau khi kết thúc vòng lặp Node q sẽ trỏ đến Node newNode, 
             *  sau dó Node newNode sẽ trỏ đến Node current.*/
            while (q.next != preNode) { 
                q = q.next;
            }
            q.next = newNode;
            newNode.next = current;
        }
    }
    // Hàm xoá đầu
    void removeFirst() { 
        if(isEmpty() == true){
            System.out.println("Danh sách rỗng!");
            return;
        }
        // Giá trị của Node được Node head trỏ đến sẽ được gán vào Node head.
        head = head.next;
    }
    // Hàm xoá cuối
    void removeLast(){
        if (isEmpty()) {
            System.out.println("- Danh sách rỗng!!!");
        }
        Node current = head;
        while (current !=null) {
            // Nếu Node current trỏ đến Node tail thì Node current sẽ gán vào Node tail và Node tail sẽ trỏ đến Node rỗng.
           if (current.next == tail) {
               tail = current;
               tail.next = null;
           } 
           current = current.next;
        }
    }
    // Hàm xóa theo id hàng hóa
    void removeTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID hàng hóa cần xóa: ");
        int iD = sc.nextInt();

        Node preNode = search(iD);

        if(preNode == null){
            System.out.println("- ID hàng hóa cần xóa không có trong danh sách!");
            return;
        }
        // Nếu giá trị của Node head bằng giá trị của Node preNode thì sẽ thực hiện hàm xóa đầu.
        if (head == preNode) { 
            removeFirst();
        } else if (tail == preNode) { // Nếu giá trị của Node tail bằng giá trị của Node preNode thì sẽ thực hiện hàm xóa cuối.
            removeLast();
        }else{
            Node current;

            current = head;
            while (current.next != null) {
                /**  Nếu Node current trỏ đến Node preNode 
                *    thì giá trị Node current trỏ đến sẽ được gán bởi giá trị của Node current trỏ đến tiếp theo.*/
                if (current.next == preNode) {
                    current.next = current.next.next;           
                }
                current = current.next;
            }
        }
    }
    // Hàm sửa thông tin theo id hàng hóa
    void set() {
        KhoHang khoHang = new KhoHang();
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập ID hàng hóa cần sửa thông tin: ");
        int iD = sc.nextInt();

        Node preNode = search(iD);
        Node current = head; 

        if(preNode == null){
            System.out.println("- ID hàng hóa cần sửa thông tin không có trong danh sách!");
            return;
        }
        while (current != null) {
            /** Nếu Node current trỏ đến Node preNode thì Node preNode sẽ được gán bởi Node newNode
             *  và giá trị mà Node newNode trỏ đến sẽ được gán giá trị mà Node preNode trỏ đến.*/
            if (current.next == preNode) {
                Node newNode = new Node(khoHang);
                current.next = newNode;                
                newNode.data.nhapThongTin();
                newNode.next = preNode.next;
            }
            current = current.next;
        }
        
    }
    // Hàm tìm theo loại hàng hóa
    void timTheoLoai(){
        Scanner sc = new Scanner(System.in);
        // String loaiCanTim;

        System.out.print("Nhập loại hàng hóa cần tìm: ");
        String loaiCanTim = sc.nextLine();
        Node current = head;
        
        while(current != null){
            /** Nếu chuỗi ký tự biến loại của Node current bằng với chuỗi ký tự của loại cần tìm 
            *    thì sẽ thực hiện in thông tin của Node current.*/
            if(current.data.loai.equals(loaiCanTim)){
                current.data.inThongTin();               
            }            
            current = current.next;
        }
    }
    // Hàm tìm theo giá nhập khẩu
    void timTheoGia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá hàng hóa cần tìm: ");
        double giaCanTim = sc.nextDouble();
        Node current = head;

        while(current != null){
            // Nếu giá trị biến giaNhap của Node current bằng với giá cần tìm thì sẽ thực hiện in thông tin của Node current. 
            if(current.data.giaNhap == giaCanTim){
                current.data.inThongTin();                
            }
            current = current.next;
        }
    }
    // Hàm tìm theo giá nhập khẩu từ giá...đến giá...
    void timTheoGiaKhoan(){
        Scanner sc = new Scanner(System.in);       
        System.out.println("Nhập giá hàng hóa cần tìm");
        System.out.print("Giá từ: ");
        double giaNho = sc.nextDouble();
        System.out.print("Đến giá: ");
        double giaLon = sc.nextDouble();

        Node current = head;
        
        while(current != null){
            // Nếu giá nhập lớn hơn hoặc bằng giá nhỏ và bé hơn hoặc bằng giá lớn thì sẽ thực hiện in giá trị của Node current.
            if(giaNho <= current.data.giaNhap && current.data.giaNhap <= giaLon){                
                current.data.inThongTin();
            }
            current = current.next;
        }        
    }
    // Hàm tìm theo ngày nhập kho
    void timTheoNgayNhap(){
        Scanner sc = new Scanner(System.in);
        Date ngay = null;
             
        System.out.print("Nhập ngày nhập hàng hóa cần tìm: ");
        // Chuyển kiểu chuỗi ký tự sang kiểu Date.
        try {
            ngay = simpleDateFormat.parse(sc.nextLine());

        } catch (Exception e) {
        }

        Node current = head;

        while (current != null) {
            current = current.next;
            // Nếu ngày nhập kho của Node current trừ cho ngày bằng 0 thì sẽ thực hiện in Node current. 
            if (current.data.ngayNhapKho.compareTo(ngay)==0) {
                current.data.inThongTin();
            }
        }
    }
    // Hàm tìm theo ngày từ ngày... đến ngày...
    void timTheoNgayKhoan(){
        Date ngayTruoc = null;
        Date ngaySau = null;
        Scanner sc = new Scanner(System.in);    
        System.out.println("Nhập ngày nhập hàng hóa cần tìm ");
        System.out.print("Ngày từ: ");
        // Chuyển kiểu chuỗi ký tự sang kiểu Date.
        try {
            ngayTruoc = simpleDateFormat.parse(sc.nextLine());

        } catch (Exception e) {
        }
        System.out.print("Đến ngày: ");
        try {
            ngaySau = simpleDateFormat.parse(sc.nextLine());

        } catch (Exception e) {
        }
        Node current = head;

        while(current != null){
            /** Nếu ngày nhập kho của Node current trừ cho ngày sau bằng 0 hoặc bằng -1
             *  và ngày nhập kho trừ cho ngày trước bằng 0 hoặc bằng 1 thì sẽ thực hiện in Node current. */
            if ((current.data.ngayNhapKho.compareTo(ngaySau) == -1 || current.data.ngayNhapKho.compareTo(ngaySau) == 0) 
            && (current.data.ngayNhapKho.compareTo(ngayTruoc) == 1 || current.data.ngayNhapKho.compareTo(ngayTruoc) == 0)) {
                current.data.inThongTin();
            }
            current = current.next;
        }
    }
// Dư
    // void timTheoLoaiVaTheoGia(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Nhập loại cần tìm: ");
    //     String loai = sc.nextLine();
    //     System.out.print("Nhập giá hàng hóa cần tìm: ");
    //     double giaCanTim = sc.nextDouble();
    //     Node current = head;
    //     while(current != null){
    //         if (current.data.loai.equals(loai)) {
    //             if(current.data.giaNhap == giaCanTim){
    //                 System.out.println("Hàng hóa cần tìm: ");
    //                 current.data.inThongTin();                
    //             }
    //         }
    //         current = current.next;
    //     }
    // }

    // void timTheoLoaiVaTheoNgay(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Nhập loại cần tìm: ");
    //     String loai = sc.nextLine();
    //     System.out.print("Nhập ngày nhập hàng hóa cần tìm: ");
    //     Date ngay = null;
    //     try {
    //         ngay = simpleDateFormat.parse(sc.nextLine());

    //     } catch (Exception e) {
    //     }
        
    //     Node current = head;

    //     while(current != null){
    //         if (current.data.ngayNhapKho.compareTo(ngay)==0) {
    //             if(current.data.loai==loai){
    //                 System.out.println("Hàng hóa cần tìm: ");
    //                 current.data.inThongTin();                
    //             }
    //             current.data.inThongTin();
    //         }
    //         current = current.next;
    //     }
    // }
    // Sắp xếp tăng dần theo giá kiểu BubbleSort
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
                        // Sắp xếp loại hàng hóa
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // Sắp xếp id hàng hóa
                        tam2 = current.data.id;
                        current.data.id = index.data.id;
                        index.data.id = tam2;
                        // Sắp xếp tên hàng hóa
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // Sắp xếp giá nhập 
                        tam4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = tam4;
                        // Sắp xếp số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // Sắp xếp ngày nhập kho
                        tam6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = tam6;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    // Sắp xếp giảm dần theo giá kiểu BubbleSort
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
                        // Sắp xếp loại hàng hóa
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // Sắp xếp id hàng hóa
                        tam2 = current.data.id;
                        current.data.id = index.data.id;
                        index.data.id = tam2;
                        // Sắp xếp tên hàng hóa
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // Sắp xếp giá nhập 
                        tam4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = tam4;
                        // Sắp xếp số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // Sắp xếp ngày nhập kho
                        tam6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = tam6;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    // Hàm sắp xếp tăng dần theo ngày nhập kho kiểu BubbleSort
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
                    if (current.data.ngayNhapKho.compareTo(index.data.ngayNhapKho)==1 ) {
                        // Sắp xếp loại hàng hóa
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // Sắp xếp id hàng hóa
                        tam2 = current.data.id;
                        current.data.id = index.data.id;
                        index.data.id = tam2;
                        // Sắp xếp tên hàng hóa
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // Sắp xếp giá nhập 
                        tam4 = current.data.giaNhap;
                        current.data.giaNhap = index.data.giaNhap;
                        index.data.giaNhap = tam4;
                        // Sắp xếp số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // Sắp xếp ngày nhập kho
                        tam6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = tam6;

                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    // Hàm sắp xếp giảm theo ngày kiểu BubleSort 
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
                    if (current.data.ngayNhapKho.compareTo(index.data.ngayNhapKho)==-1) {
                        // Sắp xếp loại hàng hóa
                        tam1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = tam1;
                        // Sắp xếp id hàng hóa
                        tam2 = current.data.id;
                        current.data.id = index.data.id;
                        index.data.id = tam2;
                        // Sắp xếp tên hàng hóa
                        tam3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = tam3;
                        // Sắp xếp giá nhập
                        tam4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = tam4;
                        // Sắp xếp số lượng tồn kho
                        tam5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = tam5;
                        // Sắp xếp ngày nhap kho
                        tam6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = tam6;

                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    void bubbleSortTheoLoaiVaTheoGiaTangDan() {
        Node current = head;
        Node index = null;
        String tam = "Thực phẩm";
        String tam1;
        int tam2;
        String tam3;
        double tam4;
        int tam5;
        Date tam6;
        // if (current.data.loai==tam1) {
            
        
        if (head == null) {
            System.out.println("- Danh sách rỗng.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.loai.equals(tam)) {
                        // current.data.inThongTin();
                    
                        if (current.data.giaNhap > index.data.giaNhap ) {
                            tam = current.data.loai;
                            current.data.loai = index.data.loai;
                            index.data.loai = tam;
                            // // loại
                            // tam = current.data.loai;
                            // current.data.loai = index.data.loai;
                            // index.data.loai = tam;
                            // // mã
                            // tam2 = current.data.id;
                            // current.data.id = index.data.id;
                            // index.data.id = tam2;
                            // // tên
                            // tam3 = current.data.tenHangHoa;
                            // current.data.tenHangHoa = index.data.tenHangHoa;
                            // index.data.tenHangHoa = tam3;
                            // // giá nhập
                            // tam4 = current.data.giaNhap;
                            // current.data.giaNhap = index.data.giaNhap;
                            // index.data.giaNhap = tam4;
                            // // số lượng tồn kho
                            // tam5 = current.data.soLuongTonKho;
                            // current.data.soLuongTonKho = index.data.soLuongTonKho;
                            // index.data.soLuongTonKho = tam5;
                            // // ngày nhập kho
                            // tam6 = current.data.ngayNhapKho;
                            // current.data.ngayNhapKho = index.data.ngayNhapKho;
                            // index.data.ngayNhapKho = tam6;
                        }
                    // else if (current.data.loai != tam1) {
                    //     index = index.next;
                    // }
                    // current.data.inThongTin();
                }
                
                    index = index.next;

                }
                current = current.next;
            }
        }
    // }
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
                sum1 += current.data.soLuongTonKho; // sum1 = sum1 + số lượng tồn kho của Node current
                sum2 += current.data.giaNhap; // sum2 = sum2 + giá nhập của Node current
                // Nếu loai của Node current bằng loai1 thì sum3 = sum3 + số lượng tồn kho của Node current
                if (current.data.loai==loai1) {
                    sum3 += current.data.soLuongTonKho;
                }
                // Nếu loai của Node current bằng loai2 thì sum4 = sum4 + số lượng tồn kho của Node current
                if (current.data.loai==loai2) {
                    sum4 += current.data.soLuongTonKho;
                }
                // Nếu loai của Node current bằng loai3 thì sum5 = sum5 + số lượng tồn kho của Node current
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
        // int n = 30;
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
                        System.out.println("+   >> 5: Thêm hàng hóa vào vị trí.                               +");
                        System.out.println("+   >> 6: In danh sách hàng hóa sau khi thêm.                     +");
                        System.out.println("+   >> 0: Thoát Menu thêm hàng hóa.                               +");
                        System.out.println("+                                                                 +");
                        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");

                        System.out.print("- Nhập vào sựa lựa chọn: ");
                        key = sc.nextInt();

                        switch (key) {
                            case 1:
                                addFirst();
                                n++;                            
                                break;  

                            case 2:
                                addLast();
                                n++;   
                                break;

                            case 3:
                                addFrontNode();
                                n++;   
                                break;

                            case 4:
                                addBehindNode(); 
                                n++;   
                                break;
                            case 5:
                                addAtk();
                                n++;
                                break;
                            case 6:
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI THÊM ==========");
                                print();
                            default:  
                                System.out.println("- Cú pháp đã sai vui lòng nhập lại!!!");  
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
                                n--;   
                                break;
                            case 2:
                                removeLast();
                                n--;
                                break;
                            case 3:
                                removeTheoMa();
                                n--;
                                break;
                            case 4:
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI XÓA ==========");
                                print();
                            default:
                                System.out.println("- Cú pháp đã sai vui lòng nhập lại!!!");
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
                        System.out.println("+ + + + + + + + + + + MENU TÌM KIẾM HÀNG HÓA  + + + + + + + + + + + +");
                        System.out.println("+                                                                   +");
                        System.out.println("+   >> 1: Tìm kiếm hàng hóa theo loại.                              +");
                        System.out.println("+   >> 2: Tìm kiếm hàng hóa theo một giá nhất định.                 +");
                        System.out.println("+   >> 3: Tìm kiếm hàng hóa theo khoản giá.                         +");
                        System.out.println("+   >> 4: Tìm kiếm hàng hóa theo ngày nhập kho.                     +");
                        System.out.println("+   >> 5: Tìm kiếm hàng hóa theo ngày nhập kho từ ngày đến ngày.    +");
                        System.out.println("+   >> 0: Thoát Menu tìm kiếm hàng hóa.                             +");
                        System.out.println("+                                                                   +");
                        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");

                        System.out.print("- Nhập vào sựa lựa chọn: ");
                        key = sc.nextInt();

                        switch (key) {
                            case 1:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");  
                                timTheoLoai();   
                                break;

                            case 2:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");
                                timTheoGia();
                                break; 

                            case 3:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");
                                timTheoGiaKhoan();
                                break;
                            case 4:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");   
                                timTheoNgayNhap();  
                                break;  
                            case 5:
                                System.out.println("========== DANH SÁCH HÀNG HÓA CẦN TÌM ==========");   
                                timTheoNgayKhoan();  
                                break;
                            default:
                                System.out.println("- Cú pháp đã sai vui lòng nhập lại!!!");
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
                            case 3:
                                bubbleSortTheoNgayTangDan();
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI SẮP XẾP ==========");
                                print();
                                break;
                            case 4:
                                bubbleSortTheoNgayGiamDan();
                                System.out.println("========== DANH SÁCH HÀNG HÓA SAU KHI SẮP XẾP ==========");
                                print();
                                break;
                            default:
                                System.out.println("- Cú pháp đã sai vui lòng nhập lại!!!");
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
                default:
                    System.out.println("- Cú pháp đã sai vui lòng nhập lại!!!");
                    break;
            }

        } while(luaChon != 0);

    }
}


