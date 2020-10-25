package Bai3;
import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int thang;
    private int nam;

    public DateTime() {
    }

    public DateTime(int ngay, int thang, int nam) {
        ngay = ngay;
        thang = thang;
        nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        nam = nam;
    }

    public void inputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }

    public void outputDate(){
        System.out.println("Ngay: " + this.ngay);
        System.out.println("Thang: " + this.thang);
        System.out.println("Nam: " + this.nam);
    }

}
