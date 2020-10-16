package Lesson1;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Sach[] Book;
        int n;
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Book = new Sach[n];
        for (int i = 0; i < n; i++) {
            Book[i] = new Sach();
            Book[i].Nhap();
        }

        for (int i = 0; i < n; i++) Book[i].Xuat();
    }
}
