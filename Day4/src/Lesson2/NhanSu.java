package Lesson2;
import java.util.Scanner;

public class NhanSu {
    private int maNhanSu;
    private String hoTen;
    Date NS = new Date();

    public NhanSu() {
    }

    public int getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(int maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNS() {
        return NS;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan su: ");
        maNhanSu = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        NS.Nhap();
    }

    public void Xuat() {
        System.out.println("Ma nhan su: " + maNhanSu);
        System.out.println("Ho ten: " + hoTen);
        NS.Xuat();
    }
}
