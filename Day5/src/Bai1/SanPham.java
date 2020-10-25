package Bai1;
import java.util.Scanner;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private String tenHang;
    private String ngayNhap;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, String tenHang, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHang = tenHang;
        this.ngayNhap = ngayNhap;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        maSanPham = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        //sc.nextLine();
        System.out.println("Nhap ten hang san xuat: ");
        tenHang = sc.nextLine();
        //sc.nextLine();
        System.out.println("Nhap ngay nhap: ");
        ngayNhap = sc.nextLine();
    }

    public void Output() {
        System.out.println("ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Ten hang san xuat: " + tenHang);
        System.out.println("Ngay nhap: " + ngayNhap);
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }
}
