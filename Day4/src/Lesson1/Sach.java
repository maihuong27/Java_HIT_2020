package Lesson1;
import java.util.Scanner;

public class Sach {
    int maSach;
    String tenSach;
    String nXB;
    int soTrang;
    int giaTien;

    public Sach() {

    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getnXB() {
        return nXB;
    }

    public void setnXB(String nXB) {
        this.nXB = nXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        //sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nXB = sc.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();
        System.out.print("Nhap gia tien: ");
        giaTien = sc.nextInt();
    }

    public void Xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nha xuat ban: " + nXB);
        System.out.println("So trang: " + soTrang);
        System.out.println("Gia tien: " + giaTien);
        System.out.println();
    }
}
