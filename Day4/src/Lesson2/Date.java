package Lesson2;
import java.util.Scanner;

public class Date {
    private int D;
    private int M;
    private int Y;

    public Date() {
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        D = sc.nextInt();
        System.out.print("Nhap thang: ");
        M = sc.nextInt();
        System.out.print("Nhap nam: ");
        Y = sc.nextInt();
    }

    public void Xuat(){
        System.out.println("Ngay: " + D + ", Thang: " + M + " , Nam: " + Y);
    }
}
