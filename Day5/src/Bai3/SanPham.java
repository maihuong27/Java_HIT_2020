package Bai3;
import java.util.Scanner;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private int soLuong;
    private long donGia;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, int soLuong, long donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public void inputSP(){
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        System.out.println("Nhap ma san pham: ");
        maSanPham = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextInt();
        sc.nextLine();
    }

    public void outputSP(){
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + soLuong * donGia);
    }
}
