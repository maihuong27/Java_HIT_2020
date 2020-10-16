package Demo;
import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        day = sc.nextInt();
        System.out.println("Nhap thang: ");
        month = sc.nextInt();
        System.out.println("Nhap nam: ");
        year = sc.nextInt();
    }

    public void HienThi(){
        System.out.println("Ngay: " + day + ", thang: " + month + ", nam: " + year);
    }
}
