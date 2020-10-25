package Bai5;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void inputNguoi(){
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        System.out.print("Nhap vao ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap vao ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap vao que quan: ");
        queQuan = sc.nextLine();
    }

    public void outputNguoi(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Que quan: " + queQuan);
    }
}
