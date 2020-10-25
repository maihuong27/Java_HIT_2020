package Bai1;
import java.util.Scanner;

public class DieuHoa extends SanPham{
    private int congSuat;
    private long giaBan;

    public DieuHoa() {
    }

    public DieuHoa(int maSanPham, String tenSanPham, String tenHang, String ngayNhap, int congSuat, long giaBan) {
        super(maSanPham, tenSanPham, tenHang, ngayNhap);
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

    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao cong suat: ");
        congSuat = sc.nextInt();
        //sc.nextLine();
        System.out.println("Nhap vao gia ban: ");
        giaBan = sc.nextInt();
    }

    public void Output() {
        super.Output();
        System.out.println("Cong suat: " + congSuat);
        System.out.println("Gia ban: " + congSuat);
    }

    @Override
    public String toString() {
        return "DieuHoa{" + super.toString() +
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }
}
