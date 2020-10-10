package Lesson3;

public class HangHoa {
    private int maHang;
    private String tenHang;
    private int donGia;
    private int soLuong;

    public HangHoa(){

    }

    public HangHoa(int maHang, String tenHang, int donGia, int soLuong){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void Xuat(){
        System.out.println("Id: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Don gia: " + donGia);
        System.out.println("So Luong: " + soLuong);
        System.out.println("Thanh tien: " + (this.donGia * this.soLuong));
    }
}
