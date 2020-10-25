package Bai5;
import java.util.Scanner;

public class LopHoc {
    private int maLopHoc;
    private String tenLopHoc;
    private String ngayMo;
    SinhVien[] x;
    private int n;
    private String giaoVien;

    public LopHoc() {
    }

    public LopHoc(int maLopHoc, String tenLopHoc, String ngayMo, SinhVien[] x, int n, String giaoVien) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.ngayMo = ngayMo;
        this.x = x;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public int getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(int maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public SinhVien[] getX() {
        return x;
    }

    public void setX(SinhVien[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public void inputLopHoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma lop hoc: ");
        maLopHoc = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vao ten lop hoc: ");
        tenLopHoc = sc.nextLine();
        System.out.print("Nhap vao ngay mo: ");
        ngayMo = sc.nextLine();
        System.out.print("Nhap vao so sinh vien: ");
        n = sc.nextInt();
        x = new SinhVien[n];
        for (int i = 0; i < n; i++){
            x[i] = new SinhVien();
            x[i].inputSV();
        }
        sc.nextLine();
        System.out.print("Nhap vao ten giao vien: ");
        giaoVien = sc.nextLine();
    }

    public void outputLopHoc(){
        System.out.println("Ma lop: " + maLopHoc);
        System.out.println("Ten lop: " + tenLopHoc);
        System.out.println("Ngay mo: " + ngayMo);
        System.out.println("So sinh vien: " + n);

        for (int i = 0; i < n; i++){
            x[i].outputSV();
        }
        System.out.println("Giao vien: " + giaoVien);
    }

    public int k14(){
        int dem = 0;
        for (int i = 0; i < n; i++){
            if (x[i].getKhoaHoc() == 14) dem++;
        }
        return dem;
    }

    public void sapXep(){
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (x[j].getKhoaHoc() < x[min].getKhoaHoc()) min = j;
            }
            SinhVien tmp = x[i];
            x[i] = x[min];
            x[min] = tmp;
        }
    }
}
