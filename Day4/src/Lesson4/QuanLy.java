package Lesson4;
import java.util.Scanner;

import java.util.Scanner;

public class QuanLy {
    private int maQL;
    private String hoTen;

    public QuanLy() {
    }

    public int getMaQL() {
        return maQL;
    }

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma quan ly: ");
        maQL = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ho ten: " + hoTen);
    }
}
