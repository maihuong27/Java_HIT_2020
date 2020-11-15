package Bai2_Review;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc Cong(SoPhuc x) {
        SoPhuc z = new SoPhuc();
        z.setPhanThuc(this.phanThuc + x.phanThuc);
        z.setPhanAo(this.phanAo + x.phanAo);
        return z;
    }

    public SoPhuc Tru(SoPhuc x) {
        SoPhuc z = new SoPhuc();
        z.setPhanThuc(this.phanThuc - x.phanThuc);
        z.setPhanAo(this.phanAo - x.phanAo);
        return z;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao phan thuc: ");
        phanThuc = sc.nextDouble();
        System.out.print("Nhap vao phan ao: ");
        phanAo = sc.nextDouble();
    }

    public void Xuat() {
        System.out.println("So phuc sau khi tinh: " + phanThuc + " + " + phanAo + "i");
    }
}
