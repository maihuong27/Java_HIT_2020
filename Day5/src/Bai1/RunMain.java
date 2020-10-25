package Bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int  n;
        System.out.println("Nhap vao so dieu hoa: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<DieuHoa> list = new ArrayList<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            DieuHoa k = new DieuHoa();
            k.Input();
            list.add(k);
        }

        boolean check = false;
        long minGia = list.get(0).getGiaBan();
        for (int i = 0; i < n; i++) {
            if (list.get(i).getTenHang().compareTo("Elextrolux") == 0 && list.get(i).getGiaBan() < minGia) {
                minGia = list.get(i).getGiaBan();
                check = true;
            }
        }
        if (check == true) {
                for (int i = 0; i < n; i++) {
                    if (list.get(i).getGiaBan() == minGia && list.get(i).getTenHang().compareTo("Elextrolux") == 0) {
                        System.out.println(list.get(i).toString());
                    }
                }
        } else {
            System.out.println("Khong ton tai");
        }
    }

}
