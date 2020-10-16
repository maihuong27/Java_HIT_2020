package Lesson3;
import java.util.Scanner;

public class Hang {
    private int Mahang;
    private String Tenhang;
    private int Dongia;

    public Hang() {
    }

    public Hang(int mahang, String tenhang, int dongia) {
        Mahang = mahang;
        Tenhang = tenhang;
        Dongia = dongia;
    }

    public int getMahang() {
        return Mahang;
    }

    public void setMahang(int mahang) {
        Mahang = mahang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String tenhang) {
        Tenhang = tenhang;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int dongia) {
        Dongia = dongia;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        Mahang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten hang: ");
        Tenhang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        Dongia = sc.nextInt();
    }

    public void Xuat(){
        System.out.println("Ma hang: " + Mahang + "\nTen hang: " + Tenhang + "\nDon gia: " + Dongia);
    }
}
