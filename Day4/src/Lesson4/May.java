package Lesson4;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma may: ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao kieu may: ");
        kieuMay = sc.nextLine();
        System.out.print("Nhap vao tinh trang: ");
        tinhTrang = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang: " + tinhTrang);
    }
}
