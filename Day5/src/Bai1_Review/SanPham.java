package Bai1_Review;

import java.util.Scanner;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private String tenHangSX;
    private String ngayNhap;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String tenHangSX, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSX = tenHangSX;
        this.ngayNhap = ngayNhap;
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

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma san pham: ");
        maSanPham = sc.nextInt();
        System.out.print("Nhap vao ten san pham: ");
        sc.nextLine();
        tenSanPham = sc.nextLine();
        System.out.print("Nhap vao ten hang san xuat: ");
        tenHangSX = sc.nextLine();
        System.out.print("Nhap vao ngay nhap: ");
        ngayNhap = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Ten hang san xuat: " + tenHangSX);
        System.out.println("Ngay nhap: " + ngayNhap);
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
}

