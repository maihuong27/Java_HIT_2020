package Lesson3;
import java.util.Scanner;

public class Phieu {
    private int MaPhieu;
    private Hang[] x;
    private int n;

    public Phieu() {
    }

    public int getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        MaPhieu = maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        MaPhieu = sc.nextInt();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        sc.nextLine();
        x = new Hang[n];
        for (int i = 0; i < n; i++){
            x[i] = new Hang();
            x[i].Nhap();
        }

    }

    public void Xuat(){
        System.out.println("Ma phieu: " + MaPhieu);
        System.out.println("So n: " + n);
        for (int i = 0; i < n; i++){
            x[i].Xuat();
        }
    }
}
