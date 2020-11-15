package Bai3_Review;

import java.util.Scanner;

public class SanPham {
    private int maSP;
    private String tenSP;
    private int soLuong;
    private int donGia;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma san pham: ");
        maSP = sc.nextInt();
        System.out.print("Nhap vao ten san pham: ");
        sc.nextLine();
        tenSP = sc.nextLine();
        System.out.print("Nhap vao so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap vao don gia: ");
        donGia = sc.nextInt();
    }

    public void OutputSP(){
        System.out.println("Ma san pham: " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
    }
}
