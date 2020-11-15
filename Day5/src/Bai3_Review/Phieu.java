package Bai3_Review;

import java.util.Scanner;

public class Phieu {
    private int maPhieu;
    private String tenPhieu;
    private DateTime a = new DateTime();
    private SanPham[] x;
    private int n;

    public Phieu() {
    }

    public Phieu(int maPhieu, String tenPhieu, DateTime a, SanPham[] x, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.x = x;
        this.n = n;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public SanPham[] getX() {
        return x;
    }

    public void setX(SanPham[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void InputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma phieu: ");
        maPhieu = sc.nextInt();
        System.out.print("Nhap vao ten phieu: ");
        sc.nextLine();
        tenPhieu = sc.nextLine();
        a.InputDate();
        System.out.print("Nhap vao so san pham: ");
        n = sc.nextInt();
        x = new SanPham[n];
        for (int i = 0; i < n; i++) {
            x[i] = new SanPham();
            x[i].InputSP();
        }
    }

    public void OutputPhieu(){
        System.out.println("Ma phieu: " + maPhieu);
        System.out.println("Ten phieu: " + tenPhieu);
        System.out.println("So san pham: " + n);
        a.OutputDate();
        for (int i = 0; i < n; i++) {
            x[i].OutputSP();
            System.out.println("Thanh tien: " + x[i].getDonGia() * x[i].getSoLuong());
        }
    }
}
