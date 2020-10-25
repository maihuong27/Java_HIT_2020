package keThua;
import java.util.Scanner;

public class SinhVien extends Person{
    private double diem;

    public SinhVien(String name, int age, String dob, double diem) {
        super(name, age, dob);
        this.diem = diem;
    }

    public SinhVien() {
    }

    //public SinhVien(double v, String elsa, int i, String s) {
   // }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {

        return "SinhVien{" + super.toString() +
                "diem=" + diem +
                '}';
    }

    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem: ");
        diem = sc.nextInt();
    }
}
