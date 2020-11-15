package Bai1_Review;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap vao so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<DieuHoa> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            DieuHoa k = new DieuHoa();
            k.Nhap();
            list.add(k);
        }

        long min = -1;
        for (int i = 0; i < n; i++) {
            if (list.get(i).getTenHangSX().compareTo("Elextrolux") == 0)
            {
                min = list.get(i).getGiaBan();
                break;
            }
        }

        if (min == -1) {
            System.out.println("Khong ton tai san pham thoa man yeu cau: ");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (list.get(i).getTenHangSX().compareTo("Elextrolux") == 0 && list.get(i).getGiaBan() < min)
                min = list.get(i).getGiaBan();
        }

        for (int i = 0; i < n; i++) {
            if (list.get(i).getTenHangSX().compareTo("Elextrolux") == 0 && list.get(i).getGiaBan() == min)
            {
                list.get(i).Xuat();
            }
        }
    }
}
