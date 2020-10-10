package Lesson3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa(123, "Sach", 100000, 5);
        HangHoa h2 = new HangHoa();
        h2.setMaHang(456);
        h2.setTenHang("May Tinh");
        h2.setDonGia(20000000);
        h2.setSoLuong(1);
        h1.Xuat();
        System.out.println("\n");
        h2.Xuat();
    }
}
