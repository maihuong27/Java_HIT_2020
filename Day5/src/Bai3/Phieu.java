package Bai3;
import java.util.Scanner;

public class Phieu {
    private int maPhieu;
    private String tenPhieu;
    private DateTime a;
    private SanPham[] x;
    private int n;


    public Phieu() {
        a = new DateTime();
        x = new SanPham[100];
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

    public void inputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        maPhieu = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten phieu: ");
        tenPhieu = sc.nextLine();
        a.inputDate();
        System.out.print("Nhap so phieu: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x[i] = new SanPham();
            x[i].inputSP();
        }
    }
    public void outputPhieu(){
        System.out.println(maPhieu);
        System.out.println(tenPhieu);
        System.out.println(n);
        a.outputDate();
        for (int i = 0; i < n; i++){
            x[i].outputSP();
        }
    }
}
