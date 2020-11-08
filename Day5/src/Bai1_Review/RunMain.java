package Bai1_Review;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        String str;
        System.out.println("Nhap vao mot chuoi: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        int tich = 1, dem = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)>= '0' && str.charAt(i) <= '9') {
                tich *= (int) str.charAt(i) - 48;
                dem++;
            }
        }
        System.out.println(tich);
        System.out.println(dem);
    }

}
