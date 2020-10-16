package Lesson4;
import java.util.Scanner;

public class PhongMay {
    private int maPhong;
    private String tenPhong;
    private int dienTich;
    QuanLy x = new QuanLy();
    May[] y;
    int n;

    public PhongMay() {
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        y = new May[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao ma phong: ");
            maPhong = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap vao ten phong: ");
            tenPhong = sc.nextLine();
            y[i] = new May();
            y[i].Nhap();
            x.Nhap();
            System.out.println();
        }
    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println("Ma phong: " + maPhong);
            System.out.println("Ten phong: " + tenPhong);
            y[i].Xuat();
            x.Xuat();
            System.out.println();
        }


    }
}
