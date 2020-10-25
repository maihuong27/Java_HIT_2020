package Bai2;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double thuc = sc.nextDouble();
        double ao = sc.nextDouble();
        SoPhuc x1 = new SoPhuc(thuc, ao);
        thuc = sc.nextDouble();
        ao = sc.nextDouble();
        SoPhuc x2 = new SoPhuc(thuc, ao);
        SoPhuc x = x1.Cong(x2);
        SoPhuc y = x1.Tru(x2);
        System.out.println(x.getSoThuc() + " + " + x.getSoAo() + "i");
        System.out.println(y.getSoThuc() + " + " + y.getSoAo() + "i");
    }
}
