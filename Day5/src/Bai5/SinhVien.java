package Bai5;
import java.util.Scanner;

public class SinhVien extends Nguoi{
    private int maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien(int maSV, String nganh, int khoaHoc, String hoTen, String ngaySinh, String queQuan){
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien(){
    }


    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public void inputSV(){
        super.inputNguoi();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao MSV: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ten nganh: ");
        nganh = sc.nextLine();
        System.out.print("Nhap vao khoa hoc: ");
        khoaHoc = sc.nextInt();
    }

    public void outputSV(){
        super.outputNguoi();
        System.out.println("MSV: " + maSV);
        System.out.println("Nganh: " + nganh);
        System.out.println("Khoa hoc: " + khoaHoc);
    }

}
