package Demo;
import java.util.Scanner;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private Date ngaySinh;

    public void InputInFor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap MSV: ");
        maSinhVien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        ngaySinh = new Date();
        ngaySinh.Input();
    }

    public SinhVien(int maSinhVien, String hoTen, Date ngaySinh){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public SinhVien(){

    }

    public int getMaSingVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void hienThi(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma sinh vien: " + maSinhVien);
        ngaySinh.HienThi();

    }

    public void stt(int stt){
        System.out.println("STT: " + stt);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma sinh vien: " + maSinhVien);
    }

}
