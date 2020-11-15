package Bai2_Review;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        SoPhuc b = new SoPhuc();

        a.Nhap();
        b.Nhap();

        //System.out.println("Cong hai so phuc: ");
        SoPhuc t = a.Cong(b);
        t.Xuat();
        SoPhuc y = a.Tru(b);
        y.Xuat();
        //System.out.println("Tru");
    }
}
