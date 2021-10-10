package vn.edu.giadinh.tuan5;

public class SanPham {
    private String ten;
    private double gia; 
 
    public SanPham(){
              this.ten = null;
              this.gia = 0;
    }
        
        public SanPham(String ten, double gia) {
            this.ten = ten;
            this.gia = gia;
            
        }

    public double  getgia() {
        return gia;
        
    }
    public void setgia(double gia){
        this.gia = gia;
    }
    public void setten(String ten){
        this.ten = ten; // phương thức setter 
    }
    public String getten(){
        return this.ten; // phương thức getter
    }
}