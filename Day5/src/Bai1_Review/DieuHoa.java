package Bai1_Review;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private int congSuat;
    private long giaBan;

    public DieuHoa() {
    }

    public DieuHoa(int maSanPham, String tenSanPham, String tenHangSX, String ngayNhap, int congSuat, long giaBan) {
        super(maSanPham, tenSanPham, tenHangSX, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao cong xuat: ");
        congSuat = sc.nextInt();
        System.out.print("Nhap vao gia ban: ");
        giaBan = sc.nextLong();
    }

    public void Xuat(){
        super.Xuat();
        System.out.println("Cong suat: " + congSuat);
        System.out.println("Gia ban: " + giaBan);
    }

    @Override
    public String toString() {
        return "DieuHoa{" + super.toString() +
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }
}
